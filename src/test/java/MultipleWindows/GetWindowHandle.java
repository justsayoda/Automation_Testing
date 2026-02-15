package MultipleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/windows.html");

        System.out.println(driver.getWindowHandle());
        driver.findElement(By.xpath("/html/body/div/div/a[2]")).click();
        System.out.println(driver.getWindowHandles());

        driver.quit();
    }
}
