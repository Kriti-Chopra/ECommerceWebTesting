package PageObjects;

import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartDashboard {

	WebDriver driver;
	public CartDashboard() {
		this.driver=Browser.driver;
	}
	
	WebElement continueShoppingBtn = driver.findElement(By.xpath("//button[@routerlink='/dashboard']"));
	//not visible on page load
	List<WebElement> itemsList = driver.findElements(By.xpath("//li[contains(@class,'items')]"));
	By checkoutBtnBy = By.xpath("//li[contains(@class,'totalRow')]//button");
	
	
	public void CheckoutCart() {
		WebElement checkoutBtn = driver.findElement(checkoutBtnBy);
		checkoutBtn.click();
	}
	
	public void CancelItem(String itemName) {
		WebElement product = itemsList.stream().filter(p->p.findElement(By.xpath("//h3")).getText().equals(itemName)).findFirst().orElse(null);
		product.findElement(By.xpath("//button[contains(@class,'btn-danger')]")).click();
	}
	
	public void CancelItems(List<String> itemsNameList) {
		for(String s:itemsNameList) {
			CancelItem(s);
		}
	}
	
}
