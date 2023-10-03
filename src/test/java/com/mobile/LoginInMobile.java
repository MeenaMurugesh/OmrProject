package com.mobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LoginInMobile {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities capabilities=new DesiredCapabilities();
	capabilities.setCapability("deviceName", "emulator-5554");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "13");
	capabilities.setCapability("appPackage", "com.omr_branch");
	capabilities.setCapability("appActivity", "com.omr_branch.MainActivity");
	capabilities.setCapability("automationName", "UiAutomator2");
	WebDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
	WebElement txtUserName = driver.findElement(By.xpath("//*[@resource-id='login_email_input']"));
	txtUserName.sendKeys("meenusakthi.2m24@gmail.com");
	WebElement txtPassword = driver.findElement(By.xpath("//*[@resource-id='login_password_input']"));
	txtPassword.sendKeys("Meena@1998");
	
	WebElement btnLogin = driver.findElement(By.xpath("//*[@resource-id='login_button']"));
	btnLogin.click();
	Thread.sleep(6000);
	WebElement selectState = driver.findElement(By.xpath("//*[@resource-id='search_select_state']"));
	selectState.click();
	Thread.sleep(6000);

	WebElement txtState = driver.findElement(By.xpath("//*[@text='Andhra Pradesh']"));
	Thread.sleep(6000);

	txtState.click();
	WebElement selectDist = driver.findElement(By.xpath("//*[@resource-id='search_select_city']"));
	selectDist.click();
	Thread.sleep(6000);
	WebElement txtCity = driver.findElement(By.xpath("//*[@text='Tirupati']"));
	Thread.sleep(6000);
	txtCity.click();
	WebElement selectRoomType = driver.findElement(By.xpath("//*[@resource-id='search_room_type']"));
	selectRoomType.click();
	Thread.sleep(6000);

	WebElement roomType = driver.findElement(By.xpath("//*[@text='Standard']"));
	Thread.sleep(6000);
	roomType.click();
	
	WebElement selectNoOfRoom = driver.findElement(By.xpath("//*[@resource-id='search_select_no_of_rooms']"));
	selectNoOfRoom.click();
	Thread.sleep(6000);
	
	WebElement NoOfRoom = driver.findElement(By.xpath("//*[@text='1-One']"));
	Thread.sleep(6000);
	NoOfRoom.click();
	
	WebElement selectNoOfAdult = driver.findElement(By.xpath("//*[@resource-id='search_select_no_of_adults']"));
	selectNoOfAdult.click();
	Thread.sleep(6000);

	WebElement NoOfAdult = driver.findElement(By.xpath("//*[@text='1-One']"));
	Thread.sleep(6000);
	NoOfAdult.click();

	WebElement NoOfChild = driver.findElement(By.xpath("//*[@text='No. Of Children']"));
	NoOfChild.sendKeys("1");

}
}
