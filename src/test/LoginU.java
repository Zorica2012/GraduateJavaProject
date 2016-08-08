package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class LoginU {
	
	public static String username="Ivecluj12";
	public static String password="IveParola2";
	
	
	
	public static final String URL="https://www.endavauniversity.com";
	 private static WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.findElement(By.id("username")).sendKeys(username);
	 
	  driver.findElement(By.id("loginbtn")).click();
	  
	  Sleeper.sleepTightInSeconds(5);
	  
	  String message= driver.findElement(By.className("error")).getText();
	  System.out.println(message);
	  
	  assert message.contains("Invalid login, please try again.") : "You are logged in.";
	  
	
	  
	
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new FirefoxDriver();
	  driver.get(URL);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
	 
  }

}
