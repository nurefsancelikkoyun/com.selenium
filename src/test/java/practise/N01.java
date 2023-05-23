package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class N01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https:///www.amazon.com");
        //Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        String expectedIcerik = "amazon";
        String actualIcerik = driver.getCurrentUrl();
        if (actualIcerik.contains(expectedIcerik)){
            System.out.println("title amazon içeriyor test passed");
        }else {
            System.out.println("test failed");
        }
        //Sayfa handle degerini
        System.out.println(driver.getWindowHandle());
        //Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        expectedIcerik ="alışveriş";
        actualIcerik= driver.getPageSource();
        if (actualIcerik.contains(expectedIcerik)){
            System.out.println("Sayfa kaynak kodlari alisveris iceriyor, test PASSED");
        }else {
            System.out.println("Test failed");
        }

        //Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();
    }




}
