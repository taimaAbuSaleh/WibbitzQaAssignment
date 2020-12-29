package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Taima abu saleh
 * Class describes the watch & edit clips page elements that I used
 *
 */
public class WatchEditClipPage {
	public WebDriver driver;

	public WatchEditClipPage(WebDriver driver) {
		this.driver = driver;
	}

	By previewBTN = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/div[2]/span[1]/span/span/button");

	public WebElement getPreviewBTN() {
		return driver.findElement(previewBTN);
	}

}
