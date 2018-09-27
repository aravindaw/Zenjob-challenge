package com.aravinda.app.scripts;

import com.aravinda.app.context.RegisterNewCustomerContext;
import com.aravinda.app.documents.RegisterNewCustomerDocument;
import org.testng.annotations.Test;

import java.util.Random;

public class UITC_1_RegisterNewCustomer extends StartDriver {

    @Test
    public void accessAddressFormatterPage() throws InterruptedException {
        RegisterNewCustomerContext context = new RegisterNewCustomerContext();

        Random rand = new Random();
        int num = rand.nextInt(99999) + 1000;

        context.setNewEmail("testuser" + num + "@gamai.com");
        context.setNewPassword("Test@123");

        RegisterNewCustomerDocument address = new RegisterNewCustomerDocument(context);
        address.registerNewCustomer();
    }

}
