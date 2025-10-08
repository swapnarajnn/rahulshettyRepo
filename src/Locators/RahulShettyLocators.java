package Locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanda\\OneDrive\\Documents\\GowriJava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Setting Implicit Time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// MAximising the window
		driver.manage().window().maximize();
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		
		//Entering values into username field
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		
		//Entering values into password
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		
		//Tapping on sign button
		driver.findElement(By.className("submit")).click();
		
		
		//setting time of 5 secs
		Thread.sleep(5000);
		//Printing error message
		System.out.println(driver.findElement(By.className("error")).getText());
		//TApping on forgot password link
		driver.findElement(By.linkText("Forgot your password?")).click();
		//Providing wait time
		Thread.sleep(5000);
		//cssSelector
		driver.findElement(By.cssSelector("input[placeholder ='Name']")).sendKeys("Gowri");
		//customised Css and Xpath
		driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("xxx@gmail.com");
		
		//Using clear() to clear the mail entered
		driver.findElement(By.xpath("//input[@placeholder = 'Email']")).clear();
		
		//Since we cleared the email in the above we are giving another mail id
		driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("john@gmail.com");
		
		//Using xpath by index method and parent -child traverse method
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567");
		
		
		
		//Tapping Reset button by finding element by xpath with parent-child traverse technique
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		
		//xpath with regular expression
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		//Using xpath to enter all the details in the main log in page after resetting the password
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Gowri");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		//Closing browser
		//driver.close();
		
		//clear()
		//customise the locators
		
		
		
	}

}
