package mailsystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import mailsystem.pageobjects.LandingPage;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//
		LandingPage landingpage = new LandingPage(driver);
		landingpage.goTo();
		landingpage.loginApplication("piyushPandey09sept@outlook.com", "Banaras@65");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://outlook.live.com/owa/");
		/*driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Email, phone, or Skype\"]")).sendKeys("piyushPandey09sept@outlook.com");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("Banaras@65");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#idSIButton9")).click();	
		//Thread.sleep(2000);
		
		 driver.findElement(By.cssSelector("#idBtn_Back")).click();
	    //  Thread.sleep(10000);*/
		
		

	}

}
