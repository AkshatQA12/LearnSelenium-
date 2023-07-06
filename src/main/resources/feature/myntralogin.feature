Feature: Login functionality of myntra 
As a user I want to Login into Myntra 
So that I can acess my acount 

Scenario: Verify that user is able to Login into the account with valid credentials 
Given User will open the chrome browser on macbook
And  Enter the URL "www.myntra.com"
And Myntra profile page is open 
Then User will just place cursor on "profile" logo on the top right corner in header 
And Click on the "Login/Signup" button
And Enter the valid phone number "9815795947" in the box and click on continue button 
And Enter the OTP which is given on your registered mobile number 
And The signup page will open on display 
And create the password which you want to confirm for this account 
And Enter full name as "Akshat Chdha" , Email as "chadhaaskat7@gmail.com" , select gender as "Male" , Alternative number S "9815125947"
And Click on the Create account button 
Then Login Succesfully message will show on your Screen 
And A pop up message also deleivereed on your registered phone number 
