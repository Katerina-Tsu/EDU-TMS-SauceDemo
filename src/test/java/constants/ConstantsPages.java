package constants;

import org.openqa.selenium.By;

public class ConstantsPages {
    public static final By USERNAME_INPUT = By.xpath("//*[@data-test='username']");
    public static final By PASSWORD_INPUT = By.xpath("//*[@data-test='password']");
    public static final By LOGIN_BUTTON = By.id("login-button");
    //   public final String QUANTITY_PRODUCT = "1";
    public static final By QUANTITY_PRODUCT_IN_CART = By.xpath("//*[@class=\"cart_quantity\"]");
    public static final String ADD_PRODUCT_TO_CART_BUTTON = "//*[text() = '%s']/ancestor::*[@class='inventory_item']//button";
    public static final By PRODUCT_PRICE = By.xpath("//*[@class=\"inventory_item_price\"]");
}
