package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnScrollToElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchLink = driver.findElement(By.linkText("Search"));
		Actions act=new Actions(driver);
		act.scrollToElement(searchLink).perform();
		searchLink.click();
		Thread.sleep(6000);
		driver.close();
	}

}
