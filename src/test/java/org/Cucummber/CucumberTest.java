package org.Cucummber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberTest {

	WebDriver driver;

	@Given("user is on FB application")
	public void user_is_on_FB_application() {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String string, String string2) {

		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("user should valid login page")
	public void user_should_valid_login_page() {

		System.out.println("user is not valid login page ");
	}
}
