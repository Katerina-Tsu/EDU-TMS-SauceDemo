package pages;

import org.openqa.selenium.WebDriver;

import static constants.ConstantsPages.PRODUCT_PRICE;
import static constants.ConstantsPages.QUANTITY_PRODUCT_IN_CART;

public class CartPage extends BasePage{
    public CartPage (WebDriver driver) {
        super(driver);
    }

    public final String URL = "https://www.saucedemo.com/cart.html";
    /**
     * Get URL of site and Open cart page
     */
    public void openPage() {
        driver.get(URL);
    }

    public String calculateQuantity(String productName) {
//        return driver.findElement(By.xpath(String.format(productName,QUANTITY_PRODUCT_IN_CART))).getText();
        return driver.findElement(QUANTITY_PRODUCT_IN_CART).getText();

    }
    /**
     * Find product price on the cart page
     * @return
     */
    public String getProductPrice(String productName) {
//        return driver.findElement(By.xpath(String.format(productName,PRODUCT_PRICE))).getText();
        return driver.findElement(PRODUCT_PRICE).getText();

    }
}
