Feature: Creating a new account

  Scenario: user can create a new account

    Given an open browser with hotel-testlab.coderslab.pl
    When find and click "sign in", fill in the registration form
    Then new page should contain: Your account has been created.
    And close browser