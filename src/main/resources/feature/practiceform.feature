Feature: Student Registration Page
  
  As a student 
  I am able to register into a portal 
  So that I can acess my account

  Scenario Outline: Verify the Registration page
    Given User should on registrtion page
    When User enter first name as "Akshat" , last name as "Chadha" , Email as "chadhaakshat7@gmail.com"
    And Click Gender as "Male"
    And Enter Mobile no as "9815795947" , DOB as "3 nov 2001"
    And Enter subject as <subject>
      | subject |
      | maths   |
    And Click hobbies as "Sports" and upload the picture
    And Enter current address as "<address>" , state as "<state>" and city as"<city>"
    And Click on submit button
    Then User successfully registered into the portal

    Examples: 
      | address | state | city    |
      | mohali  | NCR   | gurgaon |
