@AllScenarios
Feature: Test BigBasket Links

  Background: 
    Given Launch the site "https://www.bigbasket.com/"

  @SmokeTest
  Scenario: Test Exotic fruits link
    When Click on Exotic Fruits link
    Then Exotic fruits page should open

  @SanityTest
  Scenario: Test Tea link
    When Click on Tea link
    Then Tea page should display

  @UsabilityTest
  Scenario: Test Ghee link
    When Click on Ghee link
    Then Ghee page should display

  @PerformanceTest
  Scenario: Test Nandhani link
    When Click on Nandhini link
    Then Nandhani page should display
