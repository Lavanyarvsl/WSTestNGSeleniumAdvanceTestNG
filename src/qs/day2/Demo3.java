package qs.day2;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;
//Day  -> Selenium 5th program
public class Demo3 
{
  @Test
  public void f() throws IOException 
  {
	  Layout layout=new PatternLayout(" %c %d %m %n");
	  Appender appender=new FileAppender(layout,"./report/result.log");
	  
	  
	  
	  BasicConfigurator.configure(appender);
	  
	  Logger log=Logger.getLogger("Demo");
	  
	  
	  log.info("hi");
	  //we have to check with Result.log
	  
	  
  }
}
