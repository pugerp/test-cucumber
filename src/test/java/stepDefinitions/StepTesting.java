package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepTesting {

    WebDriver webDriver;

    @Given("I launch firefox browser")
    public void iLaunchFirefoxBrowser() {
        System.setProperty("webdriver.gecko.driver", "C://Users//pugerp//IdeaProjects//driver//gecko//geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("https://www.google.com/");
        webDriver.manage().window().maximize();
    }

    @When("I browser opened search fill search field with keyword little cat")
    public void iBrowserOpenedSearchFillSearchFieldWithKeywordLittleCat() {
        webDriver.findElement(By.name("q")).sendKeys("Little Cat");
        webDriver.findElement(By.name("btnK")).submit();
    }
}
