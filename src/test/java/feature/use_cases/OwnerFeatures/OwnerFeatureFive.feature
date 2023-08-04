Feature: Owner see informaions

  Scenario: getting informations for the Owner
    Given that the user is owner
    And the username is "Ali"
    Then the Owner can see his email
    And the Owner can see his location
    And the Owner can see his phoneNo

