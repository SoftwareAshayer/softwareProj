Feature: User Sign-In

  Scenario: Successful sign-in with valid Data
    Given that the user is not logged in
    And the username is "Ahmad"
    And the password is "1234"
    Then the administrator login succeeds

  Scenario: Failed sign-in with invalid Data
    Given that the user is not logged in
    And the username is "Ahmad"
    And the password is "WrongPass"
    Then the administrator will not login
