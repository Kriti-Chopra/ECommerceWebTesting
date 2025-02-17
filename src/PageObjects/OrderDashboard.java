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
	
	//shipping info area
	WebElement usernameInput = driver.findElement(By.xpath("(//div[contains(@class,'user__name')]//input)[1]"));
	WebElement countryAutopopulateInput = driver.findElement(By.xpath("//div[contains(@class,'user__address')]//input"));
	List<WebElement> populatedCountryList = driver.findElements(By.xpath("//section[contains(@class,'ta-results')]/button/span"));
	
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
	
	public void SelectCountry(String countryName) {
		countryAutopopulateInput.sendKeys(countryName);
		
		int i=0;
		while(populatedCountryList.size()>0) {
			if(populatedCountryList.get(i).getText().equals(countryName)) {
				populatedCountryList.get(i).click();
				break;
			}
			++i;
		}	
	}
	
}
