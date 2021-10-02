package com.nagwa_task.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LessonWorksheetPage  extends BasePage{
    @FindBy(xpath="//*[@id=\"WorksheetSection\"]/div/div[2]/div/a")
    private WebElement previewQuestions;


    public WebElement getLinkQuestions() {
        return previewQuestions;
    }
    public void clickOnPreviewQuestions(){
        getLinkQuestions().click();

    }
}
