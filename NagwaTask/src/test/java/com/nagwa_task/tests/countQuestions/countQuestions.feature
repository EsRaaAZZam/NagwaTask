Feature: Count Questions in Worksheet

  Scenario Outline: Count Question
    Given  user Choose a language to open the home page.
    When Use the search icon to start searching on Nagwa lessons.
    Then Write any lesson name for example "<Example>" and click on search.
    Then A list with all lessons in Nagwa that match this "<Example>" will appear.
    When Click on "<Index>"  lesson in the search results to open its home page.
    Then Go to worksheet section then click preview button.
    Then Worksheet home page will open then count number of questions displayed

    Examples:
      | Example  | Index |
      | addition |2      |