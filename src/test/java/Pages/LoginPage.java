package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import core.TestUtil;

public class LoginPage extends TestUtil {
	private By PrimaryLoginBtn = (By.className("Login"));
	private By PrimaryUserName = (By.xpath("//form[@name='login-form']/div[2]/input"));
	private By PrimaryLoginPwd = (By.xpath("//input[@placeholder='Enter your password']"));
	private By PrimarySubBtn = (By.xpath("//button[@type='submit']"));
	private By PrimaryHomePage = (By.xpath("//form[@id='search-jobs']/div"));
	private By Logintext = By.xpath("//*[@class='login-layer']/div[1]");
	
	public void verifyUserOnloginpage() throws InterruptedException {
		String actualLoginText = driver.findElement(Logintext).getText();
		Assert.assertEquals("Login page did not display", actualLoginText, "Login");
		Thread.sleep(4000);
	}

	public void EnterUrl() throws InterruptedException {

		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
	}

	public void ClickLogin() throws InterruptedException {
		driver.findElement(PrimaryLoginBtn).click();
		Thread.sleep(6000);
	}

	public void EnterUserName() throws InterruptedException {
		driver.findElement(PrimaryUserName)
				.sendKeys("umamaheswarareddy.ramireddy@gmail.com");
		Thread.sleep(2000);
	}

	public void EnterPassword() throws InterruptedException {
		driver.findElement(PrimaryLoginPwd).sendKeys("Password@1234");
		Thread.sleep(2000);

	}

	public void UserSubmitedButton() throws InterruptedException {
		driver.findElement(PrimarySubBtn).click();
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
	}
public void UserIsonHomePage() throws InterruptedException {
    String expectedSearchjJobTextv = driver.findElement(PrimaryHomePage).getText();
    Assert.assertEquals(expectedSearchjJobTextv, "Search Jobs");
    Thread.sleep(3000);
}
}
