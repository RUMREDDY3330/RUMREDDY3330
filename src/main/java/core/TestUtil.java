package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUtil {
	public static WebDriver driver;
	
	
	public void initiateBrowser() throws InterruptedException {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	         driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.naukri.com/");
	        driver.findElement(By.className("Login")).click();
	        Thread.sleep(6000);}
}
