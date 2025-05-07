package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test

    public void testWebTable() {
        var webTablePage = homePage.goToElemnts().clickWebTables();
        String email = "kierra@example.com";
        String expectedAge = "34";

        webTablePage.clickEdit(email);
        webTablePage.setAge("34");
        webTablePage.clickSubmitButton();
        String actualAge=  webTablePage.getTableage(email);
        Assert.assertEquals(actualAge,expectedAge,
                "\n Actual & Expected ages Do Not Match \n"
                );


    }




}
