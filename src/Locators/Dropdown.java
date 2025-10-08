package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	//steps: go to chrome,max the screen, open the link

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\vanda\\OneDrive\\Documents\\GowriJava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		//Select dropdown = new Select
		

	}

}
