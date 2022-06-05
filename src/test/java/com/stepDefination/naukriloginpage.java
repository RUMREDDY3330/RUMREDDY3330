package com.stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Pages.LoginPage;
import core.testUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class naukriloginpage  {
	LoginPage loginPage = new LoginPage();
	@Given("user in on login page")
	public void user_in_on_login_page(){
		loginPage.verifyUserOnloginpage();
	}
	@Then("user enterd user name")
	public void user_enterd_user_name() throws InterruptedException {
		loginPage.EnterUserName();
	}
	@Then("user enter password")
	public void user_enter_password() throws InterruptedException {
		loginPage.EnterPassword();
	}
	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		loginPage.ClickLogin();
	}
        @Then("user is on home page")
        public void user_is_on_home_page() throws InterruptedException {
        	
        		
        
        }
	}
	

