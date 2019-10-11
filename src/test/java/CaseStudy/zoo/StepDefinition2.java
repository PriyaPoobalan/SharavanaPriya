package CaseStudy.zoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
//import cucumber.cucumberselenium1.Utilityclass;

public class StepDefinition2 {
	WebDriver driver;
	@Given("^user not login$")
	public void user_not_login() throws Throwable {
		driver = Utilityclass.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	}


@When("user performs  {string} and {string}")
public void user_performs_and(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		driver.findElement(By.name("Login")).click();
		
		


	}

	@Then("Login successful")
	public void login_successful() {
		Assert.assertEquals(driver.getTitle(),"Home");

	    driver.close();

	}



}
