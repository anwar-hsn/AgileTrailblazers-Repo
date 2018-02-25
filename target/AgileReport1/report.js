$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Trailblazer.feature");
formatter.feature({
  "name": "Chceking contact us",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Going to base URL",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am at HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.i_go_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submitting message without anythin",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NegativeTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    },
    {
      "name": "@Firefox"
    },
    {
      "name": "@FormSubmission"
    },
    {
      "name": "@Empty"
    }
  ]
});
formatter.step({
  "name": "I click on contact us",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.click_on_contact_us()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click sumbit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_click_sumbit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the Error alert message",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_get_the_Error_alert_message()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [Validation errors occurred. Please confirm the fields and submit it again.] but found [Please fill in the required field.]\r\n\tat org.testng.Assert.fail(Assert.java:93)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:134)\r\n\tat org.testng.Assert.assertEquals(Assert.java:115)\r\n\tat org.testng.Assert.assertEquals(Assert.java:189)\r\n\tat org.testng.Assert.assertEquals(Assert.java:199)\r\n\tat com.agile.pages.ContactPage.verifyErrorAlert(ContactPage.java:58)\r\n\tat com.agile.cucumber.StepDefination.i_get_the_Error_alert_message(StepDefination.java:89)\r\n\tat ✽.I get the Error alert message(Trailblazer.feature:13)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "Going to base URL",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am at HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.i_go_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submitting message with all the information.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PositiveTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    },
    {
      "name": "@Firefox"
    },
    {
      "name": "@FormSubmission"
    }
  ]
});
formatter.step({
  "name": "I click on contact us",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.click_on_contact_us()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide Name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_provide_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide valid Email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_provide_valid_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide valid Mobile phone number",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_provide_valid_Mobile_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide valid Office phone number",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_provide_valid_Office_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select subject from dropdown menu",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_select_subject_from_dropdown_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I write the message",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_write_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click sumbit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_click_sumbit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the confirmation message",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.i_get_the_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
});