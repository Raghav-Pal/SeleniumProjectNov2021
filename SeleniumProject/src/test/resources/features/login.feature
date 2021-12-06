Feature: Test login functionality

  Scenario Outline: Login Test
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
