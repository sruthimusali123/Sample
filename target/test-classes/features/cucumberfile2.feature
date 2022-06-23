Feature: Search functionality
Scenario Outline: checking the search functionality in different ways
Given user is on the search page "https://www.google.com"
When user enters '<search>' data
 And click on the search
 Then user is navigate to the search page
 Examples: 
 |search|
 |java|
 |selenium|
 
