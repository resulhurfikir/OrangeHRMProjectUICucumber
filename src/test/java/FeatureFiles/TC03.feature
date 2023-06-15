Feature: Confirming Password Functionality

  Scenario: Entering different value in to the "confirm password" field

    Given Navigate to OrangeHRM Website
    When I login as an admin
    And I navigate to admin management page
    When I click on add button
    And I enter a required value in to the password field and different value in to the confirm password field
    Then I verify that notification messages “Passwords do not match” in red color displayed.
