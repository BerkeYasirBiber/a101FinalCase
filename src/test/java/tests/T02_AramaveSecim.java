package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class T02_AramaveSecim {


    @Test
    public void aramavesecim() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

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





    }
}
