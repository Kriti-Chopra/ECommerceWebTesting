package PageObjects;

import org.openqa.selenium.WebElement;

public class GetMethods {

	
	public String GetText(WebElement element) {
		return element.getText();
	}
	
	public boolean GetVisibility(WebElement element) {
		return element.isDisplayed();
	}
	
	public boolean GetCheckBoxStatus(WebElement element) {
		return element.isSelected();
	}
}
