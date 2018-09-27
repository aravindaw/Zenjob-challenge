package com.aravinda.app.scripts;

import com.aravinda.app.context.SearchInTravelSectionTestContext;
import com.aravinda.app.documents.SearchInTravelSectionTestDocument;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * TEST CASE : UITC_2_UserLoginTest
 * DESCRIPTION : Login with newly created user
 * SOFT DEPENDENCY : N/A
 * HARD DEPENDENCY : UITC_2_UserLoginTest
 */
public class UITC_3_SearchInTravelSectionTest extends StartDriver {

    @BeforeTest
    public void login() throws InterruptedException {
        new UITC_2_UserLoginTest().userLoginTest();
    }

    @Test
    public void userLoginTest() throws InterruptedException {
        SearchInTravelSectionTestContext context = new SearchInTravelSectionTestContext();

        context.setDestination("Berlin");
        context.setDeparture("Hamburg");

        context.setArrivalDate("21102018");
        context.setReturnDate("25102018");

        SearchInTravelSectionTestDocument searchInTravelSectionTest = new SearchInTravelSectionTestDocument(context);
        searchInTravelSectionTest.search();
    }
}
