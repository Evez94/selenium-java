package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard(){

        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Evez Aslanov");
        textBoxPage.setEmail("evez.aslanov.94@gmail.com");
        textBoxPage.setCurentAdress("Abseron rayonu Masazir Qesebesi");
        textBoxPage.setCurentAdress("Masazir Eliaga Vahid kuc. 286");
        textBoxPage.setCurentAdress("Qesr MTK, C Blok Menzil 125");
        textBoxPage.clickSubmitButton();
        String actualResult = textBoxPage.getCurrentAdressResult();
        Assert.assertTrue(actualResult.contains("Qesr MTK, C Blok Menzil 125"),
                "\n Actual Adress  Do Not Contain 'Qesr MTK'  \n");


    }
}
