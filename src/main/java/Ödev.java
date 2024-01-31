import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ödev {
    public static void main(String[] args) throws  InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cheapflights.com");
        try {

            WebElement kalkisNoktasi=driver.findElement(By.xpath("//div[@class='zEiP-formField zEiP-origin']"));
            kalkisNoktasi.click();
            driver.findElement(By.xpath(  "//input[@placeholder='From?']")).sendKeys("Dalaman", Keys.ENTER);
            WebElement varisNoktasi=driver.findElement(By.xpath( "//div[@class=\"zEiP-formField zEiP-destination\"]"));
            varisNoktasi.click();
            WebElement varisNoktasiSec= driver.findElement(By.xpath(  "//input[@placeholder='To?']"));
            Thread.sleep(2000);
            varisNoktasiSec.sendKeys("Istanbul", Keys.ENTER);
            WebElement gidisDonüsTakvim= driver.findElement(By.xpath("//div[@class='cQtq-input cQtq-mod-responsive']"));
            gidisDonüsTakvim.click();
            WebElement gidisTarihi=driver.findElement(By.xpath("//div[@aria-label='Monday December 25, 2023']"));
            WebElement dönüsTarihi=driver.findElement(By.xpath("//div[@aria-label='Wednesday January 24, 2024']"));
            gidisTarihi.click();
            Thread.sleep(2000);
            dönüsTarihi.click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='zEiP-formField zEiP-traveler']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//label[@data-text='Business']")).click();
            driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[1]")).click();

            WebElement findDeals= driver.findElement(By.xpath("//button[@aria-label='Find Deals']"));
            Thread.sleep(1000);
            findDeals.click();
            Thread.sleep(2000);
        }
        finally {
            driver.quit();
        }
    }
}
