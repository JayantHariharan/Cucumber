package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Background_Hooks {
	@Before()
	public void beforeScenario() {
		System.out.println("This is about me");
	}
	@After()
	public void afterScenario() {
		System.out.println("What did u think about me?");
	}
}
