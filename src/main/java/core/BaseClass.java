package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeSuite(alwaysRun=true)
	public void initDriver (){
		// TODO Auto-generated method stub
//		String userProfile= "C:\\Users\\l090222\\chromeprofile";
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("user-data-dir="+userProfile);
//		options.addArguments("--start-maximized");
//		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver(options);
		driver = new ChromeDriver();
	}

}
