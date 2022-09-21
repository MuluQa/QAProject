Feature: testing google search
Scenario: searching besed On different words
			Given I am on google page "https://google.com/"
			When I search = "Maven Repository"
			And click on first link
			
			