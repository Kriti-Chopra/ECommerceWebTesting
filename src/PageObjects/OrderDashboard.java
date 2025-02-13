package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderDashboard {

	WebDriver driver;
	public void OrderDashboard() {
		this.driver=Browser.driver;
	}
	
	//contains main div as first element
	List<WebElement> listOfPaymentTypes = driver.findElements(By.xpath("//div[contains(@class,'payment__type')]"));
	
	
	public List<String> GetAvailablePaymentTypes() {
		List<String> paymentTypesList = new ArrayList<String>();
		for(int i=1;i<listOfPaymentTypes.size();++i) {
			paymentTypesList.add(listOfPaymentTypes.get(i).getText());
		}
		return paymentTypesList;
	}
	
	public void SelectPaymentType(String paymentType) {
		for(int i=1;i<listOfPaymentTypes.size();++i) {
			if(listOfPaymentTypes.get(i).getText().equals(paymentType)) {
				listOfPaymentTypes.get(i).click();
				return;
			}
		}
	}
}
