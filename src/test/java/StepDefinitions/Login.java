package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
	driver=	new ChromeDriver();
	driver.manage().window().maximize();
	   System.out.println("browser is open");
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://www.mewatch.sg/");
		driver.findElement(By.xpath("//button[text()='Skip']")).click();
		 System.out.println("user is on login page");
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Sign In'])[1]")).click();
		driver.findElement(By.name("email")).sendKeys("cucubar123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(400);
		 System.out.println("user enters the username and password");
	}

	@And("user click on login page")
	public void user_click_on_login_page() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Thread.sleep(400);
		 System.out.println("user click on login page");
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[.='Sign out']")).click();
		Thread.sleep(400);
		System.out.println("logout succcesfully");
		driver.close();
		driver.quit();
		 
	}

}
