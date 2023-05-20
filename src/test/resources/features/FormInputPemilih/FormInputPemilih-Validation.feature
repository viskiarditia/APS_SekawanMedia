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
    And user click button Tambah
    Then user click No KK field

#    input validasi No KK untuk alphabet, numeric, special, more and less 16 character.
  Scenario Outline: Input any Type Data in the No KK Field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click No KK field
    Then Input any "<Type Data>"
    Examples:
      | Type Data           |
      | Abcdefghijklmnop    |
      | 1234567890987654    |
      | !@!#$%^&*()_+_)(    |
      | 12345               |
      | 1234567890987654321 |

  Scenario: Verify the No NIK field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click No NIK field

#    input validasi No NIK untuk alphabet, numeric, special, more and less 16 character.
  Scenario Outline: Input any Type Data in the No NIK Field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click No NIK field
    Then Input any "<Type Data>"
    Examples:
      | Type Data           |
      | Abcdefghijklmnop    |
      | 1234567890987654    |
      | !@!#$%^&*()_+_)(    |
      | 12345               |
      | 1234567890987654321 |

  Scenario: Verify the Nama field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Nama field

#    input validasi Nama untuk alphabet, numeric, special, more and less 16 character.
  Scenario Outline: Input any Type Data in the Nama Field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Nama field
    Then Input any "<Type Data>"
    Examples:
      | Type Data           |
      | Abcdefghijklmnop    |
      | 1234567890987654    |
      | !@!#$%^&*()_+_)(    |
      | 12345               |
      | 1234567890987654321 |

  Scenario: Verify the Alamat field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Alamat field

#    input validasi Alamat untuk alphabet, numeric, special character.
  Scenario Outline: Input any Type Data in the Alamat Field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Alamat field
    Then Input any "<Type Data>"
    Examples:
      | Type Data        |
      | Abcdefghijklmnop |
      | 1234567890987654 |
      | !@!#$%^&*()_+_)( |

  Scenario: Verify the RT field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click RT field

#    input validasi RT untuk numeric, more and less 2 character.
  Scenario Outline: Input any Type Data in the RT Field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click RT field
    Then Input any "<Type Data>"
    Examples:
      | Type Data        |
      | 01               |
      | 1234567890987654 |
      | 3                |

  Scenario: Verify the RW field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click RW field

#    input validasi RW untuk numeric, more and less 2 character.
  Scenario Outline: Input any Type Data in the RW Field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click RW field
    Then Input any "<Type Data>"
    Examples:
      | Type Data        |
      | 01               |
      | 1234567890987654 |
      | 3                |

  Scenario: Verify Select Kelurahan field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user Select Kelurahan field

  Scenario: Verify the Tempat Lahir field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Tempat Lahir field

#    input validasi Tempat Lahir untuk alphabet, numeric, special character.
  Scenario Outline: Input any Type Data in the Tempat Lahir Field
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Tempat Lahir field
    Then Input any "<Type Data>"
    Examples:
      | Type Data        |
      | Abcdefghijklmnop |
      | 1234567890987654 |
      | !@!#$%^&*()_+_)( |

  Scenario: Verify the Jenis Kelamin Laki - Laki field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Jenis Kelamin Laki - Laki field

  Scenario: Verify the Jenis Kelamin Perempuan field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Jenis Kelamin Perempuan field

  Scenario: Verify the Status Kawin field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Status Kawin field

  Scenario: Verify the Caleg field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Caleg field

  Scenario: Verify the TPS field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click TPS field

  Scenario: Verify the Status on Pemilih field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Status on Pemilih field

  Scenario: Verify the Status on Potensi field is enabled
    Given user already website APS on login page
    When user Click username field and input "candidat"
    And user Click password field and input "password123"
    Then user click on Button Masuk on login page
    And user navigate to Home Page website APS
    When user click menu Pemilih Tetap
    And already on page Pemilih Tetap
    And user click button Tambah
    Then user click Status on Potensi field