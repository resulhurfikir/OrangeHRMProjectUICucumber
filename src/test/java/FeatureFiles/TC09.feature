Feature: AddUser Functionality

  Background: Navigate OrangeHRM, login as Admin and open Add User Page
    Given Navigate to OrangeHRM Website
    When  I login as an admin
    And   I navigate to admin management page
    When  I click on add button

  Scenario: Verify that “Add User” heading is displayed on Add User Page
    Then   Verify “Add User” heading is displayed