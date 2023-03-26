package stepDefinitions;

import io.cucumber.java.en.Given;

public class AboutMeStepDefinitions {


@Given("It is so complicated for me")
public void it_is_so_complicated_for_me() {
    System.out.println("I am a good person or bad person");
}
	@Given("^I am \"(.*?)\"$")
	public void I_am(String name) {
	   System.out.println("My name is "+name);
	}
	@Given("^I am scored (\\d+\\.\\d+) GPA$")
	public void i_am_scored_gpa(Double double1) {
	    System.out.println("My GPA is "+double1);
	}
	@Given("^My age is (\\d+)$")
	public void my_age_is(Integer age) {
	  System.out.println("My age is "+age);
	}
	@Given("^My nickname is \"(.*?)\" and also known as \"(.*?)\"$")
	public void i_am_and_also_known_as(String nickName1, String nickName2) {
	    System.out.println("I am also called as "+nickName1+" and "+nickName2);
	}



}
