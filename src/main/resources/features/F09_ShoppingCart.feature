@smoke
Feature: user could add products to shopping cart

  Scenario: success message is visible after adding product to shopping cart
    When user add product to shopping card
    Then shopping card notification success is visible

