
Feature: User should be able to search for jobs

  Background:
    Given User is at home page
    When User click search jobs under careers module

@smoke @job_search
  Scenario: Verify User should be able to search for a job by keyword QA Automation Engineer

    When User enter "QA Automation Engineer" to search jobs box
    And User enter zip code "44320" to jobs location box
    When User click Search button
  #This step will fail because I want to include failed step in report just change the title to QA Automation Engineer it will pass
    Then Verify the title should start with "This step will fail because its not expected title"

  @smoke @job_searchDDT
  Scenario Outline: User search by keyword "<keyword>"

    When User enter "<keyword>" to search jobs box
    And User click Search button
    Then Verify the title should start with "<keyword>"
    Examples:
      | keyword             |
      | Electrical Engineer |
      | Business Analyst    |
      | Financial Analyst   |
      | Cloud Engineer      |
      | Data Engineer       |

