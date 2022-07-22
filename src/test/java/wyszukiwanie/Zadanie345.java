package wyszukiwanie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import taskcheckconfig.GenerateEmail;

import java.time.Duration;

public class Zadanie345 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/ ");
        WebElement signIn = driver.findElement(By.cssSelector("a.user_login.navigation-link"));
        signIn.click();
        WebElement email = driver.findElement(By.cssSelector("input.is_required.validate.account_input.form-control"));
//        email.sendKeys("test234565435@test.com");
        email.sendKeys(GenerateEmail.withTimestamp());
        WebElement createAnAccount = driver.findElement(By.id("SubmitCreate"));
        createAnAccount.click();

//        opóźnienie
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer_firstname']")));

        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        WebElement email2 = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
        firstName.sendKeys("Gniewomir");
        lastName.sendKeys("Staropolski");
//        email2.sendKeys("test234565435@test.com");    email wpisany automatycznie, ewentualnie wcześniej clear
        password.sendKeys("Boom123!@#");
        WebElement register = driver.findElement(By.xpath("//button[@id='submitAccount']"));
        register.click();

        WebElement personalInformation = driver.findElement(By.cssSelector("i.icon-user"));
        WebElement adresses = driver.findElement(By.cssSelector("i.icon-building"));

    }
}
