package com.synechron.training.basics.popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.synechron.training.basics.utils.ActitimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopChrome {

	
	
	public static void main(String[] args) throws IOException, AWTException {
		WebDriverManager.chromedriver().setup();
		Runtime.getRuntime().exec("autoit//authenticationHandlerchrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.engprod-charter.net");
		
	
		
	}
}
