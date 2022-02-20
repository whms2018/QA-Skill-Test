package Authentication_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class registration 
{
  @Test
  public void reg()
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\SHARATH\\Downloads\\geckodriver.exe");
	 	WebDriver driver=new FirefoxDriver();  
	    driver.manage().window().maximize();
	    driver.get(" http://pepble.com/#/signIn");
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement signinlink=driver.findElement(By.xpath("//html/body/div[1]/div/div/header/div/nav/div/div/div[2]/ul[2]/li[4]/div/ul/li[1]/a"));
	    signinlink.click();
	    WebElement signuplink=driver.findElement(By.xpath("//html/body/div[1]/div/div/header/div/nav/div/div/div[2]/ul[2]/div/ul/li[4]/a"));
	    signuplink.click();
	    WebElement name=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/form/fieldset/div[1]/div[1]/input"));
	    name.sendKeys("Sharu");
	    WebElement mobile=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/form/fieldset/div[1]/div[2]/input"));
	    mobile.sendKeys("8947524388");
	    WebElement email=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/form/fieldset/div[2]/div/input"));
	    email.sendKeys("sashna97@gmail.com");
	    WebElement passwd=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/form/fieldset/div[3]/div/input"));
	    passwd.sendKeys("password");
	    WebElement cpasswd=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/form/fieldset/div[4]/div/input"));
	    cpasswd.sendKeys("password");
	    WebElement signupbtn=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/form/fieldset/div[5]/button"));
	    signupbtn.click();
	    String actualurl="https://pepble.com/SignUp";
	    String expectedurl=driver.getCurrentUrl();
	    Assert.assertEquals(expectedurl, actualurl);  
	    driver.quit();
  }
}
