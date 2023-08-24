package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
	WebDriver driver;
	By register=By.xpath("//*[@id=\"site\"]/header/div[2]/ul/li[3]/a");
	By username=By.id("emailAdd");
	By password=By.name("password");
	
	public Activity6(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues(String value,String a,String c,String v)
	{
		driver.findElement(register).click();
		WebElement usename = driver.findElement(username);
		usename.sendKeys(value);
		WebElement passwd = driver.findElement(password);
		Actions act=new Actions(driver);
		act.keyDown(usename,Keys.CONTROL).sendKeys(a).keyUp(Keys.CONTROL);
		act.keyDown(usename, Keys.CONTROL).sendKeys(c).keyUp(Keys.CONTROL);
		act.keyDown(passwd, Keys.CONTROL).sendKeys(v).keyUp(Keys.CONTROL);
		act.perform();
	}

}
