Feature: Owner Set Photos

  Scenario: setting photos for the Sakan
    Given that the user is owner
    And the username is "Ali"
    Then the Owner can add photos to the Sakan
