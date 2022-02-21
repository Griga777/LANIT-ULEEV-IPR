package example.task3Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.List;

public class WebTest {
    private static final String BASE_URL = "https://trello.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Программы\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.get(BASE_URL);

        System.out.println(driver.getPageSource());

//        findCategory();
//        searchAd();
//        clickFieldCity();
//        fieldCityVladivostok();
//        activateCheckbox();
//        selectFilter();
//        mostPriceyPrinters();

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
