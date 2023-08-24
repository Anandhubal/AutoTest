package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity8 {
	WebDriver driver;
	By log=By.xpath("//*[@id=\"site\"]/header/div[2]/ul/li[3]/a");
	By uname=By.xpath("//*[@id=\"emailAdd\"]");
	By pswd=By.xpath("//*[@id=\"passwordField\"]");
	
	public Activity8(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void entervalues(String location,String sh,String ur) throws IOException
	{
		//Data driven testing
		File f=new File(location);
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh1=wb.getSheet(sh);
		System.out.println(sh1.getLastRowNum());
		driver.findElement(log).click();
		for(int i=1;i<=sh1.getLastRowNum();i++)
		{
			String username=sh1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("usename is "+username);
			String password=sh1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password is "+password);
			
			driver.findElement(uname).clear();
			driver.findElement(uname).sendKeys(username);
			driver.findElement(pswd).clear();
			driver.findElement(pswd).sendKeys(password);
			
			String u=driver.getCurrentUrl();
			System.out.println(u);
			String exp=ur;
			if(u.equals(exp))
			{
				System.out.println("Successfully logined");
			}
			else
			{
				System.out.println("Unsuccessful");
			}
			
		}
		
	}

}
