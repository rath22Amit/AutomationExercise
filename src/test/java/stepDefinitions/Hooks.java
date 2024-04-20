package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.SelenumCucumber.PageObjects.BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(waitTime);
    }

    @After
    public void teardown(){
        driver.close();
    }
}
