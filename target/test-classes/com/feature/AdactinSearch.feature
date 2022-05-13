
@tag
Feature: Adactin Hotel Booking Functionality

  @tag1
  Scenario: Search hotel in Adactin application
    Given User want to select location
    And User want to select hotels
    And User want to select room type
    And User want to select number of rooms
    And User want to select checkIn date
    And User want to select checkOut date
    And User want to select Adults per room
    And User want to select children per room
    Then User validates search