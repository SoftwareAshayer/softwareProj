Feature: Tenant can sell the furniture

  Scenario: sell the furniture
    Given that the user is Tenant
    And the username is "omar"
    Then the Tenant can sell the furniture
