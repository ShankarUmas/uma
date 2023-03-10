package Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_StepDefinition { 
	public WebDriver driver;
	String url="https://www.rediff.com/";
	SoftAssert softassert = new SoftAssert();
	
    @Given("I open a chrome Browser")
    public void i_open() {
    	System.out.println("I open a chrome Browser");
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
    }
    @And("I enter the url http://rediff.com in the address bar")
    public void i_enter() {
    	System.out.println("I enter the url http://rediff.com in the address bar");
    	driver.findElement(By.className("signin")).click();
    }
    @Then("I click on the signin link") 
    public void i_click() {
    	System.out.println("I click on the signin link");
    	
    }
    @And("I enter the RediffMail page")
    public void i_enter_the() {
    	System.out.println("I enter the RediffMail page");
    	String actualTitle="Rediffimail";
    	String expectedTitle=driver.getTitle();
    	softassert.assertEquals(actualTitle,expectedTitle);
    	softassert.assertAll();
    	
    }
    @And("I enter correct username and password")
    public void i_enter_correct() {
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	System.out.println("I enter correct username and password");
    	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffinail.com");
    	driver.findElement(By.id("password")).sendKeys("Selenium@123");
    }
    @Then("I click on the SignIn button")
    public void i_click_on(){
    	System.out.println("I click on the SignIn button");
    	driver.findElement(By.className("signinbtn")).click();
    }
    @And("I check if I am in the Inbox page of RediffMail")
    public void i_check() {
    	System.out.println("I check if I am in the Inbox page of RediffMail");
    }
    
    
    
    @Given("I am Inside the Inbox Page")
    public void i_am() {
    	System.out.println("I am Inside the Inbox Page");
    }
    @And("I validate the presence of the Logout link")
    public void i_validare() {
    	System.out.println("I validate the presence of the Logout link");
    	softassert.assertTrue(driver.findElement(By.className("rd_logout")).isEnabled());
    	softassert.assertAll();
    }
    @When("I click on the Logout link")
    public void i_click_on_the() {
    	System.out.println("I click on the Logout link");
    	driver.findElement(By.className("rd_logout")).click();
    }
    @Then("I am logged out of RediffMail")
    public void i_am_logged(){
    	System.out.println("I am logged out of RediffMail");
    	
    }
    @And("I can validate the presence of RediffHome link")
    public void i_can() {
    	System.out.println("I can validate the presence of RediffHome link");
    	softassert.assertTrue(driver.findElement(By.xpath("//ul[@class=\"navbarul\"]")).isEnabled());
    }
}
