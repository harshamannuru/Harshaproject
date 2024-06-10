package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Baseclass {
	public static WebDriver driver;
	@BeforeClass
	public void OpenApp() {
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?authuser=0");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeApp() {

		//driver.quit(); 
	}
}
