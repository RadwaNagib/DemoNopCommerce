@smoke
Feature: user should be able to login to the system

Scenario:user could login with valid data successfully
    #prerequisite before the test steps get executed or before go to login page
Given click on login Tab

    #any action doing in login page
When user enter "testing_21@example.com" and "P@ssw0rd"
And Click on login button

    #expected result
Then user could login success
