package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02 {

    /*
     . .Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver. exetyi tanitalim
3-Driver'in tum ekranı kaplamasini sagu ayalim
4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.
5-"https://www.otta.de" adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/" adresine gidip
9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
    public static void main(String[] args) throws InterruptedException {
        //1-Driver oluşturalim
        WebDriver driver = new ChromeDriver();

        //2-Java class'imiza chnomedriver. exetyi tanitalim
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        //3-Driver'in tum ekranı kaplamasini sagu ayalim
        driver.manage().window().maximize();

        //4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        Thread.sleep(10000);
        // Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.

        //5-"https://www.otta.de" adresine gidelim
        driver.get("https://www.otta.de");

        //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim

        String ottoTitle =driver.getTitle();
        System.out.println("ottoTitle = "+ottoTitle);
        String ottoUrl = driver.getCurrentUrl();
        System.out.println("ottoUrl = "+ ottoUrl);

        //7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        if (ottoTitle.contains("OTTO")&& ottoUrl.contains("OTTO")){
            System.out.println("OTTO yazısı her ikisinde de vardır");
        }else {
            System.out.println("En az birinde OTTO yoktur.");
        }
        //8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/");

        //9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        String wqTitle=driver.getTitle();
        System.out.println("wqTitle = "+ wqTitle);

        boolean isTrue=wqTitle.contains("Quarter");
        if (isTrue){
            System.out.println("Your TEST PASSED");
        }else {
            System.out.println("Your TEST FAILED");
        }

        //10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();

        //11-Sayfayı yenileyelim
        driver.navigate().refresh();

        //12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close();
    }
}
