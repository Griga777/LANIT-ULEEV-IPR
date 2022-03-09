package example.task3Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebTest {
    private static final String BASE_URL = "https://trello.com/login";
    private static final String EMAIL = "uleev777@yandex.ru";
    private static final String PASS = "iloveMasha*159";
    private static WebElement params;
    private static WebElement button;

    static {
        System.setProperty("webdriver.chrome.driver", "F:\\Программы\\chromedriver_win32\\chromedriver.exe");
    }

    private static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(BASE_URL);

        //запуск методов
        authorizationOnTrelloWebsite();
        сheckCardLocation();
        checkImplementationAllChecklistItems();
        setCover();
        markWorkDoneOnTime();
        changeBoardBackground();
        changeBoardName();
        hookAfter();

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    private static void authorizationOnTrelloWebsite() {
        driver.findElement(By.xpath("//input[@placeholder = 'Укажите адрес электронной почты']")).sendKeys(EMAIL);
        button = driver.findElement(By.xpath("//input[@value = 'Войти с помощью Atlassian']"));
        button.click();
        driver.findElement(By.xpath("//input[@placeholder = 'Введите пароль']")).sendKeys(PASS);
        button = driver.findElement(By.xpath("//button[@id = 'login-submit']"));
        button.click();
        System.out.println("Авторизация прошла успешна!");
    }

    private static void сheckCardLocation() {
        String boardName = "IPR_ULEEV";
        String columnName = "Done";
        String cardName = "Карточка для изучения API";

        driver.findElement(By.xpath("//div[contains(text(), '" + boardName + "')]")).click();
        System.out.println("Доска " + boardName + " выбрана");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[text() = '" + columnName
                + "']//following::span[contains(text(), '" + cardName + "')]//ancestor-or-self::a[contains(@class, 'list-card js-member-droppable')]"))).click();
        System.out.println(cardName + " выбрана");
        params = driver.findElement(By.xpath("//a[@class = 'js-open-move-from-header']"));
        if (params.getText().contains("Done")) {
            System.out.println(cardName + " находится в колонке Done");
        } else {
            System.out.println(cardName + " не найдена в колонке Done");
        }
    }

    private static void checkImplementationAllChecklistItems() {
        String checkitemName1 = "Понять протокол HTTP";
        String checkitemName2 = "Выучить методы запросов";

        driver.findElement(By.xpath("//span[contains(text(), '" + checkitemName1 + "')]//ancestor-or-self::div[contains(@class, 'checklist-item no-assignee no-due checklist-item-state-complete')]")).isDisplayed();
        System.out.println("Пункт " + checkitemName1 + " выполнен");
        driver.findElement(By.xpath("//span[contains(text(), '" + checkitemName2 + "')]//ancestor-or-self::div[contains(@class, 'checklist-item no-assignee no-due checklist-item-state-complete')]")).isDisplayed();
        System.out.println("Пункт " + checkitemName2 + " выполнен");
        params = driver.findElement(By.xpath("//span[@class = 'checklist-progress-percentage js-checklist-progress-percent']"));
        if (params.getText().contains("100%")) {
            System.out.println("Чек-лист выполнен на 100%");
        } else {
            System.out.println("Чек-лист выполнен на " + params.getText());
        }
    }

    private static void setCover() {
        button = driver.findElement(By.xpath("//a[@class = 'window-cover-menu-button js-card-cover-chooser']"));
        button.click();
        button = driver.findElement(By.xpath("//button[@class = '_31xT7xOqkxPLkw _1hFyzxe1-LRBw8']"));
        button.click();
        params = driver.findElement(By.xpath("//a[@class = 'pop-over-header-close-btn icon-sm icon-close']"));
        params.click();
        System.out.println("Обложка для карточки выбрана");
    }

    private static void markWorkDoneOnTime() {
        driver.findElement(By.xpath("//span[@class = 'card-detail-badge-due-date-complete-icon']")).click();
        System.out.println("Чекбокс Срок активирован");
    }

    private static void changeBoardBackground() {
        driver.findElement(By.xpath("//a[@class = 'icon-md icon-close dialog-close-button js-close-window dialog-close-button-dark']")).click();
        driver.findElement(By.xpath("//span[@class = 'icon-sm icon-overflow-menu-horizontal board-header-btn-icon']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Сменить фон')]")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Цвета')]//preceding::div[@class = 'image'][1]")).click();
        driver.findElement(By.xpath("//div[@style = 'background-color: rgb(81, 152, 57);']")).click();
        driver.findElement(By.xpath("//a[@title = 'Закрыть меню доски.']")).click();
        System.out.println("Фон доски изменён");
    }

    private static void changeBoardName() {
        String newBoardName = "Только для образования";

        driver.findElement(By.xpath("//div[@class = 'board-header-btn mod-board-name inline-rename-board js-rename-board']")).click();
        driver.findElement(By.xpath("//div[@class = 'board-header-btn mod-board-name inline-rename-board js-rename-board is-editing']//input")).sendKeys(newBoardName, Keys.ENTER);
        System.out.println("Имя доски изменено");
    }

    private static void hookAfter() {
        String oldBoardName = "IPR_ULEEV";
        String columnName = "Done";
        String cardName = "Карточка для изучения API";

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[@class = 'board-header-btn mod-board-name inline-rename-board js-rename-board']")).click();
        driver.findElement(By.xpath("//div[@class = 'board-header-btn mod-board-name inline-rename-board js-rename-board is-editing']//input")).sendKeys(oldBoardName, Keys.ENTER);
        System.out.println("Имя доски изменено обратно");

        driver.findElement(By.xpath("//span[@class = 'icon-sm icon-overflow-menu-horizontal board-header-btn-icon']")).click();
        driver.findElement(By.xpath("//div[@style = 'background-color: rgb(0, 121, 191);']")).click();
        driver.findElement(By.xpath("//a[@title = 'Вернуться.']")).click();
        driver.findElement(By.xpath("//a[@title = 'Вернуться.']")).click();
        driver.findElement(By.xpath("//a[@title = 'Закрыть меню доски.']")).click();
        System.out.println("Фон доски изменён обратно");

        driver.findElement(By.xpath("//textarea[text() = '" + columnName + "']//following::span[contains(text(), '" +
                cardName + "')]//ancestor-or-self::a[contains(@class, 'list-card js-member-droppable')]")).click();
        driver.findElement(By.xpath("//span[@class = 'card-detail-badge-due-date-complete-icon']")).click();
        System.out.println("Чекбокс Срок деактивирован");

        button = driver.findElement(By.xpath("//a[@class = 'window-cover-menu-button js-card-cover-chooser']"));
        button.click();
        button = driver.findElement(By.xpath("//button[contains(@style, '/download/FOTO.jpg')]"));
        button.click();
        driver.findElement(By.xpath("//a[@class = 'pop-over-header-close-btn icon-sm icon-close']")).click();
        System.out.println("Обложка для карточки изменена обратно");

        driver.findElement(By.xpath("//a[@class = 'icon-md icon-close dialog-close-button js-close-window dialog-close-button-dark']")).click();
        driver.findElement(By.xpath("//a[@aria-label = 'Вернуться на главную страницу']")).click();
        System.out.println("Вернулся на главную страницу");
    }
}
