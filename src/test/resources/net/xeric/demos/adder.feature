Feature: Addition Feature

  @failing
  Scenario: Add two positive numbers
    Given I am on the demo page
    When I add the numbers 2 and 3
    Then the result is 5

  @failing
  Scenario: Add a negative and positive number
    Given I am on the demo page
    When I add the numbers -2 and 3
    Then the result is 1

  @failing
  Scenario: Add two negative numbers
    Given I am on the demo page
    When I add the numbers -2 and -3
    Then the result is -5
