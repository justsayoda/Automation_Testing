package Methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClickSelenium {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://todo.qacart.com/login");

        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("syd85436@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("01141245560");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"complete-task\"]")).click();
    }
}
