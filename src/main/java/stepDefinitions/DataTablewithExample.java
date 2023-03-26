package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTablewithExample {

	WebDriver driver;
	@Given("user has to enter the {string}")
	public void user_has_to_enter_the(String string) {
		 WebDriverManager.chromedriver().setup();
		   ChromeOptions options=new ChromeOptions();
		   options.addArguments("--start-maximized");
		   options.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(options);
		   driver.get(string);
	}
	@Then("user has to enter their credintials {string} and {string}")
	public void user_has_to_enter_their_credintials_and(String userName, String password) throws InterruptedException {
	
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password+Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		
	}



}
