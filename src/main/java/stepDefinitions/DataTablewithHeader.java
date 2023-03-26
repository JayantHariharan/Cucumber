package stepDefinitions;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTablewithHeader {

	WebDriver driver;
	@Given("user has to enter {string}")
	public void user_has_to_enter(String string) {
		 WebDriverManager.chromedriver().setup();
		   ChromeOptions options=new ChromeOptions();
		   options.addArguments("--start-maximized");
		   options.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(options);
		   driver.get(string);
	}
	@Then("user has to enter channel name and game name")
	public void user_has_to_enter_channel_name_and_game_name(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>>keyValuePair=dataTable.asMaps(String.class,String.class);
	   String channel=keyValuePair.get(0).get("channel");
	   String game=keyValuePair.get(0).get("game");
	   driver.findElement(By.name("q")).sendKeys(channel+" "+game+Keys.ENTER);
	}

}
