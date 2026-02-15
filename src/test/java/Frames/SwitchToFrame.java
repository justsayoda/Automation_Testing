package Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");

        WebElement clickMe = driver.findElement(By.id("qacart"));
        driver.switchTo().frame(clickMe);
        driver.findElement(By.xpath("//*[@id=\"actions-button\"]")).click();

    }
}
