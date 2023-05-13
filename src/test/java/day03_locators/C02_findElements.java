package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class'i oluşturun ilgili ayarları yapın
        System.setProperty("wbdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2-https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");

        // 3-Category bölümündeki elementleri locate edin
       List<WebElement> categoryElementsList =driver.findElements(By.className("panel-title"));

       // 4-Category bölümünde 3 element olduğunu test edin
        int expectedSize=3;
        int actualSize=categoryElementsList.size();

        if (expectedSize==actualSize){
            System.out.println("Category element testi PASSED");
        } else {
            System.out.println("Category element testi FAILED");
        }

        // 5-Category isimlerini yazdırın
       /*
        System.out.println(categoryElementsList);
        Normalde bir list direkt yazdırılabilir
        Ancak findElement() ile bulunan elementler webelement olduğundan direkt YAZDIRILAMAZ.

        bir for-each loop kullanılarak listenin elementleri yazdırılabilir
        */
        for (WebElement eachElement:categoryElementsList
             ) {
            System.out.println(eachElement.getText() +" ");
        }

        // 6-Sayfayı kapatın
        Thread.sleep(3000);
        driver.close();





    }
}
