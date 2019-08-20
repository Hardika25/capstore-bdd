package stepMerchant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepBean.Bean;


public class Test {

	
	private WebDriver driver;
	private Bean bean;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	@Given("^I want to get Merchant detail$")
	public void i_want_to_get_Merchant_detail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("D:\\Selenium Workspace\\Project\\merchant.html");
		bean = new Bean(driver);
	}

	@When("^I press on Profile link$")
	public void i_press_on_Profile_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  bean.setProfile();
	}

	@Then("^Display 'merchantProfile' page$")
	public void display_merchantProfile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("D:\\Selenium Workspace\\Project\\merchantProfile.html");
		driver.close();
	}

	@Given("^I want to get the status of Inventory$")
	public void i_want_to_get_the_status_of_Inventory() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		   driver.get("D:\\Selenium Workspace\\Project\\merchant.html");	
			bean = new Bean(driver);
	}

	@When("^I press on Status OF Inventory link$")
	public void i_press_on_Status_OF_Inventory_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setStatusOfInventory();
	}

	@Then("^Display 'inventory' page$")
	public void display_inventory_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.get("D:\\Selenium Workspace\\Project\\inventory.html");
	  driver.close();
	}


	
	
}
