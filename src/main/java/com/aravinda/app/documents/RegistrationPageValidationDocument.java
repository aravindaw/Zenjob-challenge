package com.aravinda.app.documents;

import com.aravinda.app.Pages.FrontPage;
import com.aravinda.app.Pages.SigninPage;
import com.aravinda.app.Pages.UserRegistrationPage;
import com.aravinda.app.context.RegisterNewCustomerContext;
import com.aravinda.app.scripts.StartDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPageValidationDocument extends StartDriver {
    private final RegisterNewCustomerContext context;

    public RegistrationPageValidationDocument(RegisterNewCustomerContext context) {
        this.context = context;
    }

    public void registerNewCustomerWithInvalidData() {
        FrontPage frontPage = PageFactory.initElements(driver, FrontPage.class);
        SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
        UserRegistrationPage userRegistrationPage = PageFactory.initElements(driver, UserRegistrationPage.class);

        frontPage.clickSignInLink();
        signinPage.clickStartenSieHier3Link();
        userRegistrationPage.setEmailadresseTextField(context.getNewEmail());
        userRegistrationPage.setPasswortAuswhlen4PasswordField(context.getNewPassword());
        userRegistrationPage.setPasswortWiederholenPasswordField("mismatchedpassword");
        userRegistrationPage.clickJetztRegistrieren2Button();
        WebElement errorMessage1 = driver.findElement(By.xpath("//*[@id='register']/div[2]/div[3]/div"));
        Assert.assertEquals(errorMessage1.getText(), "Ungültige E-Mail-Adresse.");
        WebElement errorMessage2 = driver.findElement(By.xpath("//*[@id='register']/div[4]/div[2]/div[1]"));
        Assert.assertEquals(errorMessage2.getText(), "Die Passwörter stimmen nicht überein.");
    }
}
