package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductsTests extends BaseTest{

    @Test
    public void addProductToCartTest() {
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD); //2.login page
        //3.Add product to cart()
        productsPage.addProductToCart();
        //4.Open CartPage()
        //5.Assert quantity()
        //6.Assert price()

    }
}
