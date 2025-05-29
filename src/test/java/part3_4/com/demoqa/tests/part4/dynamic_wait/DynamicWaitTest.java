package part3_4.com.demoqa.tests.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DynamicWaitTest extends BaseTest {

    @Test

    public void testVisibleAfterButtonText(){
        var dynamicPage= homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText,expectedText,
                "Actual & Expected Text Do Not Match");
    }

    @Test

    public void testProgressBar(){
        var progressPage = homePage.goToWidgets().clickProgressBarMenu();
        progressPage.clickStartButton();
        String actualValue =progressPage.progressBarValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue,expectedValue,
                "\n Actual & Expected Value Do Not Match \n");
    }
}
