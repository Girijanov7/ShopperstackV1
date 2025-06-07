package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log = LogManager.getLogger("Demo");
		System.out.println("this is logger msg");
		
		log.info("this is info msg NEW");
		log.error("this is error msg");

	}

}
