package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver driver = new ChromeDriver();
	
	public static void MaximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public static void SetImplicitWait(Duration d) {
		driver.manage().timeouts().implicitlyWait(d);
	}
}
