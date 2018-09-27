package com.aravinda.app.documents;

import com.aravinda.app.Pages.FrontPage;
import com.aravinda.app.Pages.SigninPage;
import com.aravinda.app.Pages.UserAccountPage;
import com.aravinda.app.Pages.UserRegistrationPage;
import com.aravinda.app.context.RegisterNewCustomerContext;
import com.aravinda.app.scripts.StartDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterNewCustomerDocument extends StartDriver {
    private final RegisterNewCustomerContext context;
    private final static Logger logger = Logger.getLogger(RegisterNewCustomerDocument.class);


    public RegisterNewCustomerDocument(RegisterNewCustomerContext context) {
        this.context = context;
    }

    public void registerNewCustomer() throws InterruptedException {
        FrontPage frontPage = PageFactory.initElements(driver, FrontPage.class);
        SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
        UserRegistrationPage userRegistrationPage = PageFactory.initElements(driver, UserRegistrationPage.class);
        UserAccountPage userAccountPage = PageFactory.initElements(driver, UserAccountPage.class);

        frontPage.clickSignInLink();
        signinPage.clickStartenSieHier3Link();
        userRegistrationPage.setEmailadresseTextField(context.getNewEmail());
        userRegistrationPage.setPasswortAuswhlen4PasswordField(context.getNewPassword());
        userRegistrationPage.setPasswortWiederholenPasswordField(context.getNewPassword());
        userRegistrationPage.clickJetztRegistrieren2Button();

        try {
            userAccountPage.clickSchliessen1Button();
        } catch (Exception e) {
            logger.info("No popup messages");
        }

        Thread.sleep(10000);
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Sie sind angemeldet als " + context.getNewEmail() + "')]")).isDisplayed());
    }
}
