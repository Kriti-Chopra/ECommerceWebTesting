package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	//Anshika@gmail.com
	//Iamking@000
	
	WebDriver driver;
	public LoginPage() {
		this.driver=Browser.driver;
	}
	
	//Region :page elements
	
	WebElement emailInputBox = driver.findElement(By.id("userEmail"));
	WebElement passwordInputBox = driver.findElement(By.id("userPassword"));
	WebElement loginBtn = driver.findElement(By.id("login"));
	WebElement forgotPasswordLnk = driver.findElement(By.cssSelector(".forgot-password-link"));
	WebElement registerLnk = driver.findElement(By.cssSelector(".text-reset"));
	
	//Region : page methods

	//enter email string
	public void EnterEmail(String email) {
		emailInputBox.sendKeys(email);
	}
	
	//enter password string
	public void EnterPassword(String password) {
		passwordInputBox.sendKeys(password);
	}
	
	//Click Login Btn
	public void ClickLogin() {
		loginBtn.click();
	}
	
	//logs in with the provided email and password
	public void Login(String email, String password) {
		EnterEmail(email);
		EnterPassword(password);
		ClickLogin();
	}
	
	public void ClickForgotPassword() {
		forgotPasswordLnk.click();
	}
	
	public void ClickRegister() {
		registerLnk.click();
	}
}
