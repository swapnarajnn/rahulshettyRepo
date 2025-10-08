package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vanda\\OneDrive\\Documents\\GowriJava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		//XPATH
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Gowri");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("password");
		driver.findElement( By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		driver.findElement(By.xpath("//div/a")).click();
		Thread.sleep(5000);
		//cssSelector
		System.out.println(driver.findElement(By.cssSelector("form h2")).getText());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder ='Name']")).sendKeys("Gowri");
		driver.findElement(By.cssSelector("input[placeHolder = 'Email']")).sendKeys("XXX.gmail.com");
		driver.findElement(By.cssSelector("input[placeHolder ='Phone Number']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.cssSelector("button[class*='login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Gowri");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement( By.xpath("//span/label")).click();
		Thread.sleep(2000);
		driver.findElement( By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		driver.close();
		
				
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
