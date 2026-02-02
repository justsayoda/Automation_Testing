package FindElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C:\\Users\\pc\\IdeaProjects\\QAcart_Selenium\\src\\test\\resources\\index.html");

       // String elementText = driver.findElement(By.id("welcome")).getText();
       // String elementName = driver.findElement(By.name("description")).getText();
       // String className = driver.findElement(By.className("list1")).getText();
       // String tagName = driver.findElement(By.tagName("li")).getText();
       // String linkText = driver.findElement(By.linkText("Go to About Page")).getText();
        String partialLinkText = driver.findElement(By.partialLinkText("About Page")).getText();
        System.out.println(partialLinkText);
        driver.quit();

        //Xpath
        /*
        Xpath Expression
        // tagName[@attribute = 'value']
         */
    }
}
