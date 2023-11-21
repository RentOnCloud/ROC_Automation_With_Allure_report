package TestCases;


import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;


/* this code is developed by prithwiraj */
/* this class is developed for validating Login to ROC */
public class T001_login_page extends TestBase {

	
	/* this code is developed for user creation */
	/* this code is developed for loading browser and ROC Login */
	
	@BeforeClass

	public void launchBrowser() throws IOException {
		TestBase tbase= new TestBase();
		tbase.Base_url();
		

		
		
		
	}
	/* this code is developed for validating Login to ROC */
	
	
	@Test(description="This is login validate")
	 
	public void Validate() throws IOException {
		
		
		LoginPage log= new LoginPage();	
		HomePage homepage= new HomePage();
		log.Loginpageforlandlord();
		log.DashboardLandlordROC();
		homepage.HomePageButtons();
	}
	/*
	 * @Test(description="This is login validate1") public void Validate1() throws
	 * IOException {
	 * 
	 * 
	 * LoginPage log1= new LoginPage(); //HomePage homepage1= new HomePage();
	 * log1.Loginpageforlandlord(); //log1.DashboardLandlordROC();
	 * //homepage1.HomePageButtons();
	 * 
	 * 
	 * 
	 * //add content, manage tests etc
	 * 
	 * 
	 * }
	 */

	@AfterTest
	public void Closebrowser()  {
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
	//Assert.assertFalse(true);
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[2]/button")).click();
		//Allure.step("user has successfully login at ROC");
		//Allure.step("that", Status.FAILED);
		//Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		//driver.quit();
		
	}

}






