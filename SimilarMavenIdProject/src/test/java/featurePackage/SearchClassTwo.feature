Feature: test scenario to test google search page
Scenario: Search with different set of words
			Given I am on google page "https://google.com/"
			When I search = "Selenium python"
			And I click on google search button
			Then click on first link
			
			