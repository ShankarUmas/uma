package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BusTicket {
	public static void main(String[] args) throws InterruptedException {
		
	
WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
 
 driver.findElement(By.id("txtOriginGeneral")).sendKeys("Cameron Highlands");
 driver.findElement(By.id("txtDestinationGeneral")).sendKeys(" Kaula Lumpur");
// WebElement Highlands=
	//	 driver.findElement(By.xpath("(//span[contains(@class,'input-group')]//following-sibling::div)[7]")).click();
// Select sc = new Select(Highlands);
// sc.selectByVisibleText("Cameron Highlands"); 
// driver.findElement(By.xpath("//span[.='Next']")).click();
// driver.findElement(By.xpath("//a[.='20']")).click();
// Actions a1=new Actions(driver);
// a1.moveToElement(Highlands).build().perform();
//Select sc = new Select(Highlands);
// Thread.sleep(10);
//sc.selectByIndex(20);
//Thread.sleep(10);
//sc.selectByIndex(10);
//Thread.sleep(10);
//sc.selectByIndex(2022);

// Select sc = new Select(Highlands);
 Thread.sleep(10);
//sc.selectByIndex(20);
//Thread.sleep(10);
//sc.selectByIndex(10);
//Thread.sleep(10);
//sc.selectByIndex(2022);
//		 driver1.findElement(By.xpath("//span[.='Next']")).click();
//		 driver1.findElement(By.xpath("//a[.='20']")).click();
 driver.findElement(By.xpath("//div[contains(@class,'input-group')]//div[.='Depart Date']")).click();
driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker')]//a[@title='Next']")).click();
	
		
		 
		 
 
}
}

