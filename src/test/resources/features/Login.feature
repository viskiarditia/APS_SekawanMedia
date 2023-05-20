@login
Feature: login
  Scenario: Normal Login Website Aplikasi Pemungutan Suara Sekawan Media
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS