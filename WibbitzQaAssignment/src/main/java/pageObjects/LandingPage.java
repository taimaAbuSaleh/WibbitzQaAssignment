package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Taima abu saleh
 * Class describes the landing page elements that I used
 *
 */
public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By clipDiv = By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div/div[1]/div/div[4]/div[1]/div");
	By clickableclip = By.cssSelector("div.skeleton-video-container");

	public WebElement getclipDiv() {
		return driver.findElement(clipDiv);
	}

	public WebElement getclickableclip() {
		return driver.findElement(clickableclip);
	}

}
