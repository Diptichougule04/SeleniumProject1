package TestNGBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddToProduct extends BaseClass {
	@Test
	public void test() {
        driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
		List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement web : products) {
			web.click();
			
		}
	}

}
