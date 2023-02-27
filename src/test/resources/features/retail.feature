Feature: This feature is use for testing UI of Reatail page

 
  Scenario: Verfiy user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed
    
    
    
