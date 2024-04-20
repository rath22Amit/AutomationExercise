package stepDefinitions;

import java.time.Duration;

import java.time.Duration;
import io.cucumber.java.en.*;
import org.SelenumCucumber.PageObjects.BaseClass;
import org.SelenumCucumber.PageObjects.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUser_StepDef extends BaseClass {

    @Given("^Launch the Browser and navigate to the (.*)$")
    public void launch_the_browser_and_navigate_to_the(String url) {
        landingPage.launchURL(url);
    }

    @When("The user clicks on the SignUp button")
    public void the_user_clicks_on_the_SignUp_button() {

        landingPage.clickOnSignUpButton();
        WebElement verify_text =driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        System.out.println(verify_text.isDisplayed());
    }

    @When("The user enters all the details in the Enter Account Information Page")
    public void the_user_enters_all_the_details_in_the_page() {
        System.out.println("the_user_enters_all_the_details_in_the_page");
         
    }

    @When("Selects the checkbox for Sign Up for Our Newsletter!")
    public void selects_the_checkbox_for() {
        System.out.println("Selects the checkbox for Sign Up for Our Newsletter!");
    }

    @When("Click on Create Account Button")
    public void click_on_create_account_button() {
        System.out.println("click_on_create_account_button");
         
    }
    @Then("Verify that Logged in with username")
    public void verify_that_logged_in_with_username() {
        System.out.println("verify_that_logged_in_with_username");
         
    }
}
