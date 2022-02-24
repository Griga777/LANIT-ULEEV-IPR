package example.task3Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

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
        setCover();
        markWorkDoneOnTime();
        changeBoardBackground();

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
    }

    private static void сheckCardLocation() {
        String boardName = "IPR_ULEEV";
        String columnName = "Done";
        String cardName = "Карточка для изучения API";

        params = driver.findElement(By.xpath("//div[contains(text(), '" + boardName + "')]"));
        params.click();
        params = driver.findElement(By.xpath("//textarea[text() = '" + columnName + "']//following::span[contains(text(), '" + cardName + "')]//ancestor-or-self::div[@class = 'list-card-details js-card-details']"));
        params.click();
        params = driver.findElement(By.xpath("//a[@class = 'js-open-move-from-header']"));
        if (params.getText().contains("Done")){
            System.out.println(cardName + " находится в колонке Done");
        } else {
            System.out.println(cardName + " не найдена в колонке Done");
        }
    }

    private static void checkImplementationAllChecklistItems() {
        String checkitemName1 = "Понять протокол HTTP";
        String checkitemName2 = "Выучить методы запросов";

        params = driver.findElement(By.xpath("//span[@class = 'checklist-progress-percentage js-checklist-progress-percent']"));
        if (params.getText().contains("100%")) {
            System.out.println("Чек-лист выполнен на 100%");
        } else {
            System.out.println("Чек-лист выполнен на " + params.getText());
        }
        params = driver.findElement(By.xpath("//span[contains(text(), '" + checkitemName1 + "')]//preceding::span[@class = 'checklist-item-checkbox-check']"));
        if (params.isSelected()) {
            System.out.println("Пункт " + checkitemName1 + " выполнен");
        } else {
            System.out.println("Пункт " + checkitemName1 + " не выполнен");
        }
        params = driver.findElement(By.xpath("//span[contains(text(), '" + checkitemName2 + "')]//preceding::span[@class = 'checklist-item-checkbox-check'][1]"));
        if (params.isSelected()) {
            System.out.println("Пункт " + checkitemName2 + " выполнен");
        } else {
            System.out.println("Пункт " + checkitemName2 + " не выполнен");
        }
    }

    private static void setCover() {
        button = driver.findElement(By.xpath("//a[@title = 'Обложка']"));
        button.click();
        button = driver.findElement(By.xpath("//button[@class = '_31xT7xOqkxPLkw _1hFyzxe1-LRBw8']"));
        button.click();
        params = driver.findElement(By.xpath("//a[@class = 'pop-over-header-close-btn icon-sm icon-close']"));
        params.click();
    }

    private static void markWorkDoneOnTime() {
        params = driver.findElement(By.xpath("//span[@class = 'card-detail-badge-due-date-complete-icon']"));
        params.click();
    }

    private static void changeBoardBackground() {
        params = driver.findElement(By.xpath("//a[@class = 'icon-md icon-close dialog-close-button js-close-window dialog-close-button-dark']"));
        params.click();
        params = driver.findElement(By.xpath("//span[@class = 'icon-sm icon-overflow-menu-horizontal board-header-btn-icon']"));
        params.click();
        params = driver.findElement(By.xpath("//a[@class = 'board-menu-navigation-item-link js-change-background']//span"));
        params.click();
        params = driver.findElement(By.xpath("//div[contains(text(), 'Цвета')]//preceding::div[@class = 'image'][1]"));
        params.click();
        params = driver.findElement(By.xpath("//div[@style = 'background-color: rgb(81, 152, 57);']"));
        params.click();
        params = driver.findElement(By.xpath("//a[@title = 'Закрыть меню доски.']"));
        params.click();
    }
}
