package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver=null;
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	//constructor
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInTextbox(String data) {
		driver.findElement(textbox_search).sendKeys(data);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).click();
	}

}
