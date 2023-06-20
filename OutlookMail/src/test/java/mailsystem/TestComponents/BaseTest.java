package mailsystem.TestComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import mailsystem.pageobjects.LandingPage;

public class BaseTest {
	
	public WebDriver driver;
	public LandingPage landingpage;
	public WebDriver initializeDriver() throws IOException
	{
		//Properties class
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\mailsystem\\resources\\GlobalData.properties"); 
		prop.load(fis);	
		String browserName = prop.getProperty("browser");
		
            WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeMethod
	public LandingPage launchApplication() throws IOException
	{
		 driver =initializeDriver();
		 landingpage = new LandingPage(driver);
		 landingpage.goTo();
		 return landingpage;
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
