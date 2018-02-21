package qs.seleniumAdvance.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest 
{
	private WebDriver driver;
	
  @Test
  public void f() 
  {
	 
		driver.get("http://www.google.com");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\seleniumAdvance3.6NewJars\\SeleniumChromeDriver\\chromedriver.exe");
	   driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
