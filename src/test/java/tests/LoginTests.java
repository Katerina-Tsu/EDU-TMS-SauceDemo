package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginEmptyFieldUsernameTest() {
        loginPage.openPage();
        loginPage.login(loginPage.EMPTY_USERNAME, loginPage.PASSWORD);
        String errorEmptyFieldUsername = driver.findElement(By.xpath("//*[@data-test=\"error\"]")).getText();
        String actualTextErrorEmptyFieldUsername = errorEmptyFieldUsername;
        String expectedTextErrorEmptyFieldUsername = "Epic sadface: Username is required";
        Assert.assertEquals(actualTextErrorEmptyFieldUsername, expectedTextErrorEmptyFieldUsername);

    }

    @Test
    public void loginWrongUsernameFieldTest() {
        loginPage.openPage();
        loginPage.login(loginPage.WRONG_USERNAME, loginPage.PASSWORD);
        String errorEmptyFieldUsername = driver.findElement(By.xpath("//*[@data-test=\"error\"]")).getText();
        String actualTextErrorEmptyFieldUsername = errorEmptyFieldUsername;
        String expectedTextErrorEmptyFieldUsername = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actualTextErrorEmptyFieldUsername, expectedTextErrorEmptyFieldUsername);
    }

}
