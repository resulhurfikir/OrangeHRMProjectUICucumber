Feature:AddUser Functionality

  Background: Navigate OrangeHRM, login as Admin and open Add User Page
    Given Navigate to OrangeHRM Website
    When  I login as an admin
    And   I navigate to admin management page
    When  I click on add button


  Scenario: Adding User without filling all mandatory fields on Add User Page
    And   I click on save button
    Then Verify “Required“ notification message on AddUserPage

  Scenario Outline: Adding User by filling some of mandatory fields on Add User Page
    And Fill only "<username>" and "<password>" fields on Add User Page
    And   I click on save button
    Then Verify “Required“ notification message on AddUserPage
    Examples:
      |username|password|
      |Ress61|Ress6161|



