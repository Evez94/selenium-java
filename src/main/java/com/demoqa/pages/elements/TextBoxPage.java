package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.*;
import static utilities.ActionsUtility.*;
import static utilities.WaitUtility.*;

public class TextBoxPage extends ElementsPage{
    private By fullNameField = By.id("userName");
    private By curentAdressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAdressResult= By.xpath("//div[@id='output']//p[@id='currentAddress']");



    public void setFullName(String name){
        scrollToElementJS(fullNameField);
    //        Actions act = new Actions(driver);
    //        act.sendKeys(find(fullNameField), Keys.chord(name)).perform();
        sendKeys(find(fullNameField), Keys.chord(name));

    }

    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB,email));

    }

    public void setCurentAdress(String adress){
        find(curentAdressField).sendKeys(adress+Keys.ENTER);
    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public String getCurrentAdressResult(){
        explicitWaitUntilVisible(5,currentAdressResult);
        return getText(currentAdressResult);
    }
}
