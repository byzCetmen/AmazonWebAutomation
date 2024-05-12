package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);

    @Given("Go to Amazon")
    public void goToAmazon() {
        AmazonPages.goToAmazon();
    }

    @When("Accept cookies")
    public void acceptCookies() {
        AmazonPages.acceptCookies();
    }

    @When("Click on the search box")
    public void clickOnTheSearchBox() {
        AmazonPages.clickOnTheSearchBox();
    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPages.writeProductName();
    }

    @When("Click on the search button")
    public void clickOnTheSearchButton() {
        AmazonPages.clickOnTheSearchButton();
    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterForShippedByAmazon();
    }

    @When("Filter for Apple")
    public void filterForApple() {
        AmazonPages.filterForApple();
    }

    @When("Click on the product")
    public void clickOnTheProduct() {
        AmazonPages.clickOnTheProduct();
    }

    @When("Add to cart")
    public void addToCart() {
        AmazonPages.addToCart();
    }

    @When("Go to cart")
    public void goToCart() {
        AmazonPages.goToCart();
    }

    @Then("Check the cart")
    public void checkTheCart() {
        AmazonPages.checkTheCart();
    }
}