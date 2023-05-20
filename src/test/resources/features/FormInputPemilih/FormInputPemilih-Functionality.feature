@FormInputPemilih-Functionality @APS
Feature: Form Input Pemilih - Functionality

  Scenario: Input with all valid data
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click No KK field
    And input No KK Field with valid data "1234567890987654"
    Then user click No NIK field
    And input No NIK Field with valid data "1234567890987654"
    Then user click Nama field
    And input Nama Field with valid data "Basir Kurnia"
    Then user click Alamat field
    And input Alamat Field with valid data "Kec. Curup Utara, Rejang Lebong, Bengkulu"
    Then user click RT field
    And input RT Field with valid data "2"
    Then user click RW field
    And input RW Field with valid data "3"
    Then user Select Kelurahan field
    And select Kelurahan Field with data "Tasik Malaya"
    Then user click Tempat Lahir field
    And input Tempat Lahir Field with valid data "Rejang Lebong"
    Then user click Tanggal Lahir Field
    And input Tanggal Lahir Field with valid data "30031996"
    Then user click Jenis Kelamin Laki - Laki field
    Then user click Status Kawin field
    And select Status Kawin with data "B - Belum Kawin"
    Then user click Caleg field
    And select Caleg with data "Dummy"
    Then user click TPS Functionality field
    And select TPS with data "Testing TPS"
    Then user click Status on Pemilih field
    Then click on button Simpan

  Scenario: Input with all valid data and empty field data No KK Field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click No KK field
    Then user click No NIK field
    And input No NIK Field with valid data "1234567890987654"
    Then user click Nama field
    And input Nama Field with valid data "Basir Kurnia"
    Then user click Alamat field
    And input Alamat Field with valid data "Kec. Curup Utara, Rejang Lebong, Bengkulu"
    Then user click RT field
    And input RT Field with valid data "2"
    Then user click RW field
    And input RW Field with valid data "3"
    Then user Select Kelurahan field
    And select Kelurahan Field with data "Tasik Malaya"
    Then user click Tempat Lahir field
    And input Tempat Lahir Field with valid data "Rejang Lebong"
    Then user click Tanggal Lahir Field
    And input Tanggal Lahir Field with valid data "30031996"
    Then user click Jenis Kelamin Laki - Laki field
    Then user click Status Kawin field
    And select Status Kawin with data "B - Belum Kawin"
    Then user click Caleg field
    And select Caleg with data "Dummy"
    Then user click TPS Functionality field
    And select TPS with data "Testing TPS"
    Then user click Status on Pemilih field
    Then click on button Simpan