package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchStepsDefinition {
static WebDriver driver;
    @Given("User navigates to chrome browser")
    public void user_navigates_to_chrome_browser() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @When("user successfully enters macys in search bar")
    public void user_successfully_enters_macys_in_search_bar() {
        WebElement searchBar = driver.findElement(By.xpath("//*[@title=\"Search\"]"));
        searchBar.sendKeys("macys");
        searchBar.sendKeys(Keys.ENTER);
    }

    @Then("validate the macy's home site is displayed")
    public void validate_the_macy_s_home_site_is_displayed() {
        WebElement searchResult = (driver.findElement(By.xpath("//a[@href='https://www.macys.com/']")));
        Assert.assertTrue(searchResult.isDisplayed());

    }

    @And("close the browser")
    public void close_the_browser() {

        driver.close();

    }
    }

