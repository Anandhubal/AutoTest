
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Activity7 {
	WebDriver driver;
	By jobs=By.xpath("//*[@id=\"site\"]/footer/div[2]/ul[2]/li[2]/a");
	
	public Activity7(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues(String scroll)
	{
		//Scroll down web page and click the link at the bottom of page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(scroll, "");
		
		driver.findElement(jobs).click();
	}

}
