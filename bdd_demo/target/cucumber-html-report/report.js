$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bdd_demo/EmployeeEligibilityfile.feature");
formatter.feature({
  "line": 2,
  "name": "Validation of plans and rates for an employee displayed correctly based on Benefits Group //Benefits Plans And Rates",
  "description": "",
  "id": "validation-of-plans-and-rates-for-an-employee-displayed-correctly-based-on-benefits-group-//benefits-plans-and-rates",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Correct plans and rates shown for an employee based on Benefits Group",
  "description": "",
  "id": "validation-of-plans-and-rates-for-an-employee-displayed-correctly-based-on-benefits-group-//benefits-plans-and-rates;correct-plans-and-rates-shown-for-an-employee-based-on-benefits-group",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on Home Page as Admin",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on People from the Menu bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Benefits from the list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Life Events",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"\u003cEmployee_ID\u003e\" in Employee ID field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on employee\u0027s last name hyperlink",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select Enroll on behalf of the employee",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter Emulation Date as current date on the Date field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on Report a Life Event",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select Admin Correction from the drop-down",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select current Date in the date field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Submit",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Submit Again",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Admin Correction link on Enrollments page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on Eligibility Summary link in My Links dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I should be able to see Eligibility Summary of the employee on a new web page",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "validation-of-plans-and-rates-for-an-employee-displayed-correctly-based-on-benefits-group-//benefits-plans-and-rates;correct-plans-and-rates-shown-for-an-employee-based-on-benefits-group;",
  "rows": [
    {
      "cells": [
        "Employee_ID"
      ],
      "line": 25,
      "id": "validation-of-plans-and-rates-for-an-employee-displayed-correctly-based-on-benefits-group-//benefits-plans-and-rates;correct-plans-and-rates-shown-for-an-employee-based-on-benefits-group;;1"
    },
    {
      "cells": [
        "74856"
      ],
      "line": 26,
      "id": "validation-of-plans-and-rates-for-an-employee-displayed-correctly-based-on-benefits-group-//benefits-plans-and-rates;correct-plans-and-rates-shown-for-an-employee-based-on-benefits-group;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Correct plans and rates shown for an employee based on Benefits Group",
  "description": "",
  "id": "validation-of-plans-and-rates-for-an-employee-displayed-correctly-based-on-benefits-group-//benefits-plans-and-rates;correct-plans-and-rates-shown-for-an-employee-based-on-benefits-group;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTest"
    },
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on Home Page as Admin",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on People from the Menu bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Benefits from the list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Life Events",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"74856\" in Employee ID field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on employee\u0027s last name hyperlink",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select Enroll on behalf of the employee",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter Emulation Date as current date on the Date field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on Report a Life Event",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select Admin Correction from the drop-down",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select current Date in the date field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Submit",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Submit Again",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Admin Correction link on Enrollments page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on Eligibility Summary link in My Links dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I should be able to see Eligibility Summary of the employee on a new web page",
  "keyword": "Then "
});
formatter.match({
  "location": "EligibilityStepDefinition.i_am_on_Home_Page_as_Admin()"
});
formatter.result({
  "duration": 49390855849,
  "status": "passed"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_People_from_the_Menu_bar()"
});
formatter.result({
  "duration": 120475295293,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.id: People_navItem_label (tried for 120 second(s) with 500 MILLISECONDS interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat bdd_demo.HomePage.click_PeopleMenu(HomePage.java:87)\r\n\tat bdd_demo.EligibilityStepDefinition.i_click_on_People_from_the_Menu_bar(EligibilityStepDefinition.java:56)\r\n\tat ✽.When I click on People from the Menu bar(bdd_demo/EmployeeEligibilityfile.feature:8)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.id: People_navItem_label\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027AJ001289\u0027, ip: \u002710.240.16.142\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:883)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:882)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat bdd_demo.HomePage.click_PeopleMenu(HomePage.java:87)\r\n\tat bdd_demo.EligibilityStepDefinition.i_click_on_People_from_the_Menu_bar(EligibilityStepDefinition.java:56)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_Benefits_from_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_Life_Events()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "74856",
      "offset": 9
    }
  ],
  "location": "EligibilityStepDefinition.i_enter_in_Employee_ID_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_employee_s_last_name_hyperlink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_select_Enroll_on_behalf_of_the_employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_enter_Emulation_Date_as_current_date_on_the_Date_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_Report_a_Life_Event()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_select_Admin_Correction_from_the_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_select_current_Date_in_the_date_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_Submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_SubmitAgain()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_Admin_Correction_link_on_Enrollments_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_click_on_Eligibility_Summary_link_in_My_Links_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EligibilityStepDefinition.i_should_be_able_to_see_Eligibility_Summary_of_the_employee_on_a_new_web_page()"
});
formatter.result({
  "status": "skipped"
});
});