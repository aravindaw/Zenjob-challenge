package com.aravinda.app.scripts;

import com.aravinda.app.context.RegisterNewCustomerContext;
import com.aravinda.app.context.UserLoginTestContext;
import com.aravinda.app.documents.RegisterNewCustomerDocument;
import com.aravinda.app.documents.UserLoginTestDocument;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * TEST CASE : UITC_2_UserLoginTest
 * DESCRIPTION : Login with newly created user
 * SOFT DEPENDENCY : N/A
 * HARD DEPENDENCY : N/A
 */

public class UITC_2_UserLoginTest extends StartDriver {

    @Test
    public void userLoginTest() throws InterruptedException {
        UserLoginTestContext context = new UserLoginTestContext();

        context.setEmail("testuser@gmail.com");
        context.setPaassword("Test@123");

        UserLoginTestDocument userLoginTestDocument = new UserLoginTestDocument(context);
        userLoginTestDocument.login();
    }

}
