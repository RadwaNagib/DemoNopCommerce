#the language that we write coding on feature file called Gherkin
@smoke
Feature:user should be able to Register to the system

  Scenario:user could register with valid data successfully
    #prerequisite before the test steps get executed or before go to register page
    Given click on register Tab

    #any action doing in register page
   When user Fill require data
    And Click on REGISTER button

    #expected result
    Then user could register success
    And go to home page
