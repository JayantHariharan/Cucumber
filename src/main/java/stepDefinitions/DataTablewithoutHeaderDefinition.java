package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import io.cucumber.datatable.DataTable;

public class DataTablewithoutHeaderDefinition {

	WebDriver driver;
	WebDriverWait wait;
	
	@Given("User as to enter google")
	public void user_as_to_enter_google() {
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions options=new ChromeOptions();
	   options.addArguments("--start-maximized");
	   options.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(options);
	   wait=new WebDriverWait(driver, Duration.ofSeconds(30000));
	   driver.get("https://www.google.co.in");
	}
	@Then("user has to enter")
	public void user_has_to_enter(DataTable dataTable1)  throws Throwable{
		List<String>creditsList=dataTable1.asList(String.class);
		String search1=creditsList.get(0);
		String search2=creditsList.get(1);
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("q")))).sendKeys(search1);
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("q")))).sendKeys(" "+search2+Keys.ENTER);
	}
	



}
