package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AddContact;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactStep {

	WebDriver driver;
//	LoginPage loginPage;
	AddContact addContactPage;

	@Before
	public void Before_run() {
		driver = BrowserFactory.init();
		addContactPage = PageFactory.initElements(driver, AddContact.class);
//		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	
	@When("^User should be able to click on Customers$")
	public void user_should_be_able_to_click_on_Customers() throws Throwable {
		addContactPage.customer();
		Thread.sleep(5000);
	}

	@When("^User should be able to click on Add Customer$")
	public void user_should_be_able_to_click_on_Add_Customer() throws Throwable {
		addContactPage.addCustomer();
		Thread.sleep(5000);
	}

	@When("^User enters fullname as \"([^\"]*)\"$")
	public void user_enters_fullname_as(String fullName) throws Throwable {
		addContactPage.fullName(fullName);
		Thread.sleep(5000);
	}

//	@When("^User enters company as $")
//	public void user_enters_company_as() throws Throwable {
//	    addContactPage.company(null);
//	}
	
	@When("^User enters company as \"([^\"]*)\"$")
	public void user_enters_company_as(String company) throws Throwable {
		addContactPage.company(company);
	}

	@When("^User enters email as \"([^\"]*)\"$")
	public void user_enters_email_as(String email) throws Throwable {
		addContactPage.email(email);
	}

	@When("^User enters phone as \"([^\"]*)\"$")
	public void user_enters_phone_as(String phone) throws Throwable {
		addContactPage.phone(phone);
	}

	@When("^User enters address as \"([^\"]*)\"$")
	public void user_enters_address_as(String address) throws Throwable {
		addContactPage.address(address);
	}

	@When("^User enters city as \"([^\"]*)\"$")
	public void user_enters_city_as(String city) throws Throwable {
		addContactPage.city(city);
	}

	@When("^User enters state as \"([^\"]*)\"$")
	public void user_enters_state_as(String state) throws Throwable {
		addContactPage.state(state);
	}

	@When("^User enters zip as \"([^\"]*)\"$")
	public void user_enters_zip_as(String zip) throws Throwable {
		addContactPage.zip(zip);
	}
	
//	@When("^User enters country as$")
//	public void user_enters_country_as(String country) throws Throwable {
//		addContactPage.country();
//	}
	
	@When("^User enters country as \"([^\"]*)\"$")
	public void user_enters_country_as(String country) throws Throwable {
		addContactPage.company(country);
	}
	
//	@When("^User enters tag as \"([^\"]*)\"$")
//	public void user_enters_tag_as(String tag) throws Throwable {
//		addContactPage.tag(tag);
//		Thread.sleep(5000);
//	}

	@Then("^User clicks on the Save Button$")
	public void user_clicks_on_the_Save_Button() throws Throwable {
		addContactPage.clickSaveButton(); 
		
		Thread.sleep(5000);
	}
	
	
	

//	@After
//	public void After_run() {
//		BrowserFactory closeBrowser = new BrowserFactory();
//		closeBrowser.tearDown();
//	}

	
}
