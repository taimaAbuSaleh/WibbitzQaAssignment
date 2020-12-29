package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Taima abu saleh 
 * Class describes the login page elements that I used
 *
 */
public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By email = By.id("1-email");
	By password = By.cssSelector("[name='password']");
	By login = By.cssSelector("[type='submit']");

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassowrd() {
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}

}
