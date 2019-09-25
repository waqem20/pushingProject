@Login
Feature: Login feature

	Background:  
	Given OrangHRM logo is displayed
  
  @Smoke
  Scenario: Valid login
  When I enter "Admin" and "admin123"
  And I click login button 
  Then Login is successful 

  @Smoke
  Scenario Outline: Invalid login
    Given I enter "<username>" and "<password>"
    And I click login button
    Then I see error message "<errorMessage>" 

    Examples: 
      | username  | password | errorMessage 			 |
      | waqem			| hello123 | Invalid credentials |
      #| miguel123	| pass123  | Invalid credentials |
  	  #| joe				|	star		 | Invalid credentials |
 