package com.newt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert alt=driver.switchTo().alert(); 
      System.out.println(alt.getText());
      alt.accept();
      //alt.dismiss();
	}

}
