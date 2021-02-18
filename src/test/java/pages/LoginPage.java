package pages;

import org.openqa.selenium.WebDriver;

import static constants.ConstantsPages.*;

public class LoginPage extends BasePage{

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public final String URL = "https://www.saucedemo.com/index.html";
    public final String USERNAME = "standard_user";
    public final String PASSWORD = "secret_sauce";
    public final String EMPTY_USERNAME = "";
    public final String WRONG_USERNAME = "d_user";

    /**
     * Login to the site
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    /**
     * Get URL of site and Open login page
     */
    public void openPage() {
        driver.get(URL);
    }
}
