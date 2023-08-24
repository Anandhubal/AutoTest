package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity2 {
	WebDriver driver;
	By links=By.tagName("a");
	public Activity2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues(String text, String attribute,int count)
	{
		List<WebElement> li = driver.findElements(links);
		System.out.println(text+li.size());
		for(WebElement a:li)
		{
			String p=a.getAttribute(attribute);
			String t=a.getText();
			System.out.println("Link "+count+" is "+p+" and its text is "+t);
			count=count+1;
		}
	}

}
