package stepdef;

import io.cucumber.java.en.Then;
import page.HomePage;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomePage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
