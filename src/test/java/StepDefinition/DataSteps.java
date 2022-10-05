package StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class DataSteps {
    WebDriver driver;
    @Given("user logs into url {string}")
    public void user_logs_into_url(String string) {
        System.setProperty("webdriver.chrome.driver","//Users//saimadhavi//Downloads//chromedriver");
        driver = new ChromeDriver();
        driver.get(string);
        driver.manage().window().maximize();
    }
    @When("user enters valid Username  and Password")
    public void user_enters_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
               List<List<String>> Logindetails = dataTable.asLists();
               String User = Logindetails.get(0).get(0);
               String Pass = Logindetails.get(0).get(1);
               driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(User);
               driver.findElement(By.id("password")).sendKeys(Pass);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("user is navigated to  main page")
    public void user_is_navigated_to_main_page() {
        driver.getTitle();
    }

}
