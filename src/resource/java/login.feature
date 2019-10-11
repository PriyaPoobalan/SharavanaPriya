Feature: TestMe App
  User wanna signup and login in the TestMe App 

Scenario: SignUp to TestMe App
Given Open browser and proceed to TestMe App
When User enters User Name as "Sharavana121"
And User enters First Name as "Priya"
And User enters Last Name as "Poobalan"
And User enters Password as "priya8897"
And User enters Confirm Password as "priya8897"
And User select gender  as "Female"
And User enters E -Mail as "sharavanapriya.poo@gmail.com"
And User enters Mobile Number as "9677514172"
And User enters DOB as "08/08/1997"
And User enters Address as "jothinagar"
And User enters Answer as "on earth"
And User clicks on login button
Then Check if TestMe App login page is displayed
