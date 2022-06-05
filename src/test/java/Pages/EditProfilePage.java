package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.testUtility;

public class EditProfilePage extends testUtility {
	private By UserMyNaukri = (By.xpath("//a[@href='https://my.naukri.com/HomePage/view']/div[2]"));
	private By EditProfile = (By.xpath("//a[@title='Edit Profile']"));
	private By ResumeCV = (By.xpath("//input[@id='attachCV']"));
	

public void MyNaukri () throws InterruptedException {
	Thread.sleep(2000);
	WebElement wx =driver.findElement(UserMyNaukri);
	Actions actions = new Actions(driver);
	actions.moveToElement(wx);
    actions.perform();
    Thread.sleep(2000);
}
public void EditProfile () throws InterruptedException {
	driver.findElement(EditProfile).click();		
    Thread.sleep(4000);
}
public void ResumeUpdate () throws InterruptedException {
	driver.findElement(ResumeCV).sendKeys("C:\\Users\\HP\\Documents\\mahesh\\mahesh resume.docx");
	Thread.sleep(5000);
}
}
