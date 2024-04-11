package Widgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Controlgroup {
	static WebDriver driver;
	
	public static void control() {
		driver.switchTo().frame(1);
		WebElement ele = driver.findElement(By.xpath("//span[@id='car-type-button']"));
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText("SUV");	
	}
	
	public static void std() {
		WebElement ele = driver.findElement(By.xpath("//input[@id='transmission-standard']"));
		ele.click();			
	}
	
	public static void auto() {
		WebElement ele = driver.findElement(By.xpath("//label[@for='transmission-automatic']"));
		ele.click();	
	}
	
	public static void Ins() {
		WebElement ele = driver.findElement(By.xpath("//label[@for='insurance']"));
		ele.click();
	}
	
	public static void book() {
		driver.findElement(By.xpath("//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right']")).click();
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/controlgroup/");
		
		control();
		std();
		auto();
		Ins();
		book();
		

	}

}
