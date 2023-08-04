Feature: Owner Set informaions

  Scenario: setting informations for the Owner
    Given that the user is owner
    And the username is "Ali"
    Then the Owner can change his email
    And the Owner can change his location
    And the Owner can change his phoneNo

