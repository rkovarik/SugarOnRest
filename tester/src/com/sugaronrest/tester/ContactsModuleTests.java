package com.sugaronrest.tester;

import com.sugaronrest.*;
import com.sugaronrest.modules.Contacts;
import com.sugaronrest.tester.helpers.ContactsModule;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static com.sugaronrest.QueryOperator.Contains;
import static com.sugaronrest.QueryOperator.Equal;
import static org.junit.Assert.*;

/**
 * Created by kolao_000 on 2017-01-13.
 */
public class ContactsModuleTests {

    public static void crudTest() {
        SugarRestClient client = new SugarRestClient(TestAccount.Url, TestAccount.Username, TestAccount.Password);

        Contacts insertContact = ContactsModule.getTestContact();

        // -------------------Create Contact-------------------
        SugarRestResponse response = ContactsModule.createContact(client, insertContact);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        String insertId = (response.getData() == null) ? StringUtils.EMPTY : response.getData().toString();

        assertNotNull(insertId);
        assertNotSame(insertId, StringUtils.EMPTY );
        // -------------------End Create Contact-------------------


        // -------------------Read Contact-------------------
        response = ContactsModule.readContact(client, insertId);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        Contacts readOnCreateContact = (Contacts) response.getData();

        assertNotNull(readOnCreateContact);
        assertEquals(insertContact.getFirstName(), readOnCreateContact.getFirstName());
        assertEquals(insertContact.getLastName(), readOnCreateContact.getLastName());
        assertEquals(insertContact.getTitle(), readOnCreateContact.getTitle());
        assertEquals(insertContact.getPrimaryAddressPostalcode(), readOnCreateContact.getPrimaryAddressPostalcode());
        // -------------------End Read Contact-------------------


        // -------------------Update Contact-------------------
        response = ContactsModule.updateContact(client, readOnCreateContact.getId());

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        String updateId = (response.getData() == null) ? StringUtils.EMPTY : response.getData().toString();

        assertNotNull(updateId);
        assertNotSame(updateId, StringUtils.EMPTY );
        // -------------------End Update Contact-------------------


        // -------------------Read Contact-------------------
        response = ContactsModule.readContact(client, updateId);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        Contacts readOnUpdateContact = (Contacts) response.getData();

        assertNotNull(readOnUpdateContact.getTitle());
        assertNotSame(readOnUpdateContact.getTitle(), StringUtils.EMPTY );
        assertEquals(updateId, updateId);
        assertNotSame(readOnCreateContact.getTitle(), readOnUpdateContact.getTitle());
        // -------------------End Read Contact-------------------


        // -------------------Delete Contact-------------------
        response = ContactsModule.deleteContact(client, updateId);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);;

        String deleteId = (response.getData() == null) ? StringUtils.EMPTY : response.getData().toString();

        assertNotNull(deleteId);
        assertNotSame(deleteId, StringUtils.EMPTY );
        assertEquals(insertId, deleteId);
        // -------------------End Delete Contact-------------------
    }

    public static void bulkCRUDTest() {
        SugarRestClient client = new SugarRestClient(TestAccount.Url, TestAccount.Username, TestAccount.Password);
        List<Contacts> insertContacts = ContactsModule.getTestBulkContact();

        // -------------------Create Bulk Contact-------------------
        SugarRestResponse response = ContactsModule.bulkCreateContact(client, insertContacts);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        List<String> insertIds = (response.getData() == null) ? null : (List<String>)response.getData();

        assertNotNull(insertIds);
        assertEquals(insertContacts.size(), insertIds.size());

        for (String id : insertIds) {
            assertNotNull(id);
            assertNotSame(id, StringUtils.EMPTY );
        }
        // -------------------End Bulk Create Contact-------------------


        // -------------------Bulk Read Contact-------------------
        List<Contacts> readOnCreateContacts = ContactsModule.bulkReadContact2(client, insertIds);

        assertNotNull(readOnCreateContacts);
        assertEquals(insertIds.size(), readOnCreateContacts.size());

        for (Contacts contact : readOnCreateContacts) {
            assertNotNull(contact);
            assertNotNull(contact.getId());
            assertNotSame(contact.getId(), StringUtils.EMPTY );
        }
       // -------------------End Bulk Read Contact-------------------


        // -------------------Bulk Update Contact-------------------

        Map<String, String> contactAddressMap = new HashMap<String, String>();

        for (Contacts contact : readOnCreateContacts) {
            contactAddressMap.put(contact.getId(), contact.getPrimaryAddressPostalcode());
        }

        response = ContactsModule.bulkUpdateContact(client, readOnCreateContacts);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        List<String> updateIds = (response.getData() == null) ? null : (List<String>)response.getData();

        assertNotNull(updateIds);
        for (String id : updateIds) {
            assertNotNull(id);
            assertNotSame(id, StringUtils.EMPTY );
        }
        // -------------------End Bulk Update Contact-------------------


        // -------------------Bulk Read Contact-------------------
        List<Contacts> readOnUpdateContacts = ContactsModule.bulkReadContact2(client, updateIds);

        assertNotNull(readOnUpdateContacts);
        assertEquals(updateIds.size(), readOnUpdateContacts.size());

        for (Map.Entry<String, String> entry : contactAddressMap.entrySet()) {
            String key = entry.getKey();
            assertTrue(updateIds.contains(key));
        }
        // -------------------End Bulk Read Contact-------------------


        // -------------------Bulk Delete Contact-------------------
        List<String> deleteIds = ContactsModule.bulkDeleteContact(client, updateIds);

        assertNotNull(deleteIds);
        assertEquals(updateIds.size(), deleteIds.size());

        for (String id : updateIds) {
            assertTrue(deleteIds.contains(id));
        }
        // -------------------End Bulk Delete Contact-------------------
    }

    public static void crudByTypeTest() {
        SugarRestClient client = new SugarRestClient(TestAccount.Url, TestAccount.Username, TestAccount.Password);

        Contacts insertContact = ContactsModule.getTestContact();

        // -------------------Create Contact-------------------
        SugarRestResponse response = ContactsModule.createContactByType(client, insertContact);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        String insertId = (response.getData() == null) ? StringUtils.EMPTY : response.getData().toString();

        assertNotNull(insertId);
        assertNotSame(insertId, StringUtils.EMPTY );
        // -------------------End Create Contact-------------------


        // -------------------Read Contact-------------------
        response = ContactsModule.readContactByType(client, insertId);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        Contacts readOnCreateContact = (Contacts) response.getData();

        assertNotNull(readOnCreateContact);
        assertEquals(insertContact.getFirstName(), readOnCreateContact.getFirstName());
        assertEquals(insertContact.getLastName(), readOnCreateContact.getLastName());
        assertEquals(insertContact.getTitle(), readOnCreateContact.getTitle());
        assertEquals(insertContact.getPrimaryAddressPostalcode(), readOnCreateContact.getPrimaryAddressPostalcode());
        // -------------------End Read Contact-------------------


        // -------------------Update Contact-------------------
        response = ContactsModule.updateContact(client, readOnCreateContact.getId());

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        String updateId = (response.getData() == null) ? StringUtils.EMPTY : response.getData().toString();

        assertNotNull(updateId);
        assertNotSame(updateId, StringUtils.EMPTY );
        // -------------------End Update Contact-------------------


        // -------------------Read Contact-------------------
        response = ContactsModule.readContact(client, updateId);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        Contacts readOnUpdateContact = (Contacts) response.getData();

        assertNotNull(readOnUpdateContact.getTitle());
        assertNotSame(readOnUpdateContact.getTitle(), StringUtils.EMPTY );
        assertEquals(updateId, updateId);
        assertNotSame(readOnCreateContact.getTitle(), readOnUpdateContact.getTitle());
        // -------------------End Read Contact-------------------


        // -------------------Delete Contact-------------------
        response = ContactsModule.deleteContactByType(client, updateId);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);;

        String deleteId = (response.getData() == null) ? StringUtils.EMPTY : response.getData().toString();

        assertNotNull(deleteId);
        assertNotSame(deleteId, StringUtils.EMPTY );
        assertEquals(insertId, deleteId);
        // -------------------End Delete Contact-------------------
    }

    public static void readBulkTest() {
        SugarRestClient client = new SugarRestClient(TestAccount.Url, TestAccount.Username, TestAccount.Password);

        // -------------------Bulk Read Contact-------------------
        int count = 10;
        SugarRestResponse response = ContactsModule.bulkReadContact(client, count);

        assertNotNull(response);
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        List<Contacts> readContacts = (List<Contacts>) (response.getData());
        assertNotNull(readContacts);
        assertTrue(readContacts.size() <= count);
        // -------------------End Bulk Read Contact-------------------
    }
}
