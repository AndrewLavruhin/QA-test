package HomeWork;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void firstTest(){
        driver.get("http://www.seleniumhq.org/");
        WebElement downloadBtn = driver.findElement(By.xpath("//a[@title='Get Selenium']"));
        downloadBtn.click();
        WebElement downloadJavaBtn = driver.findElement(By.xpath("//td[text()=\"Java\"]/..//a[text()=\"Download\"]"));
        downloadJavaBtn.click();

    }

    @Test
    public void secondTest() throws InterruptedException {
        driver.get("https://www.google.com.ua/");
        WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
        waitForElementTobeShown(searchField);
        String containsWord = "Java";
        searchField.sendKeys(containsWord);
        searchField.submit();
        List<WebElement> recordTitles = driver.findElements(By.xpath("//div[@class=\"g\"]//div//div//h3[contains(@class, \"r\")]"));
        for (WebElement recordTitle : recordTitles) {
            Assert.assertTrue(String.format("No '%s' word in the title", containsWord),
                    recordTitle.getText().contains("Java"));
        }
    }

    public void waitForElementTobeShown(WebElement webElement) throws InterruptedException {
        if (!webElement.isDisplayed()) {
            driver.wait(10);
        }
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
