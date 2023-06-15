Feature: Add Button Functionality

  Scenario: I should able to see add button is displayed in admin page
    Given Navigate to OrangeHRM Website
    When I login as an admin
    And I navigate to admin management page
    Then I verify that add button is displayed