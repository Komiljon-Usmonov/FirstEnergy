package firstenergy.pages;

import firstenergy.utility.ConfigReader;
import firstenergy.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FEJobSearchPage {

    public FEJobSearchPage() {

        /*
         PageFactory is a selenium class that support Page Object Model
         and it has method called initElements
         once it's called , it will locate all the element
         specified using @FindBy annotation with locator
         initElements accept 2 arguments ,
         WebDriver instance and Page class instance (this) means current instance of this class.
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='small-12 large-12 columns']//a[@href='/careers.html']")
    public WebElement careersBtn;

    @FindBy(xpath = "//a[@href='https://careers.firstenergycorp.com/viewalljobs/']")
    public WebElement searchJobsBtn;

    @FindBy(xpath = "(//input[@name='q'])[2]")
    public WebElement searchJobBox;

    @FindBy(xpath = "(//input[@name='locationsearch'])[2]")
    public WebElement searchLocationBox;

    @FindBy(xpath = "(//input[@value='Search'])[2]")
    public WebElement searchBtn;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]")
    public WebElement jobTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div[1]/div[2]/div[6]/div/div/div/span/span/ul[4]/li")
    public List<WebElement> prefQualText;

    @FindBy(xpath = "//span[contains(text(),'The following are Preferred Qualifications:')]")
    public WebElement scroll_To_pref_Qual_Text;



    //this method will just navigate to homePage
    public void goTo() {
        Driver.getDriver().get(ConfigReader.read("firstEnergyUrl"));
    }

}
