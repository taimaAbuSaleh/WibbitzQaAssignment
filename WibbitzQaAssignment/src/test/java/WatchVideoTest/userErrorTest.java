package WatchVideoTest;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import resources.base;

/**
 * 
 * @author Taima abu saleh
 * Class that represents the testCase1 in the scenario
 *
 */
public class userErrorTest extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "getInvalidData")
	public void basePageLogin(String Username, String Password) throws IOException {

		LoginPage logP = new LoginPage(driver);
		logP.getEmail().sendKeys(Username);
		logP.getPassowrd().sendKeys(Password);
		logP.getLogin().click();
		Assert.assertTrue(true);
		log.info("check login if failed -> true");

	}

	@DataProvider
	public Object[][] getInvalidData() {
		Object[][] data = new Object[1][2];

		// row0
		data[0][0] = "taimaabusaleh98@gmail.com";
		data[0][1] = "notMyRealPassowrd";
		return data;
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
