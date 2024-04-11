package Widgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Menu {
	static WebDriver driver;

	public static String menuhover() {
		driver.switchTo().frame(0);
		WebElement music = driver.findElement(By.xpath("//div[@id='ui-id-9']"));
		WebElement rock = driver.findElement(By.xpath("//div[@id='ui-id-10']"));
		WebElement classic = driver.findElement(By.xpath("//div[@id='ui-id-12']"));
		Actions act = new Actions(driver);
		act.moveToElement(music).perform();
		act.moveToElement(rock).perform();
		act.moveToElement(classic).perform();
		act.moveToElement(classic).click().perform();
		String s = driver.findElement(By.xpath("//div[@id='ui-id-16']")).getText();
		return s;

	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/menu/");

		String s = menuhover();
		System.out.println(s);

	}

}
