package com.aravinda.app.scripts;

import com.aravinda.app.context.RegisterNewCustomerContext;
import com.aravinda.app.documents.RegistrationPageValidationDocument;
import org.testng.annotations.Test;

/**
 * TEST CASE : UITC_4_RegistrationPageValidation
 * DESCRIPTION : Try to Create new user with invalid data and validate registration page
 * SOFT DEPENDENCY : N/A
 * HARD DEPENDENCY : N/A
 */

public class UITC_4_RegistrationPageValidation extends StartDriver {
    @Test
    public void registrationPageValidation() {
        RegisterNewCustomerContext context = new RegisterNewCustomerContext();

        context.setNewEmail("invalidmailaddress");
        context.setNewPassword("Test@123");

        RegistrationPageValidationDocument registrationPageValidationDocument = new RegistrationPageValidationDocument(context);
        registrationPageValidationDocument.registerNewCustomerWithInvalidData();
    }
}
