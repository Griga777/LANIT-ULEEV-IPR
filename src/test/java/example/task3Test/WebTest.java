package example.task3Test;

import example.DataBase.User;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Base64;

import static example.DataBase.TestData.getCurrentUser;

public class WebTest {
    private static final String BASE_URL = "https://trello.com/login";
    private static WebElement params;
    private static WebElement button;

    static {
        System.setProperty("webdriver.chrome.driver", "F:\\Программы\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(chromeOptions);
    }
    private static WebDriver driver;

    static User currentUser = getCurrentUser(2);
    public static String EMAIL = currentUser.getEmail();
    public static String PASS = currentUser.getPassword();
    static byte[] decodedBytes = Base64.getMimeDecoder().decode(PASS);
    public static String decodedPassword = new String(decodedBytes);

    @Test
    public void siteTrelloWebTests() {
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
        sleep();

        driver.quit();
    }

    private static void sleep() {
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void authorizationOnTrelloWebsite() {
        driver.findElement(By.xpath("//input[@placeholder = 'Укажите адрес электронной почты']")).sendKeys(EMAIL);
        button = driver.findElement(By.xpath("//input[@value = 'Войти с помощью Atlassian']"));
        button.click();
        driver.findElement(By.xpath("//input[@placeholder = 'Введите пароль']")).sendKeys(decodedPassword);
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
        driver.findElement(By.xpath("//textarea[text() = '" + columnName + "']//following::span[contains(text(), '" + cardName
                + "')]//ancestor-or-self::a[contains(@class, 'list-card js-member-droppable')]")).click();
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

        checkExecutionItem(checkitemName1);
        checkExecutionItem(checkitemName2);
        params = driver.findElement(By.xpath("//span[@class = 'checklist-progress-percentage js-checklist-progress-percent']"));
        if (params.getText().contains("100%")) {
            System.out.println("Чек-лист выполнен на 100%");
        } else {
            System.out.println("Чек-лист выполнен на " + params.getText());
        }
    }

    private static void checkExecutionItem(String item) {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(), '" + item + "')]//ancestor-or-self::div[contains(@class, 'checklist-item no-assignee no-due')]"));
        if (element.getAttribute("class").contains("checklist-item-state-complete")) {
            System.out.println("Пункт " + item + " выполнен");
        } else {
            System.out.println("Пункт " + item + " не выполнен");
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

        sleep();
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
