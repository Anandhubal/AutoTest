package Pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity9 {
	WebDriver driver;
	By com=By.xpath("//*[@id=\"site\"]/section/div[1]/div[2]/div/ul/li[2]/a/img");
	By loc=By.xpath("//*[@id=\"txtLocation\"]");
	By jo=By.xpath("//*[@id=\"quickSearchBean\"]/button");
		
	public Activity9(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues(String val)
	{
		
		String cw=driver.getWindowHandle();
		//driver.findElement(cont).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(com).click();
		//driver.switchTo().alert().accept();
		Set<String> alw = driver.getWindowHandles();
		for(String han:alw)
		{
			System.out.println(han);
			if(!han.equalsIgnoreCase(cw))
			{
				driver.switchTo().window(han);
				driver.findElement(loc).sendKeys(val);
				driver.findElement(jo).click();
				driver.close();
			}
			driver.switchTo().window(cw);
		}
	}

}
