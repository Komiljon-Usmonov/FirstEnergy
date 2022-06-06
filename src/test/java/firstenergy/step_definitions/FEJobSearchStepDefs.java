package firstenergy.step_definitions;

import firstenergy.pages.FEJobSearchPage;
import firstenergy.utility.BrowserUtil;
import firstenergy.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class FEJobSearchStepDefs {

    FEJobSearchPage page = new FEJobSearchPage();

    @Given("User is at home page")
    public void user_is_at_home_page() {
        page.goTo();
    }

    @When("User click search jobs under careers module")
    public void user_click_search_jobs_under_careers_module() {
        BrowserUtil.hoverOver(page.careersBtn);
        page.searchJobsBtn.click();
    }

    @When("User enter {string} to search jobs box")
    public void user_enter_to_search_jobs_box(String keyword) {
        page.searchJobBox.sendKeys(keyword);

    }

    @When("User enter zip code {string} to jobs location box")
    public void user_enter_zip_code_to_jobs_location_box(String zipcode) {
        page.searchLocationBox.sendKeys(zipcode);
    }

    @When("User click Search button")
    public void user_click_search_button() {
        page.searchBtn.click();
        BrowserUtil.waitFor(2);
    }

    @Then("Verify the title should start with {string}")
    public void verify_the_title_should_start_with(String expected) {

        String actual = Driver.getDriver().getTitle();

        assertTrue(actual.contains(expected));

        System.out.println("Actual title is: "+actual);
    }


}
