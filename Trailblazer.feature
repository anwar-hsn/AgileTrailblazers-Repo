
Feature: Chceking contact us

Background: Going to base URL
    Given I am at HomePage
    

  @NegativeTest @SmokeTest @RegressionTest @Firefox @FormSubmission @Empty
  Scenario: Submitting message without anythin
    
    When I click on contact us
    Then I click sumbit button
    And I get the Error alert message

 
  
   @NegativeTest @SmokeTest @RegressionTest @Firefox @FormSubmission @Name
  Scenario: Submitting message with only name
    
    When I click on contact us
    And I provide Name
    Then I click sumbit button
    And I get the Error alert message
    
    @NegativeTest @SmokeTest @RegressionTest @Firefox @FormSubmission @Email
  Scenario: Submitting message only with email
    
    When I click on contact us
    And I provide valid Email
    Then I click sumbit button
    And I get the Error alert message
    
     @NegativeTest @SmokeTest @RegressionTest @Firefox @FormSubmission @Subject
  Scenario: Submitting message only with subject
    
    When I click on contact us
    And I select subject from dropdown menu
    Then I click sumbit button
    And I get the Error alert message
    
    
     @NegativeTest @SmokeTest @RegressionTest @Firefox @FormSubmission @Message
  Scenario: Submitting message only with message
    
    When I click on contact us
     And I write the message 
    Then I click sumbit button
    And I get the Error alert message
  
  
  
      
  @NegativeTest @SmokeTest @RegressionTest @Firefox @FormSubmission
  Scenario: Submitting message withoud name
    
    When I click on contact us
    And I provide valid Email
    And I provide valid Mobile phone number
    And I provide valid Office phone number
    And I select subject from dropdown menu
    And I write the message 
    Then I click sumbit button
    And I get the Error alert message

      
     @NegativeTest @SmokeTest @RegressionTest @Firefox @FormSubmission
  Scenario: Submitting message without email
    
   When I click on contact us
    And I provide Name
    And I provide valid Mobile phone number
    And I provide valid Office phone number
    And I select subject from dropdown menu
    And I write the message 
    Then I click sumbit button
    And I get the Error alert message

 
 
 
@NegativeTest @SmokeTest @RegressionTest @Firefox @FormSubmission
  Scenario: Submitting message without subject
    
    When I click on contact us
    And I provide Name
    And I provide valid Email
    And I provide valid Mobile phone number
    And I provide valid Office phone number
    And I write the message 
    Then I click sumbit button
    And I get the Error alert message

  
  
    
 @NegativeTest @SmokeTest @RegressionTest @Firefox @FormSubmission
  Scenario: Submitting message without message
    
   When I click on contact us
    And I provide Name
    And I provide valid Email
    And I provide valid Mobile phone number
    And I provide valid Office phone number
    And I select subject from dropdown menu
    Then I click sumbit button
    And I get the Error alert message 


@PositiveTest @SmokeTest @RegressionTest @Firefox @FormSubmission
  Scenario: Submitting message with all the information.
    When I click on contact us
    And I provide Name
    And I provide valid Email
    And I provide valid Mobile phone number
    And I provide valid Office phone number
    And I select subject from dropdown menu
    And I write the message 
    Then I click sumbit button
    And I get the confirmation message
 
  
  @search @SmokeTest @RegressionTest @Firefox
  Scenario: Search option
     
    Given click on search
    When I provide query
    Then click search button
    And I get the result
   
  @Homepage @SmokeTest @RegressionTest @Firefox
  Scenario: Home page search button
  
  Given click on search
    When I provide query
    Then click search button
    And I get the result
