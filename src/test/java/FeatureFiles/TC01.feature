Feature: ESS User Functionalitiy

  Scenario: Creatation an ESS user
    Given Navigate to OrangeHRM Website
    When I login as an admin
    And I navigate to admin management page
    When I click on add button
    And I fill up the form with required info
    And I click on save button
    Then I verify that ESS user on the list
    And Ekstra delete method for saved username