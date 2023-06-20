package mailsystem.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mailsystem.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{
	
	WebDriver driver;

	public LandingPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		//WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder=\"Email, phone, or Skype\"]"));
		
		//PageFactory dESIGN PATTERN
	//WebElement Signbutton =driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement Signbutton; 
	
	//username
		@FindBy(xpath="//input[@placeholder='Email, phone, or Skype']")
		WebElement userEmail; 
		
	//Next
		//WebElement Next = driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		@FindBy(xpath="//input[@type='submit']")
		WebElement Next; 

		
		//Password
		//WebElement Pass=driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("Banaras@65");
		@FindBy(xpath="/input[@name=passwd']")
		WebElement Password; 
		
		//Sign in
		//WebElement Signin=driver.findElement(By.cssSelector("#idSIButton9")).click();
		@FindBy(css="#idSIButton9")
		WebElement Signin; 
		
		public void loginApplication(String email, String pass)
		{
			
			Signbutton.click();
			userEmail.sendKeys(email);
			Next.click();
			Password.sendKeys(pass);
			Signin.click();
		}
		public void goTo()
		{
			driver.get("https://outlook.live.com/owa/");
		}
	}


