Feature: Password Lowercase

  Scenario: Password without lowercase
    Given Navigate to OrangeHRM
    When I login as an admin
    Then I navigate to admin management page
    And  I click on add button
    Then I write password but all uppercase
    And I verify contains lower-case message displayed and message color in red