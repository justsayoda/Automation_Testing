package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullScreen {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\pc\\IdeaProjects\\QAcart_Selenium\\src\\test\\resources\\index.html");

        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
    }
}
