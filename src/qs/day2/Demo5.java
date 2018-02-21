package qs.day2;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;


import org.apache.log4j.Logger;

import org.testng.annotations.Test;
//Day  -> Selenium 7th program
public class Demo5 
{
  @Test
  public void f() {
	  //Layout layout=new PatternLayout("%m %n");
	 // Appender appender=new FileAppender(layout,"./report/result.log");
	  
	  
	  
	  //BasicConfigurator.configure(appender);
	  
	  Logger log=Logger.getLogger("Demo");
	  
	  log.warn("warn1");
	  log.debug("debug1");
	  log.info("info1");
	  
	  log.error("err1");
	  log.fatal("fatal1");
  }
}
