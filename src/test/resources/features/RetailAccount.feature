@JenkinsTest
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'saboor12@gmail.com' and password 'Tek@1234'
    And User click on login button
    And User should be logged in into Account
    And User click on Account option


  Scenario: Verify User can update Profile Information
    And User update Name and Phone
      | name   | phone number |
      | TestSab |   9193756658 |
    And User click on Update button
    Then user profile information should be updated
  
  Scenario: Verify User can Update password
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'update.password@gmail.com' and password 'NewPass@123'
    When User enter below information
      | previousPassword | newPassword | confirmPassword |
      | NewPass@123    | Tek@1234    | Tek@1234        |
   And User click on Change Password button
   Then a message should be displayed ‘Password Updated Successfully’

 
  Scenario: Verify User can add a payment method
    When User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5488726485473590 | TekTest    |              05 |           2024 |          452 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  
  Scenario: Verify User can edit Debit or Credit card
    When User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5488726485479028 | TekCard    |              12 |           2026 |          644 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

 
  Scenario: Verify User can remove Debit or Credit card
    When User click on remove option of card section
    Then payment details should be removed

  
  Scenario: Verify User can add an Address
    When User click on Add address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress     | apt  | city       | state   | zipCode |
      | Canada  | TekTest  |  6472543165 | 201 Van Horne Ave | 1702 | North York | Ontario |   45875 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress          | apt | city    | state    | zipCode |
      | United States | NewTest  |  6478154758 | 1383 victoria park ave | 147 | Toronto | New York |   54857 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  
  Scenario: Verify User can remove Address from Account
    When User click on Account option 
    And User click on remove option of Address section
    Then Address details should be removed
