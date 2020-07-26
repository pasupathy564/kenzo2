package com.kenzo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection {
	
	public static WebDriver driver;

	@FindBy(xpath="//span[contains(@class,'sod_option')]")
	private WebElement size;
	
	public Selection(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSize() {
		return size;
	}
	
	

}
