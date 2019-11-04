Feature: Alex do the payment process


Scenario: The one where the user moves to cart without adding any item in it
Given Alex has registered in to TestMeApp
Then Alex searches a particular product like headphones
And try to proceed to payment without adding any item in the cart
Then Text Me App doesn't display the cart icon


Scenario: The user select the product and do the payment process with valid credential
Given Alex has registered in the TestMEApp 
When  Alex searched for headphone 
And Add HeadPhone to the cart
And Clicked on cart button and do payment process 
Then Alex get successfull payment messsage 