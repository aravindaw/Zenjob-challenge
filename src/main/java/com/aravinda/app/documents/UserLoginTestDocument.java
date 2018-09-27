package com.aravinda.app.documents;

import com.aravinda.app.Pages.FrontPage;
import com.aravinda.app.Pages.SigninPage;
import com.aravinda.app.Pages.UserAccountPage;
import com.aravinda.app.context.UserLoginTestContext;
import com.aravinda.app.scripts.StartDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserLoginTestDocument extends StartDriver {
    private final UserLoginTestContext context;
    private final static Logger logger = Logger.getLogger(RegisterNewCustomerDocument.class);

    public UserLoginTestDocument(UserLoginTestContext context) {
        this.context = context;
    }

    public void login() {
        FrontPage frontPage = PageFactory.initElements(driver, FrontPage.class);
        SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
        UserAccountPage userAccountPage = PageFactory.initElements(driver, UserAccountPage.class);

        frontPage.clickSignInLink();
        signinPage.setMeineEmailadresseIstEmailField(context.getEmail());
        signinPage.setMeinCheck24PasswortIst4PasswordField(context.getPaassword());
        signinPage.clickAnmelden3Button();
        try {
            userAccountPage.clickSchliessen1Button();
        } catch (Exception e) {
            logger.info("No popup messages");
        }
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Sie sind angemeldet als " + context.getEmail() + "')]")).isDisplayed());

    }
}
