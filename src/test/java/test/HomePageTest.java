package test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testBase.TestBase;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	LoginPageTest login;
	
	@BeforeMethod
	public void init() throws IOException {
		initialization();
		homePage = new HomePage();
		//login.validateLogin();
		login.loginPage.usernameTxt(prop.getProperty("username"), prop.getProperty("password"));
		login.loginPage.passwordtxt(prop.getProperty("password"));
		
	}
	
	@Test
	public void validateNewBoard() {
		homePage.createBoard(prop.getProperty("Title"), prop.getProperty("ListTitle1"), prop.getProperty("ListTitle2"));
	}
	
	public void creatCard() {
		homePage.addBoardDetails(prop.getProperty("Ls1"), prop.getProperty("Ls2"));
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
}
