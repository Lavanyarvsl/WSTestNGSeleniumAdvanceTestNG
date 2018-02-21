package qs.day2;

//Day  -> Selenium 4th program
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class Demo2 {
  @Test
  public void test() {
	  //configure  log4j
	  BasicConfigurator.configure();
	  //get the obj of log4j
	  //Logger log=Logger.getLogger("Demo2");
	  Logger log=Logger.getLogger(this.getClass());
	  System.out.println(this.getClass());
	  
	  
	  //print the msg
	  log.info("Hi");
	  log.info("Bye");
  }
}
