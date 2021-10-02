package com.nagwa_task.tests.countQuestions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/nagwa_task/tests/countQuestions",
        glue = {"com.nagwa_task.tests"},
        plugin = {"html:reports/countQuestions-Report.html"},
        monochrome = true
)
public class CountQuesRunner extends AbstractTestNGCucumberTests {
}
