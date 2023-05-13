package day05_relativeLocators_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_GoogleNutella {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
        //3- cookies uyarisini kabul ederek kapatin

        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expectedIcerik ="Google";
        String actualTitle =driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title Testi FAILED");
        }
        //5- Arama cubuguna “Nutella” yazip aratin
        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@name='q']"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        //6- Bulunan sonuc sayisini yazdirin
        WebElement sonucYazıElementi =driver.findElement(By.id("result-stats"));
        System.out.println(sonucYazıElementi.getText());
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String sonucYazısıStr = sonucYazıElementi.getText();
        String[] sonucYaziKelimeleriArr =sonucYazısıStr.split(" ");
        String sonucSayiAdediStr =sonucYaziKelimeleriArr[1]; //130.000.000
        sonucSayiAdediStr =sonucYazısıStr.replaceAll("\\D",""); //130000000
        int sonucSayisiInt =Integer.parseInt(sonucSayiAdediStr);

        if (sonucSayisiInt>10000000){
            System.out.println("sonuc sayisi TESTİ PASSED");
        }else {
            System.out.println("sonuc sayisi Testi FAILED");
        }


        //8- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
