package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity10 {
	WebDriver driver;
	By reg1=By.xpath("//*[@id=\"site\"]/header/div[2]/ul/li[3]/a");
	By fiup=By.xpath("/html/body/div[4]");
	
	public Activity10(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues()
	{
		driver.findElement(reg1).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(fiup).click();
		
		
	}
	
	public void ent1(String locate) throws AWTException
	{
		StringSelection stsel=new StringSelection(locate);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stsel, null);
		Robot robot=new Robot();
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	

}
