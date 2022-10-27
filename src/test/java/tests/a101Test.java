package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class a101Test {

    @Test
    public void a101FinalCase() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--acceptInsecureCerts");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.hepsiburada.com/");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
        Thread.sleep(500);
        WebElement loginbutton = driver.findElement(By.cssSelector("#myAccount > span > span.sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq"));
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
        WebElement search = driver.findElement(By.xpath("//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));
        search.sendKeys("mouse");
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"i0\"]/div/a/div[2]/h3")).click();
        Thread.sleep(500);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        driver.close();

        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.getCurrentUrl());


        Thread.sleep(1000);
        driver.get("https://www.hepsiburada.com/everest-sm-bt11-ince-rgb-kablosuz-mouse-p-HBV00001AJ1CJ");
        driver.findElement(By.xpath("//span[@class='addToCartButton']")).click();
        driver.findElement(By.xpath("//a[@class='checkoutui-Modal-2iZXl']")).click();
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(500);
        driver.findElement(By.xpath("(//button[@class='add-to-basket button small'])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"addToCart\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Sepete git']")).click();
        Thread.sleep(1000);


        String gsepetim = driver.findElement(By.cssSelector("#app > div > div > div.basket_container_1Qgsu > div > div.main_content_2-tLP > section > header > div.basket_headerTop_15H0U > h1")).getText();
        String bsepetim = "Sepetim";
        Assert.assertEquals(bsepetim, gsepetim);
        System.out.println(gsepetim);


        String gsecilenurunler = driver.findElement(By.cssSelector("#app > div > div > div.basket_container_1Qgsu > div > div.sidebar_container_2x8y6 > div > div > div.step_container_2W__G > div.payed_prices_1G2ue > span.title_4v3Ym > div > div > span")).getText();
        System.out.println(gsecilenurunler);
        String bsecilenurunler = "SEÇİLEN ÜRÜNLER (2)";
        Assert.assertEquals(bsecilenurunler, gsecilenurunler);


        String gfiyat = driver.findElement(By.cssSelector("#basket_payedPrice > div")).getText();
        System.out.println(gfiyat);
        String bfiyat = "489,00";
        Assert.assertEquals(bfiyat, gfiyat);


        String gmouse = driver.findElement(By.xpath("//a[text()='Everest SM-BT11 Ince Rgb Kablosuz Mouse']")).getText();
        System.out.println(gmouse);
        String bmouse = "Everest SM-BT11 Ince Rgb Kablosuz Mouse";
        Assert.assertEquals(bmouse, gmouse);

    }
}
