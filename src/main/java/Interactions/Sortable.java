package Interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	static WebDriver driver;
	
	public static void Sort() {
		driver.switchTo().frame(0);
		WebElement one= driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement five= driver.findElement(By.xpath("//li[text()='Item 5']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(one, five).perform();
		act.clickAndHold(one).moveToElement(five).release().perform();
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		
		Sort();

	}

}
