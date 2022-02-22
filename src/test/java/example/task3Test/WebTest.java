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
    static {
        System.setProperty("webdriver.chrome.driver", "F:\\Программы\\chromedriver_win32\\chromedriver.exe");
    }
    private static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.get(BASE_URL);

        //запуск методов
        authorizationOnTrelloWebsite();
        сheckCardLocation();
        checkImplementationAllChecklistItems();

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

    private static void authorizationOnTrelloWebsite() {
        driver.findElement(By.xpath("//input[@placeholder = 'Укажите адрес электронной почты']")).sendKeys("uleev777@yandex.ru");
        button = driver.findElement(By.xpath("//input[@value = 'Войти с помощью Atlassian']"));
        button.click();
        driver.findElement(By.xpath("//input[@placeholder = 'Введите пароль']")).sendKeys("iloveMasha*159");
        button = driver.findElement(By.xpath("//button[@id = 'login-submit']"));
        button.click();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
    }

    private static void сheckCardLocation() {
        String boardName = "IPR_ULEEV";
        String cardName = "Карточка для изучения API";

        params = driver.findElement(By.xpath("//div[contains(text(), '" + boardName + "')]"));
        params.click();
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        params = driver.findElement(By.xpath("//textarea[text() = 'Done']//following::span[contains(text(), '" + cardName + "')]"));
        params.click();
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        params = driver.findElement(By.xpath("//a[@class = 'js-open-move-from-header']"));
        if (params.getText().contains("Done")){
            System.out.println(cardName + " находится в колонке Done");
        } else {
            System.out.println(cardName + " не найдена в колонке Done");
        }
    }

    private static void checkImplementationAllChecklistItems() {
        params = driver.findElement(By.xpath("//span[@class = 'checklist-progress-percentage js-checklist-progress-percent']"));
        if (params.getText().contains("100%")) {
            System.out.println("Чек-лист выполнен на 100%");
        } else {
            System.out.println("Чек-лист выполнен на " + params.getText());
        }
    }
}
