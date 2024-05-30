package automation.stepDefinitions;

import automation.pages.HomePage;
import automation.utils.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static automation.pages.HomePage.driver;

public class HomePageSteps {
    private final HomePage homePage;

    public HomePageSteps(TestBase testBase) {
        homePage = new HomePage(testBase.initializeDriver());

    }

//    @Given("I am on 'Home' page")
//    public void access_homepage() {
//        homePage.openHomePage();
//    }

    @When("I click on 'Men' top header menu option")
    public void click_Men_option() {
        homePage.clickMenOption();
    }


    @And("click item")
    public void click_item() {
        homePage.clickTshirtItem();
    }

    @And("choose colour 'Red'")
    public void select_red_colour() {
        homePage.clickRedColour();
    }

    @And("choose 'XL' size")
    public void size_XL() {
        homePage.clicksizeXL();
    }

    @And("add product to the cart")
    public void addToCart() {
        homePage.addToCart();
    }

    @Given("^I am on \"(.*)\" page$")
    public void assertPageLocation(String location) throws Exception {
        homePage.assertPageLocation(location);
    }

    @Given("^I navigate to \"(.*)\" page$")
    public void openAndAssertPageLocation(String location) throws Exception {
        homePage.openPage(location);
        homePage.assertPageLocation(location);
    }

}

