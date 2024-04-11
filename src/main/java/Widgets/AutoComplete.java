package Widgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {
	static WebDriver driver;

	public static String complete() {
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//input[@id='tags']"));
		ele.sendKeys("java");
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		String s = driver.findElement(By.xpath("//div[@id='ui-id-21']")).getText();
		return s;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/autocomplete/");

		String s1 = complete();
		System.out.println(s1);

	}

}
