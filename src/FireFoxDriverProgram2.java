import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vanda\\OneDrive\\Documents\\GowriJava\\geckodriver-v0.31.0-win64\\geckodriver.exe"); //gecko is the driver for firefox

		FirefoxDriver wd = new FirefoxDriver();
		// Launch Google
		wd.get("https://www.google.com/");
		
		// Maximise

		wd.manage().window().maximize();
		// Close Google
		wd.close();


	}

}
