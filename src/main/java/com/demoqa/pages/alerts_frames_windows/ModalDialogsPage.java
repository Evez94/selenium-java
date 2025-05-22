package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage{
    private By smallModalButton = By.id("showSmallModal");
    private By smalModalText = By.xpath("//div[contains(text(),'small modal')]") ;
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModalButton(){
        scrollToElementJS(smallModalButton);
        click(smallModalButton);
    }

    public String getSmallModalText(){
        return find(smalModalText).getText();
    }

    public void clickCloseButton(){
        scrollToElementJS(closeButton);
        click(closeButton);
    }


}
