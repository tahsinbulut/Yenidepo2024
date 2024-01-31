package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SwagLabsTest extends BaseTest {
    @Given("Kullanici giris sayfasinda")
    public void kullanici_giris_sayfasinda() {
      driver.get("https://www.saucedemo.com/");
    }

    @When("Kullanici adini girer")
    public void kullanici_adini_girer() {
        WebElement passwortBox=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        passwortBox.sendKeys("standard_user");
    }

    @And("Kullanici sifre girer")
    public void kullanici_sifre_girer() {
        WebElement usernameBox=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        usernameBox.sendKeys("secret_sauce");
    }

    @And("Kullanici logine tiklar")
    public void kullanici_logine_tiklar() {
        WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        loginButton.click();
    }

    @And("Kullanici alti urunu secip sepete ekler")
    public void kullanici_alti_urunu_secip_sepete_ekler() {
        WebElement backPackAddchart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        WebElement bikeLightAddchart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
        WebElement boldTshortAddchart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        WebElement jacketAddchart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        WebElement onesieAddchart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
        WebElement redTshortAddchart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
        backPackAddchart.click();
        bikeLightAddchart.click();
        boldTshortAddchart.click();
        jacketAddchart.click();
        onesieAddchart.click();
        redTshortAddchart.click();
    }

    @And("Kullanici sepete gider")
    public void kullanici_sepete_gider() {
        WebElement sepetButton=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        sepetButton.click();
    }

    @And("Kullanici kotrol edip check out butonuna tiklar")
    public void kullanici_kotrol_edip_check_out_butonuna_tiklar() {
        WebElement checkoutButton=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        checkoutButton.click();
    }

    @And("Kullanici ad soyad posta kodu girer")
    public void kullanici_ad_soyad_posta_kodu_girer() {
        WebElement firstNameBox=driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        WebElement lastNameBox=driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        WebElement postalKodBox=driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
        firstNameBox.sendKeys("tahsin");
        lastNameBox.sendKeys("bulut");
        postalKodBox.sendKeys("1234");
    }

    @And("Kullanici contiue buttonuna tiklar")
    public void kullanici_contiue_buttonuna_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        WebElement continiuButton=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        continiuButton.click();
    }


    @Then("Kullanici toplam fiyatlarin oldugu sayfaya gelir.")
    public void kullaniciToplamFiyatlarinOlduguSayfayaGelir() throws InterruptedException {
        Thread.sleep(2000);
        WebElement itemTotal=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String urunToplam=itemTotal.getText();
        Assert.assertEquals(urunToplam,"Item total: $129.94");
        System.out.println("test basarili");
    }
}
