Feature: Test Tricentis Vehicle Application

  Background: 
    Given Launch Tricentis Vehicle App

  Scenario: Test automobile module
    When Click on Automobile Link
    When Select Automobile Make
    When Enter Automobile Engine Performance
    When Enter Automobile DOM

  Scenario: Test Truck module
    When Click on Truck Link
    When Select Truck Make
    When Enter Truck Engine Performance
    When Enter Truck DOM

  Scenario: Test Motorcycle module
    When Click on Motorcycle Link
    When Select Motorcycle Make
    When Enter Motorcycle Engine Performance
    When Enter Motorcycle DOM

  Scenario: Test Camper module
    When Click on Camper Link
    When Select Camper Make
    When Enter Camper Engine Performance
    When Enter Camper DOM
