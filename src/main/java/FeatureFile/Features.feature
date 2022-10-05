Feature: Swaglabs Login page test
  Scenario: to check swaglabs login returns swag homepage
    Given chrome browser is open
    When user opens url "https://www.saucedemo.com/"  webpage
    And user enters valid Username as "standard_user" and Password as "secret_sauce"
    And clicks login button
    Then user enters into swaglabs homepage
    When user clicks dropdown button
    And  Clicks Logout button
    Then User is navigated again to home page
    And close browser;
  Scenario Outline: to check swaglabs login returns swag homepage - Data driven
    Given chrome browser is open
    When user opens url "https://www.saucedemo.com/"  webpage
    And user enters valid Username as "<username>" and Password as "<password>"
    And clicks login button
    Then user enters into swaglabs homepage
    When user clicks dropdown button
    And  Clicks Logout button
    Then User is navigated again to home page
    And close browser;
    Examples:
      |username| |password|
      |standard_user| |secret_sauce|
      |problem_user| |secret_sauce   |
      |problem_user| |secret_sauce  |
