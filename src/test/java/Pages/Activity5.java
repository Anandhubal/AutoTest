package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Activity5 {
	WebDriver driver;
	By exp=By.xpath("//*[@id=\"cboWorkExp1\"]");
	//By regsel=By.id("ctl00_PlaceHolderMain_ddlRegisterType");
	//By uidtype=By.id("ctl00_PlaceHolderMain_JSLeftNavigation1_ddlKYCType");
	//By industry=By.xpath("//*[@id=\"advance-search\"]/div/div/div[2]/form/div[3]/div/div[1]/div/div[1]/div[1]");
	
	public Activity5(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues(String reg1,String text1,String ycount,String mcount) 
	{
		
		//Drop down selection using different methods
		WebElement yr = driver.findElement(exp);
		Select yr1=new Select(yr);
		yr1.selectByValue(reg1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//yr.clear();
		//WebElement mt = driver.findElement(exp);
		Select mt1=new Select(yr);
		//mt1.deselectByIndex(text);
		//mt.clear();
		mt1.selectByVisibleText(text1);
		
		
		List<WebElement> y = yr1.getOptions();
		System.out.println(ycount+y.size());
		
		List<WebElement> m = mt1.getOptions();
		System.out.println(mcount+m.size());
		
		
	}

}
