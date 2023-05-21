@ImportDataPemilih-Functionality @APS
Feature: Import Data Pemilih - Functionality
  Scenario: input new valid data by import file excel
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And click on the Import Excel
    And appear modal upload data pemilih
    Then click on choose file for upload file
    And apper pop up confirm
    And click Yes on the pup up confirm
    And click OK on the pop up information
    And already on page Pemilih Tetap