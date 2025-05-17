package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {
    @Test
    public void testLinks(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickNotFoundLink();
        String actualResponse =  linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("404")
                         && actualResponse.contains("Not Found"),
                            "\n Actual Response (" + actualResponse +
                            ") \n Does Not Contain '404' and 'Not Found Request' \n");

    }
}
