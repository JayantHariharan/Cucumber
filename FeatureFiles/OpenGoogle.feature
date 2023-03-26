Feature: This is to open google page
Scenario: Searching Pro_Gamer25 on google
	Given user enters "https://www.google.co.in" in browser
	When user enters "Pro_Gamer25" in the search page
	And user clicks the enter button
	Then the Pro_Gamer25 search results shown