package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage{
    private By notFoundLink = By.id("invalid-url");
    private By responseLink = By.id("linkResponse");

    public void  clickNotFoundLink(){
        scrollToElementJS(notFoundLink);
        click(notFoundLink);
    }

    public String getResponse(){
        delay(2000);
        return find(responseLink).getText();
    }
}
