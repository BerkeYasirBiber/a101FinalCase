package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class T01_GirisveDogrulama extends FinalCase {

    @Test
    public void girisvedogrulamalar() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hepsiburada.com/");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
        Thread.sleep(500);
        WebElement loginbutton = driver.findElement(By.cssSelector("#myAccount > span > span.sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq"));
        Actions actions = null;
        actions.moveToElement(loginbutton).perform();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login")).click();
        driver.findElement(By.cssSelector("#txtUserName")).sendKeys("brkysrbbr@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#btnLogin")).click();
        driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Banane987");
        driver.findElement(By.cssSelector("#btnEmailSelect")).click();
        Thread.sleep(1000);
        String bkullanicigiris = "Berke Biber";
        String gkullanicigiris = driver.findElement(By.cssSelector("#myAccount > span > a > span.sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR")).getText();
        Assert.assertEquals(bkullanicigiris, gkullanicigiris);
        System.out.println(gkullanicigiris);
        Thread.sleep(2000);



    }
}
