package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ClassOnJan18 {
	public WebDriver driver;
	String btype = "chrome";
	//String URL = "https://magento.softwaretestingboard.com/";
	
	@Test(priority= 1, enabled = true)
	public void browser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanda\\OneDrive\\Documents\\GowriJava\\SrinivasSelenium\\Executables\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");//Updated chrome to updated version 117
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\vanda\\OneDrive\\Documents\\GowriJava\\SrinivasSelenium\\Executables\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		if(btype.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
			else if ( btype.equalsIgnoreCase("chrome")) {
				driver  = new ChromeDriver();
//				Thread.sleep(3000);
				
				}
		
		
		driver.get("https://magento.softwaretestingboard.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		driver.close();
	}


//	@Test(priority = 3,invocationCount = 3, invocationTimeOut =3000)
//	public void createanAccount() throws InterruptedException {
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.xpath("//input[@id ='search']")).sendKeys("T-shirts");
//		driver.findElement(By.xpath("//input[@id ='search']")).sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		
//	}
//
//	@Test (priority = 5, alwaysRun= true )
//	public void closethebrowser() {
//		driver.close();
	}
	

