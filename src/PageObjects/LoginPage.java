package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	//Region :page elements
	
	WebElement emailInputBox = Browser.driver.findElement(By.id("userEmail"));
	WebElement passwordInputBox = Browser.driver.findElement(By.id("userPassword"));
	WebElement loginBtn = Browser.driver.findElement(By.id("login"));
	
	//Region : page methods
	
	//logs in with the provided email and password
	public void Login(String email, String password) {
		emailInputBox.sendKeys(email);
		passwordInputBox.sendKeys(password);
		loginBtn.click();
	}
	
}
