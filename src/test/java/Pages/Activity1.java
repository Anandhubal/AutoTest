package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Activity1 {
	WebDriver driver;
	By search=By.name("txtKeywords");
	By click=By.xpath("//*[@id=\"quickSearchBean\"]/button");
	//By searches=By.xpath("//*[@id=\"searchInputBox\"]/div[1]/span/button");
	//By non=By.xpath("//*[@id=\"wzrk-cancel\"]");
	
	public Activity1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues(String value,String title,String pages)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(non).click();
		System.out.println("Title of Website: "+title);
		System.out.println("Page source of Website : "+pages);
		driver.findElement(search).click();
		driver.findElement(click).sendKeys(value);
		
		
		
	}

}
