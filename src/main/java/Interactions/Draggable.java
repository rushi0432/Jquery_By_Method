package Interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {
	static WebDriver driver;

	public static void Drag() {
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele, 100, 100).release().perform();
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");

		Drag();

	}

}
