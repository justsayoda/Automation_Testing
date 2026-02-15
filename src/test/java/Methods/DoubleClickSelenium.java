package Methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickSelenium {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("C:\\Users\\pc\\IdeaProjects\\QAcart_Selenium\\src\\test\\resources\\index.html");

        Actions action = new Actions(driver);
        WebElement doubleClickButton = driver.findElement(By.xpath("/html/body/div[7]/input[1]"));
        //action.doubleClick(doubleClickButton).perform();
        action.contextClick(doubleClickButton).perform();

    }
}
