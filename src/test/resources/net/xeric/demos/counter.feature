Feature: Counter feature

  @failing
  Scenario: The counter increments
    Given I am on the demo page
    When the counter is called
    Then the count increases