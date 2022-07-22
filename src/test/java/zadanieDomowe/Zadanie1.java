package zadanieDomowe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zadanie1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a"));
        signIn.click();

        WebElement noAccount = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        noAccount.click();

        driver.navigate().back();
        driver.navigate().back();
        driver.quit();

    }
}
