package com.adactin.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account_create {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"S:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\practicing space\\Project_new\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement newuser = driver.findElement(By.xpath("//a[text()=\"New User Register Here\"]"));
		newuser.click();

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("dollupollu");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("dollupollu@10");

		WebElement conpass = driver.findElement(By.id("re_password"));
		conpass.sendKeys("dollupollu@10");

		WebElement fullname = driver.findElement(By.xpath("(//input[@class=\"reg_input\"])[4]"));
		fullname.sendKeys("sindhu");

		WebElement email = driver.findElement(By.id("email_add"));
		email.sendKeys("sindhudsm535@gmail.com");

		WebElement checkbox = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		checkbox.click();
		WebElement captcha = driver.findElement(By.id("captcha-form"));
		captcha.sendKeys("groining");
		WebElement register = driver.findElement(By.name("Submit"));
		register.click();

	}

}
