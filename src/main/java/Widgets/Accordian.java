package Widgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Accordian {
	static WebDriver driver;

	public static String Accordian1() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//h3[@id='ui-id-3']")).click();
		String s1 = driver
				.findElement(By.xpath("//p[contains(text(),'Sed non urna. Donec et ante. Phasellus eu ligula. ')]"))
				.getText();
		return s1;

	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/accordion/");

		String s = Accordian1();
		System.out.println(s);

	}

}
