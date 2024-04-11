package Widgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dialog {
	static WebDriver driver;
	
	public static String dialog1() {
		driver.switchTo().frame(0);
		String dailog = driver.findElement(By.xpath("//div[@id='dialog']")).getText();
		driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")).click();	
		return dailog;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/dialog/");
		
		String s = dialog1();
		System.out.println(s);
		

	}

}
