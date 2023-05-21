@SearchDataPemilih-Functionality @APS
Feature: Search Data Pemilih - Functionality
  Scenario Outline: Input No NIK, Nama, TPS registered on the search field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    Then user click Search Field
    Then input "<registered>" on the search field
    Examples:
      | registered       |
      | 1234567890345678 |
      | Baguss           |
      | Testing 2 TPS    |


  Scenario Outline: Input No NIK, Nama, TPS unregistered on the search field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    Then user click Search Field
    Then input "<unregistered>" on the search field
    Examples:
      | unregistered |
      | 123          |
      | anjayanto    |
      | TPS asik     |




