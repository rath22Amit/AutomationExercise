package org.SelenumCucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private WebDriver driver;
    private By SignUp_Button = By.xpath("//a[@href='/login']");

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnSignUpButton(){
        driver.findElement(SignUp_Button).click();
    }
    public void launchURL(String url){
        driver.get(url);
    }
}
