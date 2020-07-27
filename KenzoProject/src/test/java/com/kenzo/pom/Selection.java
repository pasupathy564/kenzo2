package com.kenzo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection {
	
	public static WebDriver driver;

	@FindBy(xpath="//*[@id=\"content\"]/section/div/div[1]/div[2]/div/div[3]/span/span[1]")
	private WebElement size;
	
	@FindBy(xpath="//*[@id=\"content\"]/section/div/div[1]/div[2]/div/div[3]/span/span[2]/span/span[2]")
	private WebElement sizeXS;
	
	public Selection(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSize() {
		return size;
	}
	
	public WebElement getSizeXS() {
		return sizeXS;
	}
	
	

}
