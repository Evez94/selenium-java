package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.SwitchToUtility.*;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage{
    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton(){
        scrollToElementJS(newWindowButton);
        click(newWindowButton);
    }

    public void switchToNewWindow(){
        // Step 1 : Get The Current "Main" Window Handle
            String currentHandle = driver.getWindowHandle();
            System.out.println("Main Window ID :" +currentHandle + "\n");

        // Step 2 : Get All Window Handels
        Set<String> allHandels = driver.getWindowHandles();
        System.out.println("# of Open Windows :" +allHandels.size() + "\n");

        for(String handle:allHandels){
            if(currentHandle.equals(handle)){
                System.out.println("1st Window ID:" +handle);
            } else {
               // driver.switchTo().window(handle);
                switchToWindow(handle);
                System.out.println("2nd Windows :" +handle);
            }
        }

        // Step 3 : Switch To The New Window Using The Window Handle

    }
}
