package org.AdactinStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class AdactinStepDefinition extends BaseClass {
	
	//You can implement missing steps with the snippets below:

		@Given("valid url")
		public void valid_url() {
			getdriver();
		  
		}

		@When("I launch the browser it should navigate facbook")
		public void i_launch_the_browser_it_should_navigate_facbook() {
		    loadUrl("https://en-gb.facebook.com/");
		}

		@When("I enters valid username {string}")
		public void i_enters_valid_username(String UserName) {
			WebElement txtUser = driver.findElement(By.id("email"));
			txtUser.sendKeys(UserName);
		}

		@When("I enter valid password{string}")
		public void i_enter_valid_password_lakshmi(String Password) {
			WebElement txtPass = findById("pass");
			sendValues(txtPass, Password);
			
		}

		@Then("Login button should be click{string}")
		public void Login_button_should_be_click(String click) {
			 WebElement loginBtn = findByName("login");
			 loginBtn.click();
			
		}

		@Then("I validate the outcomes")
		public void i_validate_the_outcomes() {
			}

		@When("I enter valid password'vasanth@{string}'")
		public void i_enter_valid_password_vasanth(String Password) {
			WebElement txtPass = findById("pass");
			sendValues(txtPass, Password);
		}

		@When("I enter valid password'aravbindh@{string}'")
		public void i_enter_valid_password_aravbindh(String Password) {
			WebElement txtPass = findById("pass");
			sendValues(txtPass, Password);
		}
//		@Given ("Get valid url")
//		public void Get_valid_url(){
//		}
//		
//		   @When("I launch the browser it should navigate Adactin")
//		public void I_launch_the_browser_it_should_navigate_Adactin() {
//			   loadUrl("https://adactinhotelapp.com/");
//					}
//
////		
////		   @When (I enters valid username 'username')
////		   @ When( I enter valid password'password')
////		   @Then (Login button should be click'login')
////		   @Then (I validate the successful login )
////
////
}
