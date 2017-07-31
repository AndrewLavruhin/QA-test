import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by User on 31.07.2017.
 */
public class WikiTest {
    private WebDriver driver; //интерфейс

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.drive", "chromedriver.exe"); //прописываем путь к драйверу
        driver = new ChromeDriver(); //указываем драйвер
        driver.manage().window().maximize();

    }
    @Test
    public void dotesting() throws InterruptedException {
        driver.get("https://ru.wikipedia.org");
        Thread.sleep(5000);
        WebElement input = driver.findElement(By.xpath("//input[@name='search']"));
        input.sendKeys("Ромашка");
        input.submit();
        String actualTitle = driver.getTitle();
        Assert.assertTrue(String.format("Неправильный месседж! Реальный месседж: '%s'", actualTitle), actualTitle.equals("Ромашка — Википедия"));
    }
    @After
    public void tearDown() {
        driver.close();
    }
}
