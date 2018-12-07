package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import core.BaseClass;

public class homePage extends BaseClass{

//	@FindBy(id="tyu")
//	WebElement searchIcon;
//	
//	@FindBy(id="ikl")
//	WebElement searchTextBox;
	
//	public homePage(){
//		PageFactory.initElements(driver,this);
//	}

	public void search(){
		
		driver.get("http://room5.trivago.com");
		//searchTextBox.sendKeys("Canada");
		
	}
}
