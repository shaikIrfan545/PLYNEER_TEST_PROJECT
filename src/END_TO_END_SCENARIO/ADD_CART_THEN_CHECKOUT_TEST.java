package END_TO_END_SCENARIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ADD_CART_THEN_CHECKOUT_TEST extends BaseTest
{
@Test
public void CheckOutProduct() throws InterruptedException
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.plyneer.com/");
	//Login Credentials
	driver.findElement(By.xpath("//a[.=\"LOGIN / REGISTER\"]")).click();
	driver.findElement(By.id("login-form-username")).sendKeys("shaikkalesha0545@gmail.com");
	driver.findElement(By.id("login-form-password")).sendKeys("irfan@143");
	driver.findElement(By.id("login-form-submit")).click();
	//ADD TO CART
	driver.findElement(By.xpath("//a[.='OUR PRODUCTS']")).click();
	driver.findElement(By.xpath("//input[@value=\"Plyneer Silver\"]")).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	driver.findElement(By.xpath("//*[@id=\"posts\"]/section/div/div/a[2]")).click();
	driver.findElement(By.xpath("//button[.=\"Add to Cart\"]")).click();
	driver.switchTo().window("Shopping Cart");
	driver.findElement(By.xpath("//a[@class=\"custom-btn-mini-top\"]")).click();
	WebElement ProceedToCheckout = driver.findElement(By.xpath("//a[@id=\"proceed-to-checkout\"]"));
	ProceedToCheckout.click();
	driver.findElement(By.xpath("//button[.=\"STEP 2 :   DELIVERY ADDRESS\"]")).click();
	driver.findElement(By.id("user_address_search")).sendKeys("TYPE UR ADDRESS");
	driver.findElement(By.xpath("//input[@class=\"form-control alpha_street\"]")).sendKeys("TYPE UR ADDRESS");
	driver.findElement(By.name("phone")).sendKeys("TYPE UR PHONE NUMBER");
	WebElement deliveryAddress = driver.findElement(By.xpath("//input[@value=\"Deliver To This Address\"]"));
	deliveryAddress.click();
	Thread.sleep(180000);
	driver.close();
}
}
