package example.task3Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.List;

public class WebTest {
    private static final String BASE_URL = "https://trello.com/login";
    private static WebElement params;
    private static WebElement button;
    private static WebDriver driver = new ChromeDriver();
    static {
        System.setProperty("webdriver.chrome.driver", "F:\\Программы\\chromedriver_win32\\chromedriver.exe");
    }

    public static void main(String[] args) {

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.get(BASE_URL);
        System.out.println(driver.getPageSource());

        //авторизация на сайте
        Select login = new Select(driver.findElement(By.xpath("//input[@placeholder = 'Укажите адрес электронной почты']")));
        login.selectByVisibleText("uleev777@yandex.ru");
        button = driver.findElement(By.xpath("//input[@value = 'Войти с помощью Atlassian']"));
        button.click();
        Select password = new Select(driver.findElement(By.xpath("//input[@placeholder = 'Введите пароль']")));
        password.selectByVisibleText("iloveMasha*159");
        button = driver.findElement(By.xpath("//button[@id = 'login-submit']"));
        button.click();

        //запуск методов
        сheckCardLocation();

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

    private static void сheckCardLocation() {
        String cardName = "Карточка для изучения API";
        params = driver.findElement(By.xpath("//div[contains(text(), 'IPR_ULEEV')]"));
        params.click();
        params = driver.findElement(By.xpath("//span[contains(text(), 'Карточка для изучения API')]"));
        params.click();
        params = driver.findElement(By.xpath("//a[@class = 'js-open-move-from-header']"));
        if (params.getText().contains("Done")){
            System.out.println(cardName + " находится в колонке Done");
        } else {
            System.out.println(cardName + "не найдена в колонке Done");
        }
    }
}
