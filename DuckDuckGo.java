package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://duckduckgo.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Seleninum WebDriver");  
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Seleninum WebDriver")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.quit();

	}

}
