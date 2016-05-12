package com.newt;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
        String parent=driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		for(String handle : allWindowHandles)
		{
	    driver.switchTo().window(handle); 
		driver.manage().window().maximize() ;
		driver.findElement(By.xpath("//a/img[@alt='Enroll button']")).click();	
		
		}
		driver.switchTo().window(parent);	
 
	}

}
