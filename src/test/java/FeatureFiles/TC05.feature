Feature: Username Functionality

  Scenario:Username verifying

    Given Navigate to OrangeHRM
    When I login as an admin
    And Navigate to admin management page
    And Click on add button
    When Admin send a value in to the username field which is less than five characters
    Then Notification messages should be in red color displayed.


