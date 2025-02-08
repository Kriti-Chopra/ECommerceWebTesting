package PageObjects;


import java.time.Duration;

public class TestStartup {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser.MaximizeBrowser();
		Browser.SetImplicitWait(Duration.ofSeconds(5));
		
		
		Browser.driver.get("https://rahulshettyacademy.com/client");
		PageObjects.loginPage.Login("", "");
		
	}
	

}
