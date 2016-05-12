package com.newt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String chrome_exepath="E:\\browser_exes\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",chrome_exepath );
WebDriver driver=new ChromeDriver();
driver.get("http://toolsqa.com/");
driver.manage().window().maximize();
	}

}
