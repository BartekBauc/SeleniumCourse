package konfiguracja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Selnium");
        element.submit();
        driver.quit();

    }
}
