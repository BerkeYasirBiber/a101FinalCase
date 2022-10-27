package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_FarkliSaticilar {

    @Test
    public void farklisaticilar() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        Thread.sleep(1000);
        driver.get("https://www.hepsiburada.com/everest-sm-bt11-ince-rgb-kablosuz-mouse-p-HBV00001AJ1CJ");
        driver.findElement(By.xpath("//span[@class='addToCartButton']")).click();
        driver.findElement(By.xpath("//a[@class='checkoutui-Modal-2iZXl']")).click();
        JavascriptExecutor js = null;
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='153,00 TL']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"addToCart\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Sepete git']")).click();
        Thread.sleep(1000);


    }
}
