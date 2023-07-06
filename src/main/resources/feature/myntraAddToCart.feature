Feature: Add to cart functionality 
As a registered user 
I am able to use add to cart functionality
and buy thing from myntra 

Background: 
Given User will open the URL "myntra.com" on the chrome browser in macbook 
And Click on the URL and myntra page will open 

@Smoke-tag 
Scenario: To verify the functionality of the Add to cart feature with valid data 
When Click on the "MEN" option which will show in the header path 
And Click on the "Shirt" and select the formal button 
And Just the first product after search the Shirt, Click on it 
And Click on the "Add to bag" option 
Then The product you want to puchase will add to cart sucessfully 
And  You will buy the product you wannt 






