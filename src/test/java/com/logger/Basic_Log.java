package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Log {
	
	static Logger log = Logger.getLogger(Basic_Log.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("dubug");
		
		log.info("info");
		
		log.warn("warn");
		
		log.error("error");
		
		log.fatal("fatal");
	}
	

}
