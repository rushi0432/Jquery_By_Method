package Interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
	static WebDriver driver;

	public static String Select() {
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//li[text()='Item 1']"));
		ele.click();
		String s1 = driver.findElement(By.xpath("//li[text()='Item 1']")).getText();
		return s1;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");

		String s = Select();
		System.out.println(s);

	}

}
