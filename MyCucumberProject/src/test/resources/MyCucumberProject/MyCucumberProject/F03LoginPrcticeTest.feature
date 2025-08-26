Feature: Login functionalty on Practice Test Automation

  Background: 
    Given Open Practice Test Page

  Scenario: To validate login functionality with valid data
    When Enter valid username
    When Enter valid password
    And Click on Submit button
    Then Login should successful

  Scenario: To validate login functionality with invalid data
    When Enter invalid username and invalid password
    And Click on Submit
    Then Error message should display
