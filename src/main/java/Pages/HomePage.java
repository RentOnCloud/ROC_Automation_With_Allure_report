package Pages;


import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;
import io.qameta.allure.Allure;

/* this code is developed by prithwiraj */
/* this class is developed For Dashboard recognation */
public class HomePage extends TestBase {
	


	public static final long TIMEOUT = 5000;
	
	public static String Usernamefromexcel;
	public static String passwordfromexcel;

	public HomePage() {

		PageFactory.initElements(driver, this);

	}
	/*identifying elemnts*/
	@FindBy(xpath="//input[@name='email']")
	WebElement username;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginButton;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement enterbutton;

	@FindBy(xpath = "//button[contains(text(),'Update Profile')]")
	WebElement Update_Profile;

	@FindBy(xpath = "//a[contains(text(),'View My Webpage')]")
	WebElement Activate_webpage;
	
	@FindBy(xpath = "//a[contains(text(),'Find Home')]")
	WebElement findhome;
	
	@FindBy(xpath = "//button[contains(text(),'Activate Webpage')]")
	WebElement Find_Activate_webpage;

	/*identifying home page text and home page dashboard */
	public void HomePageButtons() throws IOException{

		try {
			Boolean homepagebuttons=Update_Profile.isDisplayed() && Activate_webpage.isDisplayed();
			System.out.println(homepagebuttons);
			
			if(homepagebuttons) {
				
				System.out.println("Home page has Update Profile and Activate webpage buttons");	
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has has Update Profile and Activate webpage buttons", ExtentColor.GREEN));
				Allure.step("Home page has Update Profile and Activate webpage buttons");
			}
		

		} catch(Exception e) {

			System.out.println("User is not in Home page.");
			Allure.step("Home page does not have Update Profile and Activate webpage buttons");
			
			
		}
		}
	
	public void HomePageButtonsrenter() throws IOException{

		try {
			Boolean homepagebuttons=Update_Profile.isDisplayed() && findhome.isDisplayed();
			System.out.println(homepagebuttons);
			if(homepagebuttons) {
				
				System.out.println("Home page has Update Profile and findhome buttons");	
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has has Update Profile and Activate webpage buttons", ExtentColor.GREEN));
			}
		

		} catch(Exception e) {

			System.out.println("User is not in Home page.");
			
			
		}
		}
	
	public void HomePageButtonstradesman() throws IOException{

		try {
			Boolean homepagebuttons=Update_Profile.isDisplayed() && Find_Activate_webpage.isDisplayed();
			System.out.println(homepagebuttons);
			if(homepagebuttons) {
				
				System.out.println("Home page has Update Profile and findhome buttons");	
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has has Update Profile and Activate webpage buttons", ExtentColor.GREEN));
			}
		

		} catch(Exception e) {

			System.out.println("User is not in Home page.");
			
			
		}
		}
	}
	




