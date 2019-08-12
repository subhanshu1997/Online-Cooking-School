package cookBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cook {
	WebDriver driver;
	
	@FindBy(className="auto-style4")
	@CacheLookup
	WebElement school;
	 
	@FindBy(name="fname")
	@CacheLookup
	WebElement fname;
	
	@FindBy(name="lname")
	@CacheLookup
	WebElement lname;
	
	@FindBy(name="email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="mobile")
	@CacheLookup
	WebElement mobile;
	
	@FindBy(name="D6")
	@CacheLookup
	WebElement category;
	
	@FindBy(name="D5")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="D4")
	@CacheLookup
	WebElement mode;
	
	@FindBy(name="D3")
	@CacheLookup
	WebElement duration;
	
	@FindBy(name="enqdetails")
	@CacheLookup
	WebElement enquiry;
	
	@FindBy(id="Submit1")
	@CacheLookup
	WebElement submit;
	
	@FindBy(partialLinkText="Download our Recipe class Brochure")
	@CacheLookup
	WebElement brochure;
	
	 
	@FindBy(tagName="p")
	@CacheLookup
	WebElement tag;
	
	public Cook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school.sendKeys(school);
	}

	public WebElement getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname.sendKeys(fname);
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname.sendKeys(lname);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile.sendKeys(mobile);
	}

	public WebElement getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category.sendKeys(category);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public WebElement getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode.sendKeys(mode);
	}

	public WebElement getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration.sendKeys(duration);
	}

	public WebElement getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(String enquiry) {
		this.enquiry.sendKeys(enquiry);
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit() {
		this.submit.click();
	}

	public WebElement getBrochure() {
		return brochure;
	}

	public void setBrochure() {
		this.brochure.click();
	}

	public WebElement getTag() {
		return tag;
	}

	public void setTag(WebElement tag) {
		this.tag = tag;
	}

}
