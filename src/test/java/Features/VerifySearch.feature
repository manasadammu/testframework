Feature: Verify the search on browser

  Scenario: Validate the search term in the chrome browser

    Given User navigates to chrome browser
    When user successfully enters macys in search bar
    Then validate the macy's home site is displayed
    And close the browser