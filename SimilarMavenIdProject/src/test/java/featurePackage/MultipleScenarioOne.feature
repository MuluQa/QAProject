Feature: visiting three websites
Scenario: Home page of Amazon
			Given I am on Amazon website "https://Amazon.com"
			Then click on All in element
			And click on Best sellers element
			Then use waits for 5 seconds for Amazon	
			
Scenario: yahoo Homepage
			Given I am on yahoo website "https://yahoo.com"
			Then use waits for 5 seconds for yahoo
		

Scenario: Home page of cnn
			Given user is on cnn website "https://cnn.com"
			Then click on US element
			And user waits for 5 seconds for cnn
			
			