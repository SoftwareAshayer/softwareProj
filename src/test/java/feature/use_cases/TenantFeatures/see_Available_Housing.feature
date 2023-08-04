Feature: Tenant See Availabel Sakans

  Scenario: See availabel sakans
    Given that the user is Tenant
    And the username is "omar"
    Then the Tenant can see list of Availabel Sakans
