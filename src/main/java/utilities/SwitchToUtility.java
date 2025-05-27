package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility{

    private static WebDriver.TargetLocator switchTo(){
        return driver.switchTo();
    }

    public static String getAlertText(){
       return switchTo().alert().getText();
    }

    // accept() automaticly clik the ok button
    public static void acceptAlert(){
        switchTo().alert().accept();
    }

    public static void dismisAlert(){
        switchTo().alert().dismiss();
    }

    public static void setAlertText(String text){
        switchTo().alert().sendKeys(text);
    }

    // switch To Frames Using Stiring
    public static void  switchToFramesString(String value){
        switchTo().frame(value);
    }
    public static void switchToDefaultContent(){
        switchTo().defaultContent();
    }

    // switch To Frames Using Index
    public static void switchToFramesIndex(int index){
        switchTo().frame(index);
    }

    //
    public static void switchToWindow(String handle){
        switchTo().window(handle);
    }


}
