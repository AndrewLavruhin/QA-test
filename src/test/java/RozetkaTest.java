import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by User on 07.08.2017.
 */
public class RozetkaTest {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void rozetkaTest () {
        driver.get("https://rozetka.com.ua/ua/");

        WebElement enterInRoom = driver.findElement(By.xpath("//a[@href=\"https://my.rozetka.com.ua/ua/signin/\"]"));
        enterInRoom.click();

        WebElement registerInRoom = driver.findElement(By.xpath("//a[@href=\"https://my.rozetka.com.ua/ua/signup/\"]"));
        registerInRoom.click();

        WebElement enterName = driver.findElement(By.xpath("//input[@name=\"title\"]"));
        enterName.clear();
        enterName.sendKeys("тест розетка");

        WebElement enterEmail = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        enterEmail.clear();
        enterEmail.sendKeys("rognuverzu@deyom.com");

        WebElement enterPas = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        enterPas.clear();
        enterPas.sendKeys("Test123456");

        WebElement clickReg = driver.findElement(By.xpath("//button[@class=\"btn-link-i\"]"));
        clickReg.click();

    }



}
