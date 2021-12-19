package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Log {

	static Logger log = Logger.getLogger(Property_Log.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("debug");

		log.info("Full Information");

		log.warn("Waring");

		log.error("All Errors");

		log.fatal("Full Fatal");
	}

}
