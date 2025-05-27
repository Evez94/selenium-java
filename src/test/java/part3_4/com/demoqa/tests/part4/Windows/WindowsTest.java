package part3_4.com.demoqa.tests.part4.Windows;

import org.testng.Assert;
import org.testng.annotations.Test;
import static utilities.GetUtility.*;
import part3_4.com.demoqa.base.BaseTest;

public class WindowsTest extends BaseTest {
    @Test

    public void testNewWindowUrl(){
        var windowsPage = homePage.goToAlertsFrameWindowsCard().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualUrl = getURL();
        String expectedURl = "https://demoqa.com/sample";
        Assert.assertEquals(actualUrl,expectedURl,
                "\n Actual & Expected Url Do Not Match \n");
    }
}
