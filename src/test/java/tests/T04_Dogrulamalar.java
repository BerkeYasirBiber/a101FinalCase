package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T04_Dogrulamalar {

    @Test
    public void dogrulamalar(){


        WebDriver driver = new ChromeDriver();

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
        String bfiyat = "302,00";
        Assert.assertEquals(bfiyat, gfiyat);


        String gmouse = driver.findElement(By.xpath("//a[text()='Everest SM-BT11 Ince Rgb Kablosuz Mouse']")).getText();
        System.out.println(gmouse);
        String bmouse = "Everest SM-BT11 Ince Rgb Kablosuz Mouse";
        Assert.assertEquals(bmouse, gmouse);


    }
}
