package cookBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Msg {
	WebDriver driver;
	
	@FindBy(id="an")
	@CacheLookup
	WebElement an;
	
	public Msg(WebDriver driver) {
		System.out.println("MSG");
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAn() {
		return an;
	}

	public void setAn() {
		this.an.click();
	}
	
}
