package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTests extends BaseTest{

    @Test
    public void addProductToCartTest() {
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD); //2.login page
        //3.Add product to cart()
        productsPage.addProductToCart("Sauce Labs Fleece Jacket");
        //4.Open CartPage()
        cartPage.openPage();
        Assert.assertEquals(cartPage().getQuantity(), 1);
        Assert.assertEquals(cartPage().getPrice(), "9.90");
        //5.Assert quantity()
        //6.Assert price()

    }
}
