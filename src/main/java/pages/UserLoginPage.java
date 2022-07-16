package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserLoginPage extends PageBase {

	public UserLoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="loginForm-eMail")
	WebElement emailTxtBox;
	@FindBy(id="loginForm-password")
	WebElement passwordTxtBox;
	@FindBy(xpath="//div/button[@class='frc-button']")
	WebElement confBtn;
	@FindBy(id="login-submit-btn")
	WebElement loginBtn;
	@FindBy(xpath="//div/h3[@class='a-h3 u-margin-xx-small--bottom']")
	public WebElement successMsg;
	 
	public void userLogin(String email, String password) throws InterruptedException {
		setTextElementText(emailTxtBox, email);
		Thread.sleep(3000);
		setTextElementText(passwordTxtBox, password);
		Thread.sleep(20000);
//		clickButton(confBtn);
//		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver,30);
//     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-submit-btn")));
//        clickButton(loginBtn);
		
		
	}

}
