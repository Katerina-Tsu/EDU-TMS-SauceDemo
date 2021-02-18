package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTests extends BaseTest{

    @Test
    public void addProductToCartTest() {
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD);
        productsPage.addProductToCart("Sauce Labs Fleece Jacket");
        cartPage.openPage();
        cartPage.calculateQuantity("Sauce Labs Fleece Jacket");
        cartPage.getProductPrice("Sauce Labs Fleece Jacket");

        Assert.assertEquals(cartPage.calculateQuantity("Sauce Labs Fleece Jacket"), "1");
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Fleece Jacket"), "49.99");
        //5.Assert quantity()
        //6.Assert price()

    }
}
