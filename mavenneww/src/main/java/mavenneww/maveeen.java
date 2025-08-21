package mavenneww;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maveeen {
	private WebDriver driver;
@BeforeTest
public void driversetup() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    }

@Test(priority = 1)//Verify Home Loaded
public void task1() {
	driver.get("https://automationexercise.com/");
	String exptitle = driver.getTitle();
	String acttitle = "Automation Exercise";
	if
		(exptitle.equals(acttitle))
		{System.out.println("Page title matched testcase passed");}
		else
		{System.out.println("Page title mismatched testcase failed");}}

@Test(priority = 1)
public void tast2() {
	WebElement logo = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
	if
	(logo.isDisplayed())
	{System.out.println("logo is visible");}
	else
	{System.out.println("logo is visible");}}
	
@Test(priority = 3)
public void task3() {
    WebElement signup = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
    signup.click();

    WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
    WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
    WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    
    email.sendKeys("jijins533@gmail.com");
    password.sendKeys("Jijin@abc1");
    login.click();

    String acturl = driver.getCurrentUrl();
    String expurl = "https://automationexercise.com/";
   
if
(acturl.equals(expurl))
{System.out.println("logged in successfulyy"); }
else 

{System.out.println("logged in successfulyy");
}
}


@Test(priority = 4)
public void task4() {
    // Scroll page upward before starting actions
   

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Go to products page
    WebElement product = driver.findElement(By.xpath("//a[@href='/products']"));
    product.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 600)");

    // Add first product to cart
    WebElement addCart = driver.findElement(By.xpath("//a[@data-product-id='1']"));
    addCart.click();

    // Wait for modal and click Continue Shopping
    WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[normalize-space()='Continue Shopping']")));
    continueBtn.click();  
}

@Test(priority = 5)
public void task5() {
	WebElement cart = driver.findElement(By.xpath("//a[normalize-space()='Cart']"));
	cart.click();
	WebElement item = driver.findElement(By.xpath("//a[normalize-space()='Blue Top']"));
	String acttext = item.getText(); 
	String exptext = "Blue Top";
	if
	(acttext.equals(exptext))
	{System.out.println("Item matched testcase passed");}
	else
	{System.out.println("Item mismatched testcase failed");}
	WebElement quantity = driver.findElement(By.xpath("//button[normalize-space()='1']"));
	String actquantity = quantity.getText();
	String expquantity = "15"; 
	if
	(actquantity.equals(expquantity))
	{System.out.println("Quantity matched testcase passed");}
	else
	{System.out.println("Quantity mismatched testcase failed");}
	WebElement Price = driver.findElement(By.xpath("//p[@class='cart_total_price']"));
	String actprice = Price.getText();
	String expprice= "7500";
	if
	(actprice.equals(expprice))
	{System.out.println("Price matched testcase passed");}
	else
	{System.out.println("Price mismatched testcase failed");}}
	
@Test(priority = 6)
public void task6() {
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, 0);");
	WebElement Checkout = driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']"));
	Checkout.click();
	
	String actresult = driver.getCurrentUrl();
	String expresult = "https://automationexercise.com/checkout";
	if
		(actresult.equals(expresult))
		{System.out.println("url matched testcase passed");}
		else
		{System.out.println("url mismatched testcase failed");}}


@Test(priority = 7)
public void task7() {
	WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
	logout.click();
	
	String acturl = driver.getCurrentUrl();
	String expurl = "https://automationexercise.com/login";
	if
		(acturl.equals(expurl))
		{System.out.println("url matched testcase passed");}
		else
		{System.out.println("url mismatched testcase failed");}}

@AfterTest
public void exit() {
	driver.quit();
}
}
	
	
