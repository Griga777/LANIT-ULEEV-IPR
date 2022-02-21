package example.task3Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.List;


public class WebTest {
    static {
        System.setProperty("webdriver.chrome.driver", "E:\\ЛАНИТ\\Программы\\chromedriver_win32\\chromedriver.exe");
    }
    static WebDriver driver = new ChromeDriver();
    static WebElement params;

    public static void main(String[] args) {

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.get("https://www.avito.ru/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);

        findCategory();
        searchAd();
        clickFieldCity();
        fieldCityVladivostok();
        activateCheckbox();
        selectFilter();
        mostPriceyPrinters();

        try {
            Thread.sleep(7_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
