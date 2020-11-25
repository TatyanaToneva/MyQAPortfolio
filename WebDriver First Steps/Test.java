import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Test {

public void test() { 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanchita\\Desktop\\Chrome Driver 1\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
   driver.get("https://abv.bg"); 
   driver.close(); 
  
}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanchita\\Desktop\\Chrome Driver 1\\chromedriver.exe");
WebDriver driver = new ChromeDriver(); 
driver.manage().window().maximize(); 
driver.get("http://training.skillo-bg.com:4300/posts/all");
WebElement login = driver.findElement(By.id("nav-link-login"));
login.click();
driver.close();

	
}
	

}


