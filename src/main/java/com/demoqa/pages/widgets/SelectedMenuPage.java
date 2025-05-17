package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class SelectedMenuPage extends WidgetsPage{
    private By standartMultiSelect = By.id("cars");

    public void selectStandartMulti(String text){
        scrollToElementJS(standartMultiSelect);
//        Select select = new Select(find(standartMultiSelect));
//        select.deselectByVisibleText(text);
        selectByVisibleText(standartMultiSelect,text);
    }

    public void selectStandartMulti(int index){
        scrollToElementJS(standartMultiSelect);
        selectByIndex(standartMultiSelect,index);
    }

    public void deselectStandartMulti(String value){
        scrollToElementJS(standartMultiSelect);
        deselectByValue(standartMultiSelect,value);
    }


    public List<String> getAllSelectedStandardMultiOptions(){
        return getAllSelectedOptions(standartMultiSelect);
    }
}
