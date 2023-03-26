package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OpenGoogle {

	WebDriver driver;
	@Given("user enters {string} in browser")
	public void user_enters_in_browser(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
	    driver=new ChromeDriver(options);
	    driver.navigate().to(url);
	}
	@When("user enters {string} in the search page")
	public void user_enters_in_the_search_page(String search) {
	    driver.findElement(By.name("q")).sendKeys(search);
	}
	@When("user clicks the enter button")
	public void user_clicks_the_enter_button() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);;
	}
	@Then("the Pro_Gamer25 search results shown")
	public void the_pro_gamer25_search_results_shown() {
	    String status=driver.findElement(By.xpath("//div[@class='MjjYud']//div//a//h3")).getText();
	    Assert.assertTrue(status.contains("Pro_Gamer"));
	    driver.quit();
	}



}
