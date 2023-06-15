Feature: Required Elements

  Scenario: See all the required elements displayed

    Given Navigate to OrangeHRM Website
    When I login as an admin
    And I navigate to admin management page
    When I click on add button
    Then I verify that all the required elements are displayed

