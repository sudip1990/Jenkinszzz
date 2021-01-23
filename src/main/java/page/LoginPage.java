package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "username")
	WebElement USER_NAME_ELEMENT;
	
	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_ELEMENT;
	
	@FindBy(how = How.NAME, using = "login")
	WebElement SIGNIN_ELEMENT;

	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	
	}
	//Actions
	public void enterUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSignInButton() {
		SIGNIN_ELEMENT.click();
	}
	
//	public void enterCredentials(String userName, String password) {
//		USER_NAME_ELEMENT.sendKeys(userName);
//		PASSWORD_ELEMENT.sendKeys(password);
//	}
//	
//	public void clickOnSignInButton() {
//		SIGNIN_ELEMENT.click();
//	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	

}