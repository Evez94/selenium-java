package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private String iFrameSmallBox = "frame";
        private By headerFramesText= By.xpath("//div[@id='app']//h1[text()='Frames']");

    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }

    private void switchToBigBox(){
//        driver.switchTo().frame(iFrameBigBox);
        switchToFramesString(iFrameBigBox);
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
//        driver.switchTo().defaultContent();
        switchToDefaultContent();
        return bigFrameText;
    }

    // switch to frame using index

    private void switchToSmallBox(){
        switchToFramesIndex(3);
    }

    public String getTextInSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text:" + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
