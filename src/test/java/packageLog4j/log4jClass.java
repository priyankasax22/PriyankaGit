package packageLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class log4jClass {


	private static Logger log=LogManager.getLogger(log4jClass.class.getName());
	
	@Test
	public void logg()
	{
		log.debug("debug message");
		log.error("error message");
		log.fatal("fetal message");
		
	}
}
