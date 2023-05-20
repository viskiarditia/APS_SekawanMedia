@FilterDataPemilih-Functionality @APS
Feature: Filter Data Pemilih - Functionality

  Scenario: Input All valid data on Filter Data Pemilih
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And click the button Filter
    Then input Provinsi valid data "Bengkulu"
    And input Kota or Kabupaten valid data "Rejang Lebong"
    And input Kecamatan valid data "Curup Utara"
    And input Kelurahan valid data "Tasik Malaya"
    And input TPS valid data "Testing TPS"
    And user click button apply on the filter page
    And data result by input all field

  Scenario: Input Valid data Provinsi Field on Filter Data Pemilih
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And click the button Filter
    Then input Provinsi valid data "Bengkulu"
    And user click button apply on the filter page
    And data result by input valid data Provinsi Field

  Scenario: Input Valid data Provinsi Field and kota/Kabupaten on Filter Data Pemilih
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And click the button Filter
    Then input Provinsi valid data "Bengkulu"
    And input Kota or Kabupaten valid data "Rejang Lebong"
    And user click button apply on the filter page
    And data result by input valid data Kabupaten Field

  Scenario: Input Valid data Provinsi Field, kota/Kabupaten and Kecamatan on Filter Data Pemilih
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And click the button Filter
    Then input Provinsi valid data "Bengkulu"
    And input Kota or Kabupaten valid data "Rejang Lebong"
    And input Kecamatan valid data "Curup Utara"
    And user click button apply on the filter page
    And data result by input valid data Kecamatan Field

  Scenario: Input Valid data Provinsi Field, kota/Kabupaten, Kecamatan and Kelurahan on Filter Data Pemilih
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And click the button Filter
    Then input Provinsi valid data "Bengkulu"
    And input Kota or Kabupaten valid data "Rejang Lebong"
    And input Kecamatan valid data "Curup Utara"
    And input Kelurahan valid data "Tasik Malaya"
    And user click button apply on the filter page
    And data result by input valid data Kelurahan Field




