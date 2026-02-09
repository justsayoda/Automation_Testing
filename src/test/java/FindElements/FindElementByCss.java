package FindElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByCss {
    public static void main(String[] args){

       // By welcomeHeader = By.id("welcome");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\pc\\IdeaProjects\\QAcart_Selenium\\src\\test\\resources\\index.html");


        List<WebElement> courseList = driver.findElements(By.cssSelector(".course-list li"));


        System.out.println(courseList.size());

        driver.quit();
    }

    // #ID
    // .className
    // [data-testid="welcome-header"]
}
