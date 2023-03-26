package stepDefinitions;

import io.cucumber.java.en.Given;

public class TaggedHooks {

	@Given("i like eren yeager so much")
	public void i_like_eren_yeager_so_much() {
	    System.out.println("Eren is my hero");
	}


@Given("i like takimichi so much")
public void i_like_takimichi_so_much() {
    System.out.println("Takimitichi is brave");
}

}
