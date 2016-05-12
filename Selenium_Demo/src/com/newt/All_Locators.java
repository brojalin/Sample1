package com.newt;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class All_Locators {
	@FindBy(xpath="//div[@class='control-group']/input[@name='firstname']")
	public  static WebElement first_name;
	
	@FindBy(xpath="//div[@class='control-group']/input[@name='lastname']")
	public static WebElement last_name;
	
	@FindBy(id="sex-1")
	public  static WebElement gender;
	
	@FindBy(id="exp-2")
	public static WebElement exp;
	
	@FindBy(id="datepicker")
	public static WebElement date;
	
	@FindBy(id="profession-1")
	public  static WebElement proffession ;
	
	@FindBy(id="tool-2")
	public  static WebElement automation_tool;
	
}
