package com.nagwa_task.pages;

import com.nagwa_task.driver.WebDriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(xpath="/html/body/div[2]/div/div/div/main/div[3]")
    private List<WebElement> listLessonsSearchResult;

    public List<WebElement> getListLessonsSearchResult() {;
        return listLessonsSearchResult;
    }

    public int getListOfLessons(String value){
        String name = null;
        int flag=0;
        List<WebElement> listoflessons = getListLessonsSearchResult();
        int count = listoflessons.size();
        for (WebElement webElement : listoflessons) {
            name = webElement.getText();
            System.out.println(name);
            if(name.contains(value)){
                flag++;
            }

        }
        return flag;
    }
    public void clickOnLesson(int index){
        WebDriverHandler.getWebDriver().findElement(By.xpath("//ul[@class='list']/li["+index+"]/div/a")).click();


    }
}
