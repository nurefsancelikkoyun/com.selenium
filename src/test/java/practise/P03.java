package practise;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
     /* ...Exercise3...
    Navigate to  https://testpages.herokuapp.com/styled/index.html
    Click on  Calculater under Micro Apps
    Type any number in the first input
    Type any number in the second input
    Click on Calculate
    Get the result
    Print the result
      */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        // Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        //Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("24");
        Thread.sleep(2000);
        //Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("36");
        Thread.sleep(2000);
        //Click on Calculate
        driver.findElement(By.id("calculate")).click();
        //Get the result
        WebElement sonuc = driver.findElement(By.xpath("//*[@id='answer']"));
        //Print the result
        String result =driver.findElement(By.xpath("//*[@id='answer']")).getText();
        System.out.println("Answer = " +result);
        driver.quit();



    }
}
