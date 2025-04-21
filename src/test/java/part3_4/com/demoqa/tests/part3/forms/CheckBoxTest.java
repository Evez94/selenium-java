package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {
    @Test

    public void testCheckBox(){
          var formPage = homePage.goToForms().clickPracticeForm();
          formPage.clickSportsCheckbox();
          formPage.clickReadingCheckbox();
          formPage.clickMusicCheckbox();
          formPage.unclickReadingCheckbox();

          boolean isReadingCheckboxSelected= formPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected,"" +
                "\n Reading Checkbox is Selected \n");
    }
}
