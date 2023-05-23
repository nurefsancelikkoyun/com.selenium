package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class N02 {
    public static void main(String[] args) throws InterruptedException {




        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon ana sayfaya gıdın arama kutusuna
        driver.get("https://www.amazon.com");

        WebElement aramaKutusuElementi =driver.findElement(By.id("twotabsearchtextbox"));

        // Nutella yazdırıp
        aramaKutusuElementi.sendKeys("Nutella");

        //enter tusuna basarak arama yapın
        aramaKutusuElementi.submit();

        Thread.sleep(5000);
        driver.close();



    }
}
