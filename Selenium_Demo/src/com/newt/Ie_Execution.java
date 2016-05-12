package com.newt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie_Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ie_exepath="E:\\browser_exes\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",ie_exepath );
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
	}

}
