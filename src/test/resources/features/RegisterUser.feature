Feature: Registration of a new member into the application

  Scenario Outline: Register the member with all valid details
    Given Launch the Browser and navigate to the <url>
    When The user clicks on the SignUp button
    And The user enters all the details in the Enter Account Information Page
    And Selects the checkbox for Sign Up for Our Newsletter!
    And Click on Create Account Button
    Then Verify that Logged in with username

    Examples:
    |url                             |
    |http://automationexercise.com   |
