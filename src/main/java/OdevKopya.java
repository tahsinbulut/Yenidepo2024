import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class OdevKopya {
public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();

    driver.get("https://www.cheapflights.com");
    driver.manage().window().maximize();
    JavascriptExecutor jsx;
    jsx=(JavascriptExecutor) driver;

    try{
        WebElement kalkis=driver.findElement(By.xpath("//div[@class='zEiP-formField zEiP-origin']"));
        kalkis.click();Thread.sleep(2000);
        WebElement kalkisGir=driver.findElement(By.xpath("//input[@type='text']"));
        for(int i=0;i<12;i++){
        kalkisGir.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);}
        kalkisGir.sendKeys("Dalaman",Keys.ENTER);
        Thread.sleep(2000);
        kalkisGir.sendKeys("Dalaman");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/ul/li[1]")).click();
        Thread.sleep(2000);

        WebElement varis= driver.findElement(By.xpath("//div[@class=\"zEiP-formField zEiP-destination\"]"));
        varis.click();
        Thread.sleep(2000);
        WebElement varisGir=driver.findElement(By.xpath("//input[@type='text']"));
        varisGir.sendKeys("Istanbul");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/ul/li[1]")).click();
        Thread.sleep(2000);



    }
    finally {
        driver.quit();
    }

    }
}
