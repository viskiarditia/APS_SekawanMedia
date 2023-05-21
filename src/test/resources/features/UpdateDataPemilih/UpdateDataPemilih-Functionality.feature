@UpdateDataPemilih-Functionality @APS
Feature: Update Data Pemilih - Functionality
  Scenario Outline: Update No NIK, Nama, Alamat, RT and RW with new valid data on the Update Data Pemilih
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And Click edit button in data your choise
    Then user click No KK field
    And update No NIK Field with valid data "<No NIK>"
    Then user click Nama field
    And update Nama Field with valid data "<Nama>"
    Then user click Alamat field
    And Update Alamat Field with valid data "<Alamat>"
    Then user click RT field
    And Update RT Field with valid data "<RT>"
    Then user click RW field
    And Update RW Field with valid data "<RW>"
    Then click on button Simpan
    Examples:
      | No NIK           | Nama          | Alamat                                    | RT | RW |
      | 1234567890987654 | Viski Arditia | Kec. Curup Utara, Rejang Lebong, Bengkulu | 1  | 2  |
