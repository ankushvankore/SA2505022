Feature: Registration on DemoQA Site

  Background: 
    Given Launch DemoQA site

  Scenario: To validate registration with valid data
    When Enter valid firstName as "Rajesh"
    When Enter valid LastName as "Gupta"
    When Enter valid EmailID as "rajesh@gmail.com"
    Then Registration ends

  Scenario: To validate registration with invalid data
    When Enter invalid firstName as "Vrushika"
    When Enter invalid LastName as "Hingu"
    When Enter invalid EmailID as "vrushika@gmail.com"
    Then Registration fail
