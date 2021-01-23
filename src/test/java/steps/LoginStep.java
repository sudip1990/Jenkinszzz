package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStep {
	WebDriver driver;
	LoginPage loginPage;

	@Before
	public void Before_run() {
		driver = BrowserFactory.init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on Techfios Login Page$")
	public void user_is_on_Techfios_Login_Page() throws Throwable {
//		driver = BrowserFactory.init();
//		loginPage = PageFactory.initElements(driver, LoginPage.class);
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String userName) throws Throwable {
		loginPage.enterUserName(userName);
		Thread.sleep(3000);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
	}

	@And("^User clicks on the log in Button$")
	public void user_clicks_on_the_log_in_Button() throws Throwable {
		loginPage.clickSignInButton();

	}

	@Then("^User will be able to see DashBoard page$")
	public void user_will_be_able_to_see_DashBoard_page() throws Throwable {
		// loginPage.clickOnSignInButton();
		String expectedTitle = "Dashboard- iBilling";
		String actualTitile = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitile);
		System.out.println(actualTitile);
	}

	/*
	 * @After public void After_run() { BrowserFactory closeBrowser = new
	 * BrowserFactory(); closeBrowser.tearDown(); }
	 */

}
