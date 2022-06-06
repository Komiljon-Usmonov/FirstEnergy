
Feature:Get the Preferred Qualifications
  @smoke
   Scenario: Get the Preferred Qualifications for a job listed
    Given User is at home page
    When User click search jobs under careers module
    When User enter "QA" to search jobs box
    And User click Search button
    And User click on first job listed on the page
    Then Get the preferred qualifications for the job