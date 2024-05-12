package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By searchBox = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By filterAmazon = By.xpath("//span[.='Amazon tarafından gönderilir']");
    static By filterApple = By.xpath("//span[.='Apple']");
    static By product = By.cssSelector("[alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
    static By addCart = By.id("add-to-cart-button");
    static By goCart = By.xpath("//span[@id='sw-gtc']//a[contains(.,'Sepete Git')]");
    static By checkCart = By.cssSelector(".a-truncate-cut");

    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        this.elementHelper = new ElementHelper(driver);
    }

    public static void goToAmazon() {
    }

    public static void acceptCookies() {
        elementHelper.click(accept);
    }

    public static void clickOnTheSearchBox() {
        elementHelper.click(searchBox);
    }

    public static void writeProductName() {
        elementHelper.sendKey(searchBox, "airpods");
    }

    public static void clickOnTheSearchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterForShippedByAmazon() {
        elementHelper.click(filterAmazon);
    }

    public static void filterForApple() {
        elementHelper.click(filterApple);
    }

    public static void clickOnTheProduct() {
        elementHelper.click(product);
    }

    public static void addToCart() {
        elementHelper.click(addCart);
    }

    public static void goToCart() {
        elementHelper.click(goCart);
    }

    public static void checkTheCart() {
        elementHelper.check(checkCart);
    }
}