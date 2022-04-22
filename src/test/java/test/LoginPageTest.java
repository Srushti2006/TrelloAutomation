package test;

import java.io.IOException;

import org.testng.annotations.*;

import pages.LoginPage;
import testBase.TestBase;


public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	
	@BeforeMethod
	public void init() throws IOException {
		initialization();
		loginPage = new LoginPage();
		loginPage.usernameTxt(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.passwordtxt(prop.getProperty("password"));
		
	}
	
	@Test
	public void validateLogin() {
		loginPage.usernameTxt(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.passwordtxt(prop.getProperty("password"));
		
	}
//	@Test
//	public void validateCreateBoard() {
//		loginPage.createBoard(prop.getProperty("Title"), prop.getProperty("ListTitle1"), prop.getProperty("ListTitle2"));
//	}
//	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
