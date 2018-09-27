package com.aravinda.app.scripts;

import com.aravinda.app.context.RegisterNewCustomerContext;
import com.aravinda.app.documents.RegisterNewCustomerDocument;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * TEST CASE : UITC_1_RegisterNewCustomer
 * DESCRIPTION : Create new user
 * SOFT DEPENDENCY : N/A
 * HARD DEPENDENCY : N/A
 */

public class UITC_1_RegisterNewCustomer extends StartDriver {

    @Test
    public void registerNewCustomer() {
        RegisterNewCustomerContext context = new RegisterNewCustomerContext();

        Random rand = new Random();
        int num = rand.nextInt(99999) + 1000;

        context.setNewEmail("testuser" + num + "@gmail.com");
        context.setNewPassword("Test@123");

        RegisterNewCustomerDocument registerNewCustomerDocument = new RegisterNewCustomerDocument(context);
        registerNewCustomerDocument.registerNewCustomer();
    }

}
