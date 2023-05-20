@FormInputPemilih-Validation @APS
Feature: Form Input Pemilih - Validation

  Scenario: Verify the No KK field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
#    And user click button Tambah
#    Then user click No KK field