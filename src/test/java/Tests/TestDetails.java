package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Activity1;
import Pages.Activity10;
import Pages.Activity2;
import Pages.Activity3;
import Pages.Activity4;
import Pages.Activity5;
import Pages.Activity6;
import Pages.Activity7;
import Pages.Activity8;
import Pages.Activity9;

public class TestDetails {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.timesjobs.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testactivity1() throws Exception
	{
		Activity1 act1=new Activity1(driver);//entering values in field
		String ti=driver.getTitle();
		String ps=driver.getPageSource();
		act1.entervalues("Automation Testing",ti, ps);
		
	}
	
	@Test
	public void testactivity2() throws Exception
	{
		Activity2 act2=new Activity2(driver);//Acquire all the links in the web site using tagname locator
		act2.entervalues("Number of links: ","href", 1);
	}
	
	@Test
	public void testactivity3() throws Exception
	{
		Activity3 act3=new Activity3(driver);//Screenshot taking
		act3.entervalues("E://ANANDHU//Selenium/src1.png", "E://ANANDHU//Selenium/srcel1.png");
	}
	
	@Test
	public void testactivity4() throws Exception
	{
		Activity4 act4=new Activity4(driver);
		act4.entervalues(1, "href", "Total number of links : ");
		
	}
	
	@Test
	public void testactivity5() throws Exception
	{
		Activity5 act5=new Activity5(driver);//Selecting the value from drop down list using Select class
		act5.entervalues("1", "3 years", "Year count", "Month count");
	}
	
	@Test
	public void testactivity6() throws Exception
	{
		Activity6 act6=new Activity6(driver);// mouse and keyboard actions using Actions class
		act6.entervalues("abcakm@gmail.com", "a", "c", "v");
	}
	
	@Test
	public void testactivity7()throws Exception
	{
		Activity7 act7=new Activity7(driver);//Scroll down web page
		act7.entervalues("window.scrollBy(0,1500)");
	}
	
	@Test
	public void testactivity8() throws Exception
	{
		Activity8 act8=new Activity8(driver);//Data driven testing
		act8.entervalues("E:\\ANANDHU\\Selenium\\data.xlsx", "Sheet1","https://www.timesjobs.com/");
	}
	
	@Test
	public void testactivity9() throws Exception
	{
		Activity9 act9=new Activity9(driver);//Multiple window handling
		act9.entervalues("Kottayam");
	}
	
	@Test
	public void testactivity10() throws Exception
	{
		Activity10 act10=new Activity10(driver);
		act10.entervalues();
		act10.ent1("E:\\ANANDHU\\Selenium\\AMAZON ASSIGNMENT.pdf");
	}
	

}
