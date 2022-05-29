
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

import java.util.List;

/*Domaći: Otići na kupujemprodajem.com,
        u pretragu ukucati iphone 13, kliknuti na prvi rezultat.
        Proveriti da je naslov oglasa onaj koji smo uočili i tokom manuelnog izvođenja kejsa.*/
public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\GIT project\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kupujemprodajem.com/");
        driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]")).click();
        WebElement btnSearch= driver.findElement(By.xpath("//*[@id=\"searchKeywordsInput\"]"));
        btnSearch.sendKeys("iphone 13");
        btnSearch.sendKeys(Keys.ENTER);
        driver.switchTo().frame("master-1").findElement(By.xpath("//*[@id=\"e1\"]/div/div[1]/div/div[2]/a")).click();

        System.out.println(driver.getTitle());


    }
}

