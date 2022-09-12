Feature: testing if three sliders are working
  Scenario: checking if Home page having three sliders
    Given I am on google search "https://google.com/"
    And Open autometiontesting website "http://practice.automationtesting.in/"
    Then locate and click the first slider
    Then locate and click the second slider
    Then locate and click the third slider
    Then wait for 5 seconds  
    Then close the website
    