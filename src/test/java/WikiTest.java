import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
    }
}
