Feature: Online Cooking School Registration

Scenario: User locates to Recipe_class_registration
Given User is on Recipe Class Registration
When User clicks on hyperlink Download our Recipe class Brochure
Then Recipe class brochure should be send to user's registered mail id

Scenario: User goes back on Recipe class registration page
Given User is on Recipe clas brochure page
When User clicks on hyperlink Go Back to Registration
Then User should be navigated to Recipe_class_registration.html page

Scenario: Invalid First Name
Given User is on Recipe_class_registration.html
When User does not enters any data in First Name field
Then First Name field is invalid

Scenario: Valid First Name
Given User is on Recipe_class_registration.html
When User enters alphabatical data in First Name field
Then First Name field is Valid

Scenario: Invalid Last Name
Given User is on Recipe_class_registration.html
When User enters null in Last Name field
Then Last Name field is invalid

Scenario: Valid Last Name
Given User is on Recipe_class_registration.html
When User enters some alphabatical data in Last Name field
Then Last Name field is Valid

Scenario: Valid email
Given User is on Recipe_class_registration.html
When User enters some data in Email field
Then Email field is Valid

Scenario: Invalid Mobile(Numeric Character)
Given User is on Recipe_class_registration.html
When User enters non numeric value in Mobile field
Then Mobile field is invalid

Scenario: Invalid Mobile(Insufficient number of characters)
Given User is on Recipe_class_registration.html
When User enters numeric less than 10 characters
Then Mobile field is invalid

Scenario: Valid Mobile
Given User is on Recipe_class_registration.html
When User enters 10 digit numeric character in Mobile field
Then Mobile field is valid

Scenario: User selects a value from Category of recipes interested dropdown field
Given User is on Recipe_class_registration.html
When User selects Non-Veg from Category of recipes interested dropdown field
Then Non-Veg should be send as value of Category of recipes interested dropdown field

Scenario: User selects a value from  City Preference dropdown field
Given User is on Recipe_class_registration.html
When User selects Mumbai from City dropdown field
Then Mumbai should be send as value of City dropdown field

Scenario: User selects a value from Mode of Learning dropdown field
Given User is on Recipe_class_registration.html
When User selects in house training from Mode of Learning dropdown field
Then In house Training should be send as value of Mode of Learning field

Scenario: User selects a value from Interested Course duration dropdown field
Given User is on Recipe_class_registration.html
When User selects 6 Months from Interested Course duration dropdown field
Then 6 Months should be send as value of Interested Course duration dropdown field

Scenario: Invalid Your Enquiry field
Given User is on Recipe_class_registration.html
When User does not enters any data in Your Enquiry field
Then Your Enquiry field is invalid

Scenario: Valid Your Enquiry field
Given User is on Recipe_class_registration.html
When User enters some data in Your Enquiry field
Then Your Enquiry field is valid and the entered data is send as value of Your Enquiry field

Scenario: Enquire Now button is clicked
Given User is on Recipe_class_registration.html
When User clicks on Enquire Now
Then Form should be submitted with valid data and message should be displayed















