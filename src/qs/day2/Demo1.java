package qs.day2;

//Day 2 -> Selenium 3rd program

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Demo1 {
  @Test
  public void f() {
	  
	  Reporter.log("Hi",true);
	  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Bye",true);
  }
  
  @AfterMethod
  
  public void afterMethod() {
	  Reporter.log("Byeeeeeeee",true);
  }

}
