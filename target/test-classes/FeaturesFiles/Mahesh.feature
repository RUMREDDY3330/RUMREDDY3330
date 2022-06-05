

Feature: Login Feature
  Verify if user is abel to Login in to the site

@tag
  Scenario: login as a authenticated user
  Given user in on homepage
  When user navigates to login page
  And user enters username and password
  Then success message is displayed
  
  
  @tag1
  Scenario: verify usr in able login into application
  Given user in on login page
  Then user enterd user name
  And user enter password
  Then user click on login button
  When verify user is on homepage 
    

Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
     
    
    
    
    
    
    
    
    
     
    

