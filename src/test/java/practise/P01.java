package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {

       /*
       Exercise 1:
       Create a new class with main method
       Set Path
       Create a chrome driver
       Maximize window
       Open google home page https://www.google.com
       On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
       Wait about 4 sn
       Navigate forward to amazon
       Refresh page
       Close/quit the browser
       And Last step print "All is well" on console

        */

    //Create a new class with main method
    public static void main(String[] args) throws InterruptedException {


        //Set Path
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe"); //Bu satırda driver'ımızı tanıttık ve yolunu gösterdik

        //Create a chrome driver
        WebDriver driver = new ChromeDriver(); //Calışacağımız tarayıcıyı belirledik.

        //Maximize window
        driver.manage().window().maximize();

        //Open google home page https://www.google.com
        driver.get("https://www.google.com"); //Burada gideceğimiz adresi belirledik
        //Get ile Navigate komutlarını kullanırken get komutu daha hızlı calıştığı için tercih edilir
        //navigate komutu ise daha cok bağımlı durumlarda tercih edilir


        //On the same class,
        // navigate to amazon home page https://www.amazon.com

        driver.navigate().to("https://www.amazon.com");

        // and navigate back to google
        driver.navigate().back();

        //Wait about 4 sn
        Thread.sleep(4000);

        //Navigate forward to amazon
        driver.navigate().forward();

        //Refresh page
        driver.navigate().refresh();

        //Close/quit the browser
        driver.quit(); //Close son acık sayfayı kapatır.quit ise hepsini kapatır

        //And Last step print "All is well" on console
        System.out.println("All is well");



    }
}
