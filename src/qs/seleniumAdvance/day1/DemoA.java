package qs.seleniumAdvance.day1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListner.class)
public class DemoA 
{
  @Test
  public void testA1() 
  {
	  
	  Reporter.log("testA1", true);
	  
  }
  
  @Test
  public void testA2() 
  {
	  
	  Reporter.log("testA1", true);
	  Assert.fail();
  }
  
  
}
