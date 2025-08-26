Feature: Google Search

  Scenario: To validate search functionality on Google
    Given I Open Google
    When Enter keyword to search
    And Hit Enter
    Then Valid search result should display
