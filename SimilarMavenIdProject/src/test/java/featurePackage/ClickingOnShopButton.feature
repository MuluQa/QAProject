Feature: feature webelemet test
  Scenario: ClickingOnShopButton
    Given I am On google page "https://google.com/"
    Then I search for "https://practice.automationTesting.in/"
    When I click on shop element
    And  I wait for 5 seconds for shop element
    When I click on home element
    And  I wait for 5 seconds for home element
    Then close the driver
   

 