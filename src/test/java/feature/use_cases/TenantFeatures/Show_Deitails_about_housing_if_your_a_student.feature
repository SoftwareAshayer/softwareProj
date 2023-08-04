Feature: Show Deitails for students

  Scenario: Sign in sakan
    Given that the user is Tenant
    And the username is "omar"
    Then the Tenant can see details about students if he is student
