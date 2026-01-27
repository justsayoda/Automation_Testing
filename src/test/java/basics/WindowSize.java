package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\pc\\IdeaProjects\\QAcart_Selenium\\src\\test\\resources\\index.html");
        Dimension iphoneXR = new Dimension(414, 896);
        Dimension ipadAir = new Dimension(820, 1180);
        driver.manage().window().setSize(ipadAir);
    }
}
