package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class DemoClass {

	public static Logger log =LogManager.getLogger(DemoClass.class.getName());
	
	public static void main(String[] args)
	{
		log.info("kellos");
		log.fatal("New fayal");
		log.info("hellp");
		log.error("pops");
		log.info("nan");
		log.debug("nond");
	}
	

}
