package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	public Logger log;
	public Properties prop;
	
	@BeforeClass(groups= {"sanity","reggretion","master"})
	@Parameters({"os","browser"})
	public void setup(String os, String br) throws InterruptedException, IOException {
		
		//loading config.properties file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		prop=new Properties();
		prop.load(file);
		//----------------------------------------------------------
		
		log = LogManager.getLogger(this.getClass());
		
		switch(br) {
		case "chrome": driver = new ChromeDriver();
		break;
		case "edge": driver = new EdgeDriver();
		break;
		default:System.out.println("Invalid browser input");
		return;
		
		}
		
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("appURL"));

		
	}
	
	@AfterClass(groups= {"sanity","reggretion","master"})
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
