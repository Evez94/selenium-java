package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test

    public void testModalDialog(){
        var modalDialogsPage = homePage.goToAlertsFrameWindowsCard().clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"),
                "\n The message Dos Not Contain 'small modal' \n");
        modalDialogsPage.clickCloseButton();

    }
}
