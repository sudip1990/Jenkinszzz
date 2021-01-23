package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddContact {
	WebDriver driver;

	public AddContact(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.ID, using = "username")
	WebElement USER_NAME_ELEMENT;

	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_ELEMENT;

	@FindBy(how = How.NAME, using = "login")
	WebElement SIGNIN_ELEMENT;

	@FindBy(how = How.XPATH, using = "//span[text()='Customers']")
	WebElement CUSTOMERS_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]")
//	WebElement CUSTOMERS_ELEMENT;

	@FindBy(how = How.XPATH, using = "//a[contains(@href,'https://techfios.com/billing/?ng=contacts/add/')]")
	WebElement ADD_CUSTOMER_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_ELEMENT;
	
//	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
//	WebElement COMPANY_ELEMENT;
	
//	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
//	WebElement COMPANY_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_ELEMENT;

//	@FindBy(how = How.XPATH, using = "//span[text()='United States']")
//	WebElement COUNTRY_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//span[@class='select2-selection select2-selection--single']")
	WebElement COUNTRY_ELEMENT;
	
//	@FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[1]/div[10]/div/span/span[1]/span")
//	WebElement TAG_ELEMENT;

	@FindBy(how = How.XPATH, using = "//button[@type='submit' and  @class='md-btn md-btn-primary waves-effect waves-light']")
	WebElement SAVE_BUTTON_ELEMENT;
	
	public AddContact() {
		PageFactory.initElements(driver, this);

	}

	// Actions

	public void enterUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void clickSignInButton() {
		SIGNIN_ELEMENT.click();
	}

	public void customer() {
		CUSTOMERS_ELEMENT.click();
	}

	public void addCustomer() {
		ADD_CUSTOMER_ELEMENT.click();
	}

	public void fullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName);
	}

	public void company(String company) {
//		COMPANY_ELEMENT.click();
		Select company1 = new Select(COMPANY_ELEMENT);
		company1.selectByVisibleText("Techfios");
		
		
		
//		WebElement COMPANY_DROPDOWN = driver.findElement(By.xpath("//select[@id='cid']"));
//		Select sel = new Select(COMPANY_DROPDOWN);
//		sel.selectByVisibleText("Techfios");
		
	}

	public void email(String email) {
		EMAIL_ELEMENT.sendKeys(email);
	}

	public void phone(String phone) {
		PHONE_ELEMENT.sendKeys(phone);
	}

	public void address(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}

	public void city(String city) {
		CITY_ELEMENT.sendKeys(city);
	}

	public void state(String state) {
		STATE_ELEMENT.sendKeys(state);
	}

	public void zip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
	}

	public void country() {
//		COUNTRY_ELEMENT.click();
		Select country = new Select(COUNTRY_ELEMENT);
		country.selectByVisibleText("United States");
		
	}

//	public void tag(String tag) {
//		ZIP_ELEMENT.sendKeys(tag);
//	}
	
	public void clickSaveButton() {
		SAVE_BUTTON_ELEMENT.click();
	}

}
