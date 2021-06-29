Feature: Successful purchase

  As a web user
  I want to register in advantage shopping
  To be able to buy a product

  @smokeTest
  Scenario: Successful purchase
    Given that a web user wants to buy a product in advantage shopping
    When he fills all the requested fields and he follows the steps
    Then he should see the invoice data.