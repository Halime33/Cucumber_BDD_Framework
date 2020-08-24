@web

Feature: DarkSky Page feature

  Background: :
    Given I am on DarkSky Main Page

    @timeline
    Scenario: Verify timeline is displayed in correct format
      When I entered California into search box and click search button
      Then I verify timeline is displayed with two hours incremented

    @temperature
    Scenario: Verify day temperatures timeline
    When I expand today
    And I get all tempList
    And I find maximum temperature
    And I find minimum temperature
    And I verify maximum temperature
    Then I verify minimum temperature

