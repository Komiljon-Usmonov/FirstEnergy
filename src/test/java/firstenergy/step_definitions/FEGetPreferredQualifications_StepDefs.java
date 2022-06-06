package firstenergy.step_definitions;

import firstenergy.pages.FEJobSearchPage;
import firstenergy.utility.BrowserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FEGetPreferredQualifications_StepDefs {
    FEJobSearchPage page = new FEJobSearchPage();

    @When("User click on first job listed on the page")
    public void user_click_on_first_job_listed_on_the_page() {
        page.jobTitle.click();

    }

    @Then("Get the preferred qualifications for the job")
    public void get_the_preferred_qualifications_for_the_job() {
        BrowserUtil.scrollToElement(page.scroll_To_pref_Qual_Text);
       BrowserUtil.waitFor(2);

        System.out.println("Preferred Qualifications:");
        for (int i = 0; i < page.prefQualText.size(); i++) {
            System.out.println("- " + page.prefQualText.get(i).getText());
        }



    }

}
