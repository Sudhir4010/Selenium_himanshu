package Assignment.javascriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demowebshop {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement blankTf = driver.findElement(By.xpath("//div/..//input[@class='form-control']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Himanshu'", blankTf);
		File temp=driver.findElement(By.xpath("//div/..//input[@class='form-control']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/Javascript/kishan;.png");
		FileHandler.copy(temp, dest);
	}

}
