package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsDashboard {
	
	WebDriver driver;
	public ProductsDashboard() {
		this.driver=Browser.driver;
	}

	List<WebElement> productsList = driver.findElements(By.cssSelector(".card"));
	WebElement cartBtn = driver.findElement(By.xpath("//button[contains(@routerlink,'cart')]"));
	
	public void AddProductToCart(String productName) {
		WebElement product =
		productsList.stream().filter(p->p.findElement(By.tagName("b")).getText().equals(productName)).findFirst().orElse(null);
		product.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}
	
	public void GoToCart() {
		cartBtn.click();
	}
}
