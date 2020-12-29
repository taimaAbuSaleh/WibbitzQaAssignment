package WatchVideoTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.WatchEditClipPage;
import resources.base;

/**
 * 
 * @author Taima abu saleh
 * Class that represents the testCase2 in the scenario
 *
 */
public class validateProcessTest extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("driver init");
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String Username, String Password) throws IOException {

		LoginPage logP = new LoginPage(driver);
		logP.getEmail().sendKeys(Username);
		logP.getPassowrd().sendKeys(Password);
		logP.getLogin().click();
		log.info("login successful");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];

		// row0
		data[0][0] = "taimaabusaleh98@gmail.com";
		data[0][1] = "Iphone1234!";
		return data;
	}

	@Test
	public void clickVideo() {
		Actions mouseHover = new Actions(driver);
		LandingPage lp = new LandingPage(driver);
		mouseHover.moveToElement(lp.getclipDiv()).build().perform();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(lp.getclickableclip())).click();
		log.info("clip clicked");

	}

	@Test
	public void watchEditVideo() throws InterruptedException {
		WatchEditClipPage wEv = new WatchEditClipPage(driver);
		Thread.sleep(20000);
		wEv.getPreviewBTN().click();
		log.info("clip played");


	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
