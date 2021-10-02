package com.nagwa_task.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectLangPage extends BasePage {

	@FindBy(linkText ="ENGLISH")
	private WebElement btnEnglish;
	public WebElement getBtnEnglish() {return  btnEnglish;
	}
	public void clickEnglishLanguageBtn(){
		getBtnEnglish().click();
	}

}
