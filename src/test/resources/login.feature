Feature: user is validating login function for Adactin application
Scenario Outline:  validating login with validate username and validate password 
Given user is on Adactin application
When user enter valid "<username>" and "<password>" 
When click login button
And  "<location>" and "<hotels>" and "<roomtype>" and "<no of rooms>"

And user should click login button 
Then user should valid login page 
Examples:
|username      |password    | location  |hotels        |roomtype |no of rooms |
|arunprasath   |kctarun98   |  Sydney   |Hotel Sunshine|Double   |1 - One  		|
|arunprasath   |kctarun98   |Melbourne  |Hotel Urvey   |Standard |2 - Two			|
|arunprasath	 |kctarun98   |Brisbane   |Hotel Creek   |Single   |3 - Three		|	
en|arunprasath |kctarun98   |London     |Hotel Cornice |Double   |4 - Four		|