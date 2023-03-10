package Features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MMA {
	@Given("I am interested in learning MMA")
	public void i_am() {
		System.out.println("I am interested in learning MMA");
	}
	 @ And("I went online to find different MMA Gyms")
	 public void i_went() {
		 System.out.println("I went online to find different MMA Gyms");
	 }
	    @And("I shortlisted 4 MMA Gyms near my place")
	    public void i_shortlisted() {
	    	System.out.println("I shortlisted 4 MMA Gyms near my place");
	    }
	    @When("I enquired about one gym closest to my place they asked me to come and have a look")
	    public void i_enquired() {
	    	System.out.println("I enquired about one gym closest to my place they asked me to come and have a look");
	    }
	    @And("I decided to visit them")
	    public void i_decided() {
	    	System.out.println("I decided to visit them");
	    }
	    @When ("I wentto visit the Gym on 20 Aug 2020")
	    public void i_wentto() {
	    	System.out.println("I wentto visit the Gym on 20 Aug 2020");
	    }
	    @And ("I decided to book membership for 3 months")
	    public void i_decided_to() {
	    	System.out.println("I decided to book membership for 3 months");
	    }
	    @But ("I decided to keep a trainer")
	    public void i_decided_to_keep() {
	    	System.out.println("I decided to keep a trainer");
	    }
	    @Then ("I bargained and received a discount of 20%")	
	    public void i_bargained() {
	    	System.out.println("I bargained and received a discount of 20%");
	    }
}
