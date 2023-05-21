@SearchDataPemilih-Validation @APS
Feature: Search Data Pemilih - Validation

  Scenario: Verify the Search Field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    Then user click Search Field

#    input validasi No KK untuk alphabet, numeric, special character.
  Scenario Outline: Input any Type Data in the No KK Field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    Then user click Search Field
    Then Input any in search Field "<Type Data>"
    Examples:
      | Type Data        |
      | Abcdefghijklmnop |
      | 1234567890987654 |
      | !@!#$%^&*()_+_)( |


