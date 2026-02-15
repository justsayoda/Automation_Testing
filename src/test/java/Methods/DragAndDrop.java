package Methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\pc\\IdeaProjects\\QAcart_Selenium\\src\\test\\resources\\index.html");

        Actions action = new Actions(driver);

        WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable-1\"]"));
        WebElement destination = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]"));

       // action.dragAndDrop(source, destination);
        action.clickAndHold(source).moveToElement(destination).release().build().perform();

    }
}
