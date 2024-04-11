package Widgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	static WebDriver driver;

	public static String Widgets_Button1() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div//button[text()='A button element']")).click();
		String s1 = driver.findElement(By.xpath("//div//button[text()='A button element']")).getText();
		return s1;
	}

	public static String Widgets_Button2() {
		driver.findElement(By.xpath("//input[@class='ui-button ui-corner-all ui-widget']")).click();
		String s2 = driver.findElement(By.xpath("//input[@class='ui-button ui-corner-all ui-widget']")).getText();
		return s2;
	}

	public static String Widgets_button3() {
		driver.findElement(By.xpath("//div//a[text()='An anchor']")).click();
		String s4 = driver.findElement(By.xpath("//div//a[text()='An anchor']")).getText();
		return s4;
	}

	public static String Css_Button1() {

		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-corner-all']")).click();
		String s1 = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-corner-all']")).getText();
		return s1;
	}

	public static String Css_Button2() {

		driver.findElement(By.xpath("//input[@class='ui-button ui-widget ui-corner-all']")).click();
		String s1 = driver.findElement(By.xpath("//input[@class='ui-button ui-widget ui-corner-all']")).getText();
		return s1;
	}

	public static String Css_Button3() {

		driver.findElement(By.xpath("//a[@class='ui-button ui-widget ui-corner-all']")).click();
		String s1 = driver.findElement(By.xpath("//a[@class='ui-button ui-widget ui-corner-all']")).getText();
		return s1;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/button/");

		String s = Widgets_Button1();
		System.out.println(s);

		String s3 = Widgets_Button2();
		System.out.println(s3);

		String s5 = Widgets_button3();
		System.out.println(s5);

		String s6 = Css_Button1();
		System.out.println(s6);

		String s7 = Css_Button2();
		System.out.println(s7);

		String s8 = Css_Button3();
		System.out.println(s8);

	}

}
