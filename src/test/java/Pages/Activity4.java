package Pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity4 {
	WebDriver driver;
	By link=By.tagName("a");
	By none=By.xpath("//*[@id=\"wzrk-cancel\"]");
	public Activity4(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues(int count,String attribute,String txt) throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(none).click();

		List<WebElement> li = driver.findElements(link);
		System.out.println(txt+li.size());
		for(WebElement lin:li)
		{
			String links = lin.getAttribute(attribute);
			
			URL ob=new URL(links);
			HttpURLConnection con = (HttpURLConnection)ob.openConnection();
			con.connect();
			
			
			if(con.getResponseCode()==200)
			{
				System.out.println(count+" Valid link----"+links);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println(count+" Broken link----"+links);
			}
			count=count+1;
		}
		
	}}
	
	
	


