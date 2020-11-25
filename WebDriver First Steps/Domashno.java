//Тест, който да отваря сайта iskillo, да попълва username и password и да натиска бутон Login.

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domashno {


public void test() { 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanchita\\Desktop\\Chrome Driver 1\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://training.skillo-bg.com:4300/posts/all"); 
WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));
username.sendKeys("Tatyana5");

WebDriver driver2 = new ChromeDriver();
driver2.get("http://training.skillo-bg.com:4300/posts/all");
WebElement password = driver2.findElement (By.id("defaultLoginFormPassword"));
password.sendKeys("Taty7ana");

WebDriver driver3 = new ChromeDriver();
driver3.get("http://training.skillo-bg.com:4300/posts/all"); 
WebElement login = driver3.findElement(By.id("nav-link-login"));
login.click();

WebDriver driver4 = new ChromeDriver();
driver4.get("http://training.skillo-bg.com:4300/posts/all"); 
WebElement signin = driver4.findElement(By.id("sign-in-button"));
signin.click();





driver3.close(); 


			   

	}

}
