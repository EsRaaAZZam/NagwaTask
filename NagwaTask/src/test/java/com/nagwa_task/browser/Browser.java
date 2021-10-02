package com.nagwa_task.browser;

import com.nagwa_task.pages.*;

public class Browser {

    public HomePage homePage;
    public SelectLangPage landingPage ;
    public SearchResultsPage searchResultsPage;
    public LessonWorksheetPage lessonWorksheetPage;
    public QuestionPage questionPage;



    public Browser() {
        homePage = new HomePage();
        landingPage=new SelectLangPage();
        searchResultsPage= new SearchResultsPage();
        lessonWorksheetPage= new LessonWorksheetPage();
        questionPage= new QuestionPage();
    }
}
