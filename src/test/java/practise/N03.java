package practise;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class N03 {
    public static void main(String[] args) throws InterruptedException {

        // 1- https://www.amazon.com/ sayfasına gidin.
        // 2- Arama kutusuna “city bike” yazip aratin
        // 3- Görüntülenen sonuçların sayısını yazdırın
        // 4- Listeden ilk urunun resmine tıklayın.

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");

        // 2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusuElementi.sendKeys("city bike"+ Keys.ENTER);

        // 3- Görüntülenen sonuçların sayısını yazdırın
      WebElement sonucSayisi =driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[2]"));

        // 4- Listeden ilk urunun resmine tıklayın.
        List<WebElement> urunListesiElementi = driver.findElements(By.className("sg-col-inner"));
        urunListesiElementi.get(0).click();

        Thread.sleep(3000);
        driver.close();




    }
}
