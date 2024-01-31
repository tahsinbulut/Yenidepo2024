import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Home {

public static void main(String[] args)  throws Exception {
            WebDriver driver = new ChromeDriver();
           try {
               driver.get("https://www.cheapflights.com");

               WebElement originAirport=driver.findElement(By.xpath("//div[@class='zEiP-formField zEiP-origin']"));
               originAirport.click();
               System.out.println("a");
           }
           finally {
               driver.quit();
           }

        }
    }

