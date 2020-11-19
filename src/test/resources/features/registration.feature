# Author: Daniel Agudelo

@stories
Feature: User registration
  As a user
  I want to have an account on uTest
  So that I can access to the platform

  @scenario1
  Scenario Outline: Create an account
    Given that Daniel is on the registration page
    When he enters his information
      | firstName   | lastName   | email   | password   | dayOfBirth   | monthOfBirth   | yearOfBirth   | mobileDevice   | mobileModel   | mobileOS   |
      | <firstName> | <lastName> | <email> | <password> | <dayOfBirth> | <monthOfBirth> | <yearOfBirth> | <mobileDevice> | <mobileModel> | <mobileOS> |
    Then he access to the platform
      | welcomeTitle   |
      | <welcomeTitle> |

    Examples:
      | firstName   | lastName   | email                       | password         | dayOfBirth   | monthOfBirth   | yearOfBirth   | mobileDevice | mobileModel  | mobileOS          |
      | Daniel      | Agudelo    | daniel.agudelot07@gmail.com | Daniel_Agu_2020_ | 2            | March          | 1999          | Xiaomi       | Redmi Note 8 | Android 9.0 (Pie) |

    Examples:
      | welcomeTitle                                                            |
      | Welcome to the world's largest community of freelance software testers! |