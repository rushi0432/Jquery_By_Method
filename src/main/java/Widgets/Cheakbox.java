package Widgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cheakbox {
	static WebDriver driver;

	public static String Radiogroupnewyork() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[@for='radio-1']")).click();
		String s = driver.findElement(By.xpath("//label[@for='radio-1']")).getText();
		return s;
	}

	public static String paris() {
		driver.findElement(By.xpath("//label[@for='radio-2']")).click();
		String s = driver.findElement(By.xpath("//label[@for='radio-2']")).getText();
		return s;
	}

	public static String london() {
		driver.findElement(By.xpath("//label[@for='radio-3']")).click();
		String s = driver.findElement(By.xpath("//label[@for='radio-3']")).getText();
		return s;
	}

	public static String twostar() {
		driver.findElement(By.xpath("//label[@for='checkbox-1']")).click();
		String s = driver.findElement(By.xpath("//label[@for='checkbox-1']")).getText();
		return s;
	}

	public static String threestar() {
		driver.findElement(By.xpath("//label[@for='checkbox-2']")).click();
		String s = driver.findElement(By.xpath("//label[@for='checkbox-2']")).getText();
		return s;
	}

	public static String fourstar() {
		driver.findElement(By.xpath("//label[@for='checkbox-3']")).click();
		String s = driver.findElement(By.xpath("//label[@for='checkbox-3']")).getText();
		return s;
	}

	public static String fivestar() {
		driver.findElement(By.xpath("//label[@for='checkbox-4']")).click();
		String s = driver.findElement(By.xpath("//label[@for='checkbox-4']")).getText();
		return s;
	}

	public static String doublebed() {
		driver.findElement(By.xpath("//label[@for='checkbox-nested-1']")).click();
		String s = driver.findElement(By.xpath("//label[@for='checkbox-nested-1']")).getText();
		return s;
	}

	public static String doublequeen() {
		driver.findElement(By.xpath("//label[@for='checkbox-nested-2']")).click();
		String s = driver.findElement(By.xpath("//label[@for='checkbox-nested-2']")).getText();
		return s;
	}

	public static String onequeen() {
		driver.findElement(By.xpath("//label[@for='checkbox-nested-3']")).click();
		String s = driver.findElement(By.xpath("//label[@for='checkbox-nested-3']")).getText();
		return s;
	}

	public static String oneking() {
		driver.findElement(By.xpath("//label[@for='checkbox-nested-4']")).click();
		String s = driver.findElement(By.xpath("//label[@for='checkbox-nested-4']")).getText();
		return s;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/checkboxradio/");

		String s = Radiogroupnewyork();
		System.out.println(s);

		String s1 = paris();
		System.out.println(s1);

		String s2 = london();
		System.out.println(s2);

		String s3 = twostar();
		System.out.println(s3);

		String s4 = threestar();
		System.out.println(s4);

		String s5 = fourstar();
		System.out.println(s5);

		String s6 = fivestar();
		System.out.println(s6);

		String s7 = doublebed();
		System.out.println(s7);

		String s8 = doublequeen();
		System.out.println(s8);

		String s9 = onequeen();
		System.out.println(s9);

		String s10 = oneking();
		System.out.println(s10);

	}

}
