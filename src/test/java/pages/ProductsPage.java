package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsPages.ADD_PRODUCT_TO_CART_BUTTON;

public class ProductsPage extends BasePage{
    public ProductsPage (WebDriver driver) {
        super(driver);
    }


    public void addProductToCart(String productName) {
        driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART_BUTTON, productName))).click();
    }
}
