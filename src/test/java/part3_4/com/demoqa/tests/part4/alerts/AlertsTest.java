package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFrameWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(),expectedAlertText,
                "\n Actual & Expected Message Fo Not Match \n");
        acceptAlert();
    }

    public void testConfirmationAlertButton(){
        var alertsPage = homePage.goToAlertsFrameWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismisAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        String expectedConfirmationResult = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult,expectedConfirmationResult,
                "\n You Did Not Select Cancel \n");

    }


    public void testPromptAlertButton(){
        String alertText = "Selenium With Java";
        String expectedResult = "You entered " + alertText;

        var alertPage = homePage.goToAlertsFrameWindowsCard().clickAlerts();
        alertPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertPage.getPromptAlertResult();
        Assert.assertEquals(actualResult,expectedResult,
                "\n Actual & Expected Result do Not Match \n");

    }

}
