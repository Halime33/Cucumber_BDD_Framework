@registerPage

Feature: DarkSky Page feature

  Background: :
    Given I am on the darkSky Register Page

  @register
  Scenario: Verify register and error message

    When I enter abc@gmail.com into email text fields on login page

    And I enter password1 into password text fields on login page

    And I click on login button

    Then I verify error Username and password do not match

