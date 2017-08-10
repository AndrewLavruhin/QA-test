package HomeWork;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkOne {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void homework() throws InterruptedException {
        driver.get("http://www.seleniumhq.org/");
        Thread.sleep(1000);
        WebElement input = driver.findElement(By.xpath("//li[@href='download']"));
        input.sendKeys("Download");
        input.submit();
        String actualTitle = driver.getTitle();
        Assert.assertTrue(String.format("Не вірний мессдж! Реалний месседж: '%s'", actualTitle), actualTitle.equals("Downloads"));

    }

    @After
    public void theEnd(){
        driver.close();
    }

}
