Feature: Login
Scenario Outline: Login is done
Given user not login
When user performs  "<username>" and "<password>"
Then Login successful
Examples:
|username||password|
|lalitha||Password123|




