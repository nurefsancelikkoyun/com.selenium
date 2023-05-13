package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) throws InterruptedException {

        //once gerekli ayarlamaları yapıp driver objesi oluşturmalıyız
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();




       // 1. Yeni bir package olusturalim : day01
       // 2. Yeni bir class olusturalim : C03_GetMethods
       // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
       // 4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa baslıgı : "+ driver.getTitle());

       // 5. Sayfa basliginin “Amazon” icerdigini test edin
        //yazılım testi beklenen değerlerin gercekleşip gercekleşmediğini test etmektir

        String expectedIcerik="Amazon";
        String actualTitle =driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title Amazon içeriyor ,Test PASSED");
        }else {
            System.out.println("Title Amazon içermiyor,Test FAILED");
        }


       // 6. Sayfa adresini(url) yazdirin
        System.out.println("Sayfa url : "+driver.getCurrentUrl());
       // 7. Sayfa url’inin “amazon” icerdigini test edin.

        expectedIcerik ="amazon";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Url amazon içeeriyor,Url test PASSED");
        } else {
            System.out.println("Url amazon içermiyor,Url test failed");
        }

       // 8. Sayfa handle degerini yazdirin
        System.out.println("Sayfanın handle değeri : "+driver.getWindowHandle());
       // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        expectedIcerik="alisveris";
        String actualPageSource= driver.getPageSource();
        if (actualPageSource.contains(expectedIcerik)){
            System.out.println("Sayfa kaynak kodlari alisveris iceriyor, test PASSED");
        }else {
            System.out.println("Sayfa kaynak kodlari alisveris icermiyor, test FAILED");
        }
       // 10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();



    }
}
