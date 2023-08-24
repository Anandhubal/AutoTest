package Pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Activity3 {
	WebDriver driver;
	By element=By.xpath("//*[@id=\"site\"]/header/div[2]/a/img");
	//By not=By.xpath("//*[@id=\"wzrk-cancel\"]");
	public Activity3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues(String location1, String location2) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(not).click();
		
		//Screenshot taken
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File(location1));
		
		//Element screenshot taken
		WebElement el = driver.findElement(element);
		File srcel=el.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcel, new File(location2));
		
	}

}
