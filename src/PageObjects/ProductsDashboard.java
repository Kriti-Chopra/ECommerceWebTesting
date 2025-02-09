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

	//region page elements
	List<WebElement> productsList = driver.findElements(By.cssSelector(".card"));
	WebElement cartBtn = driver.findElement(By.xpath("//button[contains(@routerlink,'cart')]"));
	
	//select a product by product name
	public void AddProductToCart(String productName) {
		WebElement product =
		productsList.stream().filter(p->p.findElement(By.tagName("b")).getText().equals(productName)).findFirst().orElse(null);
		product.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}
	
	//select multiple products
	public void AddProductToCart(List<String> products) {	
		for(String productName:products) {
			WebElement product =
					productsList.stream().filter(p->p.findElement(By.tagName("b")).getText().equals(productName)).findFirst().orElse(null);
			product.findElement(By.cssSelector(".card-body button:last-of-type")).click();	
		}
	}
	
	//clicks cart button
	public void GoToCart() {
		cartBtn.click();
	}
	
	//get count of products added to cart
	public int GetCartCount() {
		WebElement countLabel = cartBtn.findElement(By.tagName("label"));
		return Integer.parseInt(countLabel.getText());
	}
	
	
}
