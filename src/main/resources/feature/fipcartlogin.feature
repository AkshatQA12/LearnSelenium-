Feature: flipcart functionality 
as a user 
I am able to login into flipcart 
and acess my flipcart profile 

@tag
Scenario: Verify the login page with valid credentials 
Given Launch the chrome browser"www.flipcart.com" on mac 
And Click on Login button 
When enter the va lid "chadhaakshat7@gamil.com" and "1234"
And click on Login button 
Then I am able to use my flipcart profile 


@tag 
Scenario: Verify the login page with invalid credentials 
Given I am on the login page 
When I enter the invalid "bchtng"and "password"
And click on Login button 
Then A error message will show on screen 

@tag 
Scenario: Verify the ligin page with blank credentials 
Given I am on the login page 
When I leave the blank space in credentials 
And  click on login button 
Then I will see a validation error 












