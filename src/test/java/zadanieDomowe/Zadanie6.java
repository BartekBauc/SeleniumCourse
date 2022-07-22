package zadanieDomowe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Zadanie6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement signIn = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
        signIn.click();
        WebElement noAccount = driver.findElement(By.xpath("//a[@data-link-action='display-register-form']"));
        noAccount.click();

        WebElement socialTitle = driver.findElement(By.xpath("//input[@name='id_gender' and @value='1']"));
        socialTitle.click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        String[] firstnameArray = {"Bartek", "Marek", "Tomek", "Marcin", "Grzesiek", "Michal", "Wojtek", "Patryk", "Romek", "Mateusz"};
        int firstnameLenght = firstnameArray.length;
        int random1 = (int) (Math.random() * firstnameLenght);
        String firstname = firstnameArray[random1];
        firstName.sendKeys(firstname);

        WebElement lastName = driver.findElement(By.name("lastname"));
        String[] lastnameArray = {"Kowalski", "Nowak", "Malinowski", "Bocian", "Pies", "Kot", "Ul", "Zielony", "Czerwony", "Czarny"};
        int lastnameLenght = lastnameArray.length;
        int random2 = (int) (Math.random() * lastnameLenght);
        String lastname = lastnameArray[random2];
        lastName.sendKeys(lastname);


        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        int[] emailArray = new int[1];
        Random rand = new Random();
        for (int i = 0; i < emailArray.length; i++) {
            int randomNumber = rand.nextInt(999999999);    /// zakres 0-9
            emailArray[i] = randomNumber;
            email.sendKeys(firstname + lastname + randomNumber + "@gmail.com");
        }

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        int[] passwordArray = new int[1];
        Random rand2 = new Random();
        for (int i = 0; i < passwordArray.length; i++) {
            int randomNumber = rand2.nextInt(999999999);    /// zakres 0-9
            passwordArray[i] = randomNumber;
            password.sendKeys("PswD" + randomNumber);
        }

        WebElement save = driver.findElement(By.xpath("//button[@data-link-action='save-customer']"));
        save.click();

    }
}
