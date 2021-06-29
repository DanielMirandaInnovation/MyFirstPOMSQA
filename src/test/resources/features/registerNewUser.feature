Feature: Register new user

  As a web user
  I want to register in advantage shopping
  To be able to buy a product

@regression
  Scenario: Successful register
    Given that a web user wants to register in advantage shopping
    When he fills all the requested fields
    Then he should see him username in the portal

@smokeTest
  Scenario: Successful register 2
    Given that a web user wants to register in advantage shopping
    When he fills all the requested fields
    Then he should see him username in the portal

  @smokeTest
  Scenario: Wrong register
    Given that a web user wants to register in advantage shopping
    When he fills all the requested fields with wrong data
    But he shouldn't see him username in the portal