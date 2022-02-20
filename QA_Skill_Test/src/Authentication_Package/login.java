package Authentication_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login
{
  @Test
  public void signin() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\SHARATH\\Downloads\\geckodriver.exe");
	 	WebDriver driver=new FirefoxDriver();  
	    driver.manage().window().maximize();
	    driver.get(" http://pepble.com/#/signIn");
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement signlink=driver.findElement(By.xpath("//html/body/div[1]/div/div/header/div/nav/div/div/div[2]/ul[2]/li[4]/div/ul/li[1]/a"));
	    signlink.click();
	    WebElement signinlink=driver.findElement(By.xpath("//html/body/div[1]/div/div/header/div/nav/div/div/div[2]/ul[2]/div/ul/li[2]/a"));
	    signinlink.click();
	    WebElement uname=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/form[1]/fieldset/div[1]/div/input"));
	    uname.sendKeys("sashna");
	    WebElement userpasswd=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/form[1]/fieldset/div[2]/div/input"));
	    userpasswd.sendKeys("password");
	    WebElement signinbtn=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/form[1]/fieldset/div[4]/button"));
	    signinbtn.click();
	    WebElement forgetpsswd=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/section/div/div[2]/div[2]/div/a[2]"));
	    forgetpsswd.click();
	    WebElement remail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	    remail.sendKeys("sashna97@gmail.com");
	    WebElement reset=driver.findElement(By.cssSelector(".uk-button"));
	    reset.submit();
	    System.out.println(driver.findElement(By.cssSelector(".alert")).getText());
	    String actualurl="https://pepble.com/password/reset";
	    String expectedurl=driver.getCurrentUrl();
	    Assert.assertEquals(expectedurl, actualurl);
	    driver.quit();

  }
}
