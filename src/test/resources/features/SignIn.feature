@JenkinsTest
Feature: Sign in Feature

  @Test
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'saboor12@gmail.com' and password 'Salam1234!'
    And User click on login button
    Then User should be logged in into Account

  @Test
  Scenario: Verify user can create an acount into Retail website
    Given User is on retail website
    When User click on Sign in option
    And User click on create New Account button
    And User fill the signUp information with below data
      | name  | email                | password  | confirmPassword |
      | test | test17.sab@gmail.com | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
