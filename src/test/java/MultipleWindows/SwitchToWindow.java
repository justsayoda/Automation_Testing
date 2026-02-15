package MultipleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToWindow {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/windows.html");

        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("/html/body/div/div/a[2]")).click();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window :allWindows) {
          if (!window.equalsIgnoreCase(parent)) {
              driver.switchTo().window(window);
              Thread.sleep(3000);
              driver.close();
          }
        }

        driver.switchTo().window(parent);
        driver.findElement(By.xpath("/html/body/div/div/a[1]")).click();




        driver.quit();
    }
}
