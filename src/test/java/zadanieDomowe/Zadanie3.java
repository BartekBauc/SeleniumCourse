package zadanieDomowe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Karol");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Kowalski");
        WebElement gender = driver.findElement(By.name("gender"));
        gender.click();
        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        dateOfBirth.sendKeys("05/22/2010");
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("Prosta 51");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("karol.kowalski@mailinator.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Pass123");
        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Coders Lab");
        WebElement comment = driver.findElement(By.id("comment"));
        comment.sendKeys("To jest mój pierwszy automat testowy");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        driver.quit();

    }
}
