Feature: Tenant See informations about Sakan

  Scenario: See Sakan Informations
    Given that the user is Tenant
    And the username is "omar"
    Then the Tenant can see pictures of housing and know their prices, location,and services
