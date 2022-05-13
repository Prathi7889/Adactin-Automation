
@tag
Feature: Adactin Hotel Booking Functionality

  @tag1
  Scenario: Book the Hotel in Adactin
    Given User enters the firstName
    And User enters the lastName
    And User enters the address
    And User enters the creditcard number
    And User enters the creditcard type
    And User enters the creditcard expiry month
    And User enters the creditcard expiry year
    And User enters the cvv
    Then User clicks book now

