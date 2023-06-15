Feature: Right Password Length Functionality

  Scenario: Entering value which isless than 8 characters into the "Password" field

    Given Navigate to OrangeHRM Website
    When I login as an admin
    And I navigate to admin management page
    When I click on add button
    And I enter a value into the Password field which is less than 7 characters
    Then I verify that notification messages “Should have at least 7 characters” in red color displayed.