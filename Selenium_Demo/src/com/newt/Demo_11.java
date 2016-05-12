package com.newt;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_11 extends All_Locators{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		WebDriver driver = new FirefoxDriver();
        driver.get("http://toolsqa.com/automation-practice-form/");
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='control-group']/input[@name='firstname']")).sendKeys("roja");
        /*first_name.sendKeys("Roja");
        last_name.sendKeys("biswal");
        gender.click();
        exp.click();
        date.sendKeys("11/07/16");
        proffession.click();
        automation_tool.click();*/
        }
		catch(Exception e){
			
		}
        
		

	}

}
