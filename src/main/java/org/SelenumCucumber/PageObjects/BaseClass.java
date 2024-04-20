package org.SelenumCucumber.PageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public Duration waitTime = Duration.ofSeconds(10);
    public LandingPage landingPage = new LandingPage(driver);
}
