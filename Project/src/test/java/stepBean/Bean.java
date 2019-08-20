package stepBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bean {

	
	WebDriver driver;

	@FindBy(id="Profile")
	@CacheLookup
	WebElement Profile;
	
	@FindBy(id="Status Of Inventory")
	@CacheLookup
	WebElement StatusOfInventory;
	
	
	public Bean(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}


	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getProfile() {
		return Profile;
	}


	public void setProfile() {
	this.Profile.click();
	}


	public WebElement getStatusOfInventory() {
		return StatusOfInventory;
	}


	public void setStatusOfInventory() {
		this.StatusOfInventory.click();
	}
	
}
