Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    And I click on the Login Link

  @regression
  Scenario: This scenario is to define the login happy path
    When I enter the correct username and passowrd
    And I click on the Login Button
    Then I should land on the home page

  @sanity
  Scenario: This sceanrio is to define the failure path
    When I enter the incorrect username and passowrd
    And I click on the Login Button
    Then I should get the error message "The email or password you have entered is invalid."
@test1
  Scenario: This sceanrio is to define the data path
    When I enter the username as "abc@xyz.com" and passowrd as "Test@1234"
    And I click on the Login Button
    Then I should get the error message "The email or password you have entered is invalid."
@test
  Scenario Outline: This sceanrio is to define the data from external
    When I enter the username as "<UserName>" and passoword as "<Password>"
    And I click on the Login Button
    Then I should get the error message "The email or password you have entered is invalid."

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | Abcd@1234  |
      | pqr@xyz.com | Ertd@1234  |