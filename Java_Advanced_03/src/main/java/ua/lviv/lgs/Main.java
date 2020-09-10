package ua.lviv.lgs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

	private static final Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		DOMConfigurator.configure("loggerConfig.xml");
		
		log.debug("Tis a debug!");
		log.info("Tis an info!");
		log.warn("Tis a warn!");
		log.error("Tis an error!");

	}

}
