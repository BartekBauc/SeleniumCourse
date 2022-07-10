package funkcje;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadanie1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/login?back=my-account");
        WebElement email = driver.findElement(By.cssSelector("input.is_required.validate.account_input.form-control"));
        email.sendKeys("test234565434@test.com");
        WebElement createAnAccount = driver.findElement(By.id("SubmitCreate"));
        createAnAccount.click();

        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer_firstname']")));

        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        if(firstName.isDisplayed()) {
            firstName.sendKeys("Blablabla");
            firstName.submit();
        }else {
            Assert.fail();
        }
        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        WebElement email2 = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));

        }

    }

