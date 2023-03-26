package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EndgameHooks {

	@Given("Thanos got the six infinity stones")
	public void thanos_got_the_six_infinity_stones() {
	    System.out.println("Thanos got the six infinity stones");
	}
	@When("all the stones placed in gaulent")
	public void all_the_stones_placed_in_gaulent() {
	    System.out.println("Now placing all stones in the gaulent");
	}
	@Then("Thanos snap his finger")
	public void thanos_snap_his_finger() {
	    System.out.println("Then Thanos snap his finger");
	}
	@Then("half of the population is vanished")
	public void half_of_the_population_is_vanished() {
	    System.out.println("Population begin to vanish");
	}
}
