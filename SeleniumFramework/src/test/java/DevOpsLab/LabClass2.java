package DevOpsLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LabClass2 {
	
WebDriver driver = null; 
	
	@BeforeTest
	public void SetUp() {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SeleniumFramework\\Drivers\\chrome\\chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver(); 
		
		 driver = new ChromeDriver(); 
		
	}
	
	@Test
    public void Search() {
		
		
		driver.get("https://www.lyit.ie/Student-Hub");
	}
	
	@AfterTest
  
    public void Close() {
		
		
		driver.close();
		
		driver.quit();
		
		System.out.print("Test Completed Successfully");
	}

}
