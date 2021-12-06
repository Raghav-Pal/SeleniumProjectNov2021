package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	
	static Logger logger = LogManager.getLogger(Log4JDemo.class);
	
	public static void main(String[] args) {
		
		System.out.println(" I am inside main ");
		logger.debug(" this is debug message");
		logger.info(" this is info message");
		logger.warn(" this is warning");
		logger.error(" this is error message");
		logger.fatal(" this is fatal");
		logger.trace(" this is trace message");
	}

}
