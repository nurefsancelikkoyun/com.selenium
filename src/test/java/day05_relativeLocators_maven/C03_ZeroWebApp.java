package day05_relativeLocators_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ZeroWebApp {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        driver.findElement(By.className("icon-signin")).click();
        //3. Login alanine  “username” yazdirin
        WebElement loginKutusu =driver.findElement(By.id("user_login"));
        loginKutusu.sendKeys("username");
        //4. Password alanina “password” yazdirin
        WebElement passwordalanı = driver.findElement(By.id("user_password"));
        passwordalanı.sendKeys("password");
        //5. Sign in buttonuna tiklayin
        WebElement signInButtonu =driver.findElement(By.name("submit"));
        signInButtonu.click();
        //6. Back tusu ile sayfaya donun
        driver.navigate().back();
        //7. Online Banking menusunden Pay Bills sayfasina gidin
        WebElement onlineBaningMenu = driver.findElement(By.id("onlineBankingMenu"));
        onlineBaningMenu.click();
        driver.findElement(By.id("pay_bills_link")).click();
        //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amaountKutusu =driver.findElement(By.id("sp_amount"));
        amaountKutusu.sendKeys("200");
        //9. tarih kismina “2020-09-10” yazdirin
        WebElement dateKutusu =driver.findElement(By.id("sp_date"));
        dateKutusu.sendKeys("2020-09-10");
        //10. Pay buttonuna tiklayin
        WebElement payButtonu = driver.findElement(By.id("pay_saved_payees"));
        payButtonu.click();
        //11. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement cıktıKutusu = driver.findElement(By.id("alert_content"));
        if (cıktıKutusu.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
