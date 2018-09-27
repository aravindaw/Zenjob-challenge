package com.aravinda.app.documents;

import com.aravinda.app.Pages.TravelPage;
import com.aravinda.app.Pages.UserAccountPage;
import com.aravinda.app.context.SearchInTravelSectionTestContext;
import com.aravinda.app.scripts.StartDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
            driver.findElement(By.xpath("//span[contains(text(),'erweiterte Suche')]")).click();
        } catch (Exception e) {
            System.out.println("#############################################");
            logger.info("No popup displayed");
        }

        travelPage.setReisezielOderHotelTextField(context.getDestination());
        travelPage.setAbflughafenTextField(context.getDeparture());
        travelPage.frhesteHinreise.clear();
        travelPage.setFrhesteHinreiseTextField(context.getArrivalDate());
        travelPage.sptesteRckreise.clear();
        travelPage.setSptesteRckreiseTextField(context.getReturnDate());

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='c24-travel-travel-duration-element']")));
        dropdown.selectByValue("exact");

        travelPage.clickReiseFindenButton();
        Thread.sleep(5000);


    }
}
