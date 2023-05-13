package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        //sisteme webdriver'in ne olacağını ve bu driverin hangi dosya yolunda olduğunu söyler
        WebDriver driver = new ChromeDriver();
        //bilgisayarımızdaki Chrome browser'in otomasyonla çalışacak bir kopyasını oluşturur
        //Chrome dışında bir browser kullanmak istersek o browserin driverini indirip
        //System.setProperty("webdriver.safari.driver","safari driver'in dosya yolu");

        //Ulusturduğumuz driver objesi bizim elimiz,gözümüz gibidir

        driver.get("https://www.amazon.com"); //istenen url'e bizi götürür
        //www yazmazsak çalışır ancak https yazmazsak calışmaz

        System.out.println(driver.getTitle());// bize title ı döndürür
        //Amazon.com. Spend less. Smile more.

        System.out.println(driver.getCurrentUrl());
        //https://www.amazon.com/

        System.out.println(driver.getPageSource());
        //gidilen web sayfasının kaynak kodlarını döndürür

        System.out.println(driver.getWindowHandle()); //F7733F698E5410761F1B22D2C5B31921
        //acılan her bir pencereye verilen unique hash code değeridir

        System.out.println(driver.getWindowHandles()); //[B2294FB8CB67CFF1552ADA33296BA223]
        //eğer driver calışırken birden fazla pencere veya tab oluşturduysa
        //açılan tum windows/tablerin unique hash code'larını bi set olarak döndürür


        Thread.sleep(5000); //mili saniye olarak yazdığımız sayi suresince kodu bekletir
        driver.close(); //acılan browseri kapatır


    }
}
