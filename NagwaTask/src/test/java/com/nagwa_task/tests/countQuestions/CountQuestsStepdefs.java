package com.nagwa_task.tests.countQuestions;

import com.nagwa_task.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class CountQuestsStepdefs extends BaseTest {


    @Given("user Choose a language to open the home page.")
    public void userChooseALanguageToOpenTheHomePage() {
        browser.landingPage.clickEnglishLanguageBtn();

    }

    @Then("Use the search icon to start searching on Nagwa lessons.")
    public void useTheSearchIconToStartSearchingOnNagwaLessons() {
    }

    @Then("Go to worksheet section then click preview button.")
    public void goToWorksheetSectionThenClickPreviewButton() {
        browser.lessonWorksheetPage.clickOnPreviewQuestions();
    }

    @When("Click on {string}  lesson in the search results to open its home page.")
    public void clickOnLessonInTheSearchResultsToOpenItsHomePage(String arg0) {
        int numberofLessonInListOfLessons = Integer.parseInt(arg0);
        browser.searchResultsPage.clickOnLesson(numberofLessonInListOfLessons);

    }

    @Then("Write any lesson name for example {string} and click on search.")
    public void writeAnyLessonNameForExampleAndClickOnSearch(String arg0) {
        browser.homePage.clickOnSearchButton();
        browser.homePage.writeLessonName(arg0);
    }

    @Then("A list with all lessons in Nagwa that match this {string} will appear.")
    public void aListWithAllLessonsInNagwaThatMatchThisWillAppear(String arg0) {
        int count  =browser.searchResultsPage.getListOfLessons(arg0);
        Assert.assertNotEquals(count, 0);
    }

    @Then("Worksheet home page will open then count number of questions displayed")
    public void worksheetHomePageWillOpenThenCountNumberOfQuestionsDisplayed() throws IOException {
        int count = browser.questionPage.getNumberOfQuestions();
        System.out.println("Number of Question is " +count);
        browser.questionPage.saveCount();


    }
}
