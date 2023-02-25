package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class GmailApp {
	
	WebDriver driver;

	String Url = "https://accounts.google.com/";
	
	
	@Given("^Initilize and setups$")
	public void initilize_and_setups() {
		System.setProperty("webdriver.chrome.driver", "/Users/shahnazaruzimova/Desktop/Google Chrome /chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		
		driver.get(Url);

	}
	
}
