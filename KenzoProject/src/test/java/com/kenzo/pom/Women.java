package com.kenzo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@class='title-lvl-01  ']")
	private WebElement select;
	
	@FindBy(xpath="//*[@id=\"FA62TS6334SJ.94.L\"]/a/div[1]/img[1]")
	private WebElement dress;

	public Women(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getDress() {
		return dress;
	}
}
