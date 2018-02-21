package qs.day2;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;
//Day  -> Selenium 6th program
public class Demo4 
{
  @Test
  public void f() throws IOException
  {
	  
	  Layout layout=new PatternLayout("%m %n");
	  Appender appender=new FileAppender(layout,"./report/result.log");
	  
	  
	  
	  BasicConfigurator.configure(appender);
	  
	  Logger log=Logger.getLogger("Demo");
	  //log.setLevel(Level.ALL);
	  //log.setLevel(Level.OFF);
	  //log.setLevel(Level.INFO);
	  log.trace("trace1");
	  log.warn("warn1");
	  log.debug("debug1");
	  log.info("info1");
	  
	  log.error("err1");
	  log.fatal("fatal1");
	  
  }
}
