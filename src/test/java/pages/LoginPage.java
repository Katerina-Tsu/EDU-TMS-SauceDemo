package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public static final By USERNAME_INPUT = By.xpath("//*[@data-test='username']");
    public static final By PASSWORD_INPUT = By.xpath("//*[@data-test='password']");

}
