package com.pom.in;

import org.openqa.selenium.WebDriver;

public class Adactin extends Base_Class2 {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = webpage("chrome");
		POM pom = new POM(driver);
		OpenUrl("https://adactinhotelapp.com/");
		maximize();
		inputvalues(pom.getUsername(), "Sindhudsm535");
		inputvalues(pom.getPassword(), "pen@123");
		clickonelement(pom.getLogin());

	}

}
