package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.UserLoginPage;

public class UserLoginTest extends TestBase {
	UserLoginPage loginObject;

	@Test
	public void validLogin() throws InterruptedException {
		loginObject = new UserLoginPage(driver);
		loginObject.userLogin("t.muller@yahoo.com", "123456");
		Assert.assertTrue(loginObject.successMsg.getText().contains("Thomas"));
	}
}