package com.nagwa_task.pages;

import java.util.List;

import com.nagwa_task.driver.WebDriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


	@FindBy(xpath="//button[@type='button']")
	private WebElement btnSearch;

	@FindBy(id="txt_search_query")
	private WebElement textBoxSearch ;

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTextBoxSearch() {
		return textBoxSearch;
	}
	public void writeLessonName(String lessonName){
		textBoxSearch.sendKeys(lessonName);
		textBoxSearch.sendKeys(Keys.ENTER);

	}
	public void clickOnSearchButton(){
		getBtnSearch().click();
	}


}
