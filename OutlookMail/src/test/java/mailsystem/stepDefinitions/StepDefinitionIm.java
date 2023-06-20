package mailsystem.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mailsystem.pageobjects.LandingPage;

public class StepDefinitionIm {
	WebDriver driver = new ChromeDriver();
	@Given("I landed on outlook login page")
	public void I_landed_on_outlook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver.get("https://outlook.live.com/owa/");
		driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		
	}
	
	@Given("^User Login with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username, String password)
	{
		driver.findElement(By.xpath("//input[@placeholder=\"Email, phone, or Skype\"]")).sendKeys("piyushPandey09sept@outlook.com");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("Banaras@65");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#idSIButton9")).click();	
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#idBtn_Back")).click();
	      //Thread.sleep(10000);
	}
	
	
	@When("^When User added To (.+) with subject (.+) and body (.+)$")
	public void When_User_added_To_with_subject_and_body()
	{
		driver.findElement(By.xpath("//div[@aria-label=\"New mail\"]")).click();
	     // Thread.sleep(5000);
	      
	      driver.findElement(By.cssSelector("div[aria-label='To']")).sendKeys("piyushPandey09sept@outlook.com");
	      
	      driver.findElement(By.xpath("//input[@placeholder='Add a subject']")).sendKeys("Incubyte");
	      
		driver.findElement(By.xpath("//div[@aria-label='Message body, press Alt+F10 to exit']")).sendKeys("Automation QA test for Incubyte");
		
		driver.findElement(By.xpath("//button[@title='Send (Ctrl+Enter)']")).click();
		
	}
	
	@Then("^The email should display in the Sent mail field with subject (.+)$")
	public void The_email_should_display_in_the_Sent_mail_field_with_subject_Incubyte()
	{
	System.out.println(driver.findElement(By.xpath("//*[text()='Greeting']")).getText());
	Assert.ass
	}

}
