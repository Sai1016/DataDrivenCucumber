package StepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver;
    @Given("chrome browser is open")
    public void chrome_browser_is_open() {
        System.setProperty("webdriver.chrome.driver","//Users//saimadhavi//Downloads//chromedriver");
        driver = new ChromeDriver();

    }
    @When("user opens url {string}  webpage")
    public void user_opens_url_webpage(String string) {
        driver.get(string);
        driver.manage().window().maximize();
    }
    @When("user enters valid Username as {string} and Password as {string}")
    public void user_enters_valid_username_as_and_password_as(String string, String string2) {
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(string);
        driver.findElement(By.id("password")).sendKeys(string2);
    }
    @When("clicks login button")
    public void clicks_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("user enters into swaglabs homepage")
    public void user_enters_into_swaglabs_homepage() {
        Assert.assertEquals("Swag Labs",driver.getTitle());
    }
    @When("user clicks dropdown button")
    public void user_clicks_dropdown_button() {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.id("react-burger-menu-btn")).click();

    }
    @When("Clicks Logout button")
    public void clicks_logout_button() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
    }
    @Then("User is navigated again to home page")
    public void user_is_navigated_again_to_home_page() {
        Assert.assertEquals("Swag Labs",driver.getTitle());
    }
    @Then("close browser;")
    public void close_browser() {
        driver.quit();
    }
}
