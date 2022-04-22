package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//div[@class='board-tile mod-add']")
	WebElement createNewBoard;
	
	@FindBy(xpath= "//input[@type='text']")
	WebElement boardTitle;
	
	@FindBy(xpath= "//button[text()='Create']")
	WebElement createBtn;
	

	@FindBy(xpath= "//input[@type='text']")
	WebElement listTitle1;
	

	@FindBy(xpath= "//input[@type='submit']")
	WebElement addList;
	

	@FindBy(xpath= "//input[@type='text']")
	WebElement listTitle2;
	
	@FindBy (xpath="//span[text()='Add a card']")
	WebElement addBtn1;
	
	@FindBy (xpath="/textarea[contains(@class,'list-card-compose')]")
	WebElement lplist1;
	
	@FindBy (xpath="//span[text()='Add a card']")
	WebElement add1;
	
	@FindBy (xpath="//textarea[contains(@class,'list-card-compose')]")
	WebElement add2;
	
	@FindBy (xpath="(//input[@type='submit'])[1]") //2
	WebElement addclk1;
	
	@FindBy (xpath="(//input[@type='submit'])[2]")
	WebElement addclk2;

	@FindBy(xpath="//a[@aria-label='Cancel list editing']")
	WebElement clk;
	
	@FindBy(xpath="(//span[@class='list-card-title js-card-name'])[2]")
	WebElement drag;
	
	@FindBy(xpath="(//div[contains(@class,'list-header-')])[3]")
	WebElement drop;
	
	@FindBy(xpath= "//span[@title='Srushti (srushtinewase20)']")
	WebElement logoutclick;
	
	@FindBy(xpath= "//span[text()='Log out']")
	WebElement logoutclick2;
	
	@FindBy(xpath = "//span[@class='css-19r5em7']")
	WebElement logutclick3;
	
	public void createBoard(String prop1, String prop2, String prop3) {
		createNewBoard.click();
		boardTitle.sendKeys(prop1);
		createBtn.click();
		listTitle1.sendKeys(prop2);
		addList.click();
		listTitle2.sendKeys(prop3);
		addBtn1.click();
	}

	public void addBoardDetails(String pr1, String pr2) {
		add1.click();
		add2.sendKeys(pr1);
		addclk1.click();
		add2.sendKeys(pr2);
		addclk2.click();
		clk.click();
	
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}
	public void logout() {
		logoutclick.click();
		logoutclick2.click();
		logoutclick2.click();
		
		WebElement element= driver.findElement(By.xpath("//span[@class='list-card-title js-card-name'])[3]"));
		System.out.println(element.getLocation());
		System.out.println(element.getSize());
	}
}
