package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {

    @Test

    public void testSlider(){
        int x= 180;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x,y);
        String actualValue= sliderPage.getSliderValue();
        String expectedValue = "90";
        Assert.assertEquals(actualValue,expectedValue,
                "Actual & Expected Value Do Not Match");
    }
}
