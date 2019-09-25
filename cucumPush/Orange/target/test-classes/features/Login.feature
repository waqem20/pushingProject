@Login
Feature: Login feature

	Background:  
	Given OrangHRM logo is displayed
  
  @Smoke
  Scenario: Valid login
  When I enter "Admin" and "admin123"
  And I click login button 
  Then Login is successful 

 