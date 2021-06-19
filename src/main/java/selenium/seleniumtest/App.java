package selenium.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    @Test
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "/Users/HM/Downloads/chromedriver-2");
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOption);
        System.out.println( "Hi Edureka!" );
        
        driver.get("http://localhost:3001");
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
        WebElement username=driver.findElement(By.name("login"));
        WebElement password=driver.findElement(By.name("password"));
        
        username.sendKeys("abc@gmail.com");
        password.sendKeys("your_password");
       
        driver.findElement(By.className("btn-primary")).click();
      //Thread.sleep(5000);
        driver.quit();
    }
}
