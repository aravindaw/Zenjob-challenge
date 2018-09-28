package com.aravinda.app.documents;

import com.aravinda.app.Pages.TravelPage;
import com.aravinda.app.Pages.UserAccountPage;
import com.aravinda.app.context.SearchInTravelSectionTestContext;
import com.aravinda.app.scripts.StartDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SearchInTravelSectionTestDocument extends StartDriver {
    private final SearchInTravelSectionTestContext context;
    private final static Logger logger = Logger.getLogger(SearchInTravelSectionTestDocument.class);


    public SearchInTravelSectionTestDocument(SearchInTravelSectionTestContext context) {
        this.context = context;
    }

    public void search() throws InterruptedException {
        UserAccountPage userAccountPage = PageFactory.initElements(driver, UserAccountPage.class);
        TravelPage travelPage = PageFactory.initElements(driver, TravelPage.class);
        userAccountPage.clickReiseLink();
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[contains(text(),'erweiterte Suche')]")).click();
        } catch (Exception e) {
            logger.info("No popup displayed");
        }

        travelPage.reisezielOderHotel.click();
        travelPage.reisezielOderHotel.sendKeys(context.getDestination());
        Thread.sleep(1000);
        travelPage.reisezielOderHotel.sendKeys(Keys.ENTER);

        travelPage.abflughafen.click();
        travelPage.abflughafen.sendKeys(context.getDeparture());
        Thread.sleep(1000);
        travelPage.abflughafen.sendKeys(Keys.ENTER);

        travelPage.frhesteHinreise.clear();
        travelPage.setFrhesteHinreiseTextField(context.getArrivalDate());
        travelPage.sptesteRckreise.clear();
        travelPage.setSptesteRckreiseTextField(context.getReturnDate());
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='c24-travel-travel-duration-element']")));
        dropdown.selectByValue("exact");
        travelPage.clickReiseFindenButton();
        String value = driver.findElement(By.xpath("//span[contains(@class,'js-deferred-count')and contains(@class ,'deferred-count')][1]")).getText();
        int result = Integer.parseInt(value);
        Assert.assertTrue(result > 0);
        Assert.assertEquals(driver.getTitle(), "Hotels zu Ihrer Suche | CHECK24 Reise");
    }
}
