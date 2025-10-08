import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverProgram1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanda\\OneDrive\\Documents\\GowriJava\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//Launch Google
		wd.get("https://www.google.com/");
		// Maximise
		wd.manage().window().maximize();
		//Close Google
		wd.close();


	}

}
