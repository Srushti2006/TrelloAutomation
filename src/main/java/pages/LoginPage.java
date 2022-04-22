package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user")
	WebElement username;
	
	@FindBy(xpath ="//input[@id='password']")
	WebElement password;
	
	@FindBy(id= "login")
	WebElement loginbtn; 
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement Loginbtn2;
	
	@FindBy(xpath= "//div[@class='board-tile mod-add']")
	WebElement createNewBoard;
	
	@FindBy(xpath= "//input[@type='text']")
	WebElement boardTitle;
	
	@FindBy(xpath= "//button[text()='Create']")
	WebElement createBtn;
	

	@FindBy(xpath= "//div[contains(@class,'list-header js-')]")
	WebElement listTitle1;
	

	@FindBy(xpath= "//input[@type='submit']")
	WebElement addList;
	

	@FindBy(xpath= "//input[@type='text']")
	WebElement listTitle2;



	public void usernameTxt(String un , String pass) {
		username.sendKeys(un);
		loginbtn.click();
		//password.sendKeys(pass);
		
	}
	public void passwordtxt(String pass2) {
		password.click();
		password.sendKeys(String.valueOf(pass2));
		Loginbtn2.click();
		password.sendKeys(pass2);
		Loginbtn2.click();
	
	}
	

}


