@smoke
Feature: users will be able to search for products with different parameters
  Scenario:user could search using product name
    #prerequisite before the test steps get executed
    Given Enter "Electronics" on search text

    #any action doing in page
    When click on search button

    #expected result
    Then user could fine Electronics product


#TEST SCENARIO2
  Scenario: user could search using sku
    #prerequisite before the test steps get executed
    Given Enter "AP_MBP_13" on search textBOX

    #any action doing in page
    When click on search_button

    #expected result
    Then user could fine AP_MBP_13product



