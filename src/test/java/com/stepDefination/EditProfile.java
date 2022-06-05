package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.testUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class EditProfile {		
	 EditProfile Edit = new EditProfile();
	
	@Given("user click on a mynaukri")
	public void user_click_on_a_mynaukri() throws InterruptedException {
		Edit.user_click_on_a_mynaukri();
	    
	}
	@Given("user clik on EditProfiles")
	public void user_clik_on_edit_profiles() throws InterruptedException {
		Edit.user_clik_on_edit_profiles();
	    
	}
	@When("user clik on a resumeupdate")
	public void user_clik_on_a_resumeupdate() throws InterruptedException {
		Edit.user_clik_on_a_resumeupdate();
	    
	}
}
