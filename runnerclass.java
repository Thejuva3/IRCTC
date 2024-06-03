package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class runnerclass {
	@BeforeTest
	public void setbrowser() {
		basemethod.setup();
	}
	@BeforeMethod
	public void seturl() {
		basemethod.seturl();
	}
	@Test
	public void booking() throws InterruptedException {
		basemethod.busselect();
		basemethod.windowshandle();
		basemethod.boardng();
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void seatselect() throws InterruptedException {
		basemethod.seatselect();
		basemethod.pickupanddrop();
		basemethod.pay();
	}
	@AfterTest
	public void logout() throws InterruptedException {
		basemethod.tear();
	}
   	 }

