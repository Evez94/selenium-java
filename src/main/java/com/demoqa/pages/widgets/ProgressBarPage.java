package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.*;
import static utilities.WaitUtility.*;

public class ProgressBarPage extends WidgetsPage{
    private By startStopButton = By.id("startStopButton");
    private By progressBarValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow= '100']");

    public String progressBarValue(){
        fluentWaitUntilVisible(30,progressBarValue);
        return getText(progressBarValue);
//       System.out.println("Progress value :" + progressvalue);
    }

    public void clickStartButton(){
        scrollToElementJS(startStopButton);
        click(startStopButton);
    }
}
