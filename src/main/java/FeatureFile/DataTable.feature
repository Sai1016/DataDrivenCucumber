Feature: Swag labs login using Data Table feature
  Scenario: login to swaglabs
    Given chrome browser is open
    And user logs into url "https://www.saucedemo.com/"
    When user enters valid Username  and Password
    | standard_user | secret_sauce|
    And user clicks on login button
    Then user is navigated to  main page
