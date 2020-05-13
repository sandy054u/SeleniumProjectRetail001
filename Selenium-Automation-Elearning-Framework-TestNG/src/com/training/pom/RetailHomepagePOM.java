package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailHomepagePOM {

	private WebDriver driver;

	public RetailHomepagePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(By.xpath("//i[@class='fa fa-user-o']")) private WebElement account; 
	
	@FindBy(xpath="//i[@class='fa fa-user-o']")	private WebElement acc_icon; 
	
//	By acc_icon = By.xpath("//i[@class='fa fa-user-o']"); 
	
	
	public void clickAccountIcon() throws InterruptedException {
		//driver.findElement(acc_icon).click();
		this.acc_icon.click();
		Thread.sleep(3000);
		System.out.println("clicked on Register button");
		System.out.println("The current page title is :" +  driver.getTitle());
	}
}