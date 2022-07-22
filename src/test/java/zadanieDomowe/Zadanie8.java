package zadanieDomowe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Zadanie8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl//index.php");

//Pierwszy produkt

        WebElement accessories = driver.findElement(By.id("category-6"));
        accessories.click();
//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.elementToBeClickable(By.id("facet_input_2426_1")));
        WebElement inStock1 = driver.findElement(By.xpath("//input[@data-search-url='https://mystore-testlab.coderslab.pl/index.php?id_category=6&controller=category&q=Availability-In+stock']"));
        inStock1.click();
        WebElement firstproduct = driver.findElement(By.xpath("//*[@id='js-product-list']//img"));
        firstproduct.click();
        WebElement add1 = driver.findElement(By.xpath("//button[@data-button-action='add-to-cart']"));
        add1.click();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='close']")));
        WebElement continue1 = driver.findElement(By.xpath("//button[@class='close']"));
        continue1.click();

// Drugi produkt

        WebElement art = driver.findElement(By.id("category-9"));
        art.click();
        WebElement inStock2 = driver.findElement(By.xpath("//input[@data-search-url='https://mystore-testlab.coderslab.pl/index.php?id_category=9&controller=category&q=Availability-In+stock']"));
        inStock2.click();
        WebElement secondproduct = driver.findElement(By.xpath("//*[@id='js-product-list']//img"));
        secondproduct.click();
        WebElement add2 = driver.findElement(By.xpath("//button[@data-button-action='add-to-cart']"));
        add2.click();
        WebElement secondResult = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='close']")));
        WebElement continue2 = driver.findElement(By.xpath("//button[@class='close']"));
        continue2.click();

//cart

        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=cart&action=show");
        WebElement proceed = driver.findElement(By.xpath("//a[@href='https://mystore-testlab.coderslab.pl/index.php?controller=order']"));
        proceed.click();

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

//        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//        int[] passwordArray = new int[1];
//        Random rand2 = new Random();
//        for (int i = 0; i < passwordArray.length; i++) {
//            int randomNumber = rand2.nextInt(999999999);    /// zakres 0-9
//            passwordArray[i] = randomNumber;
//            password.sendKeys("PswD" + randomNumber);
//        }

        WebElement continue3 = driver.findElement(By.name("continue"));
        continue3.click();

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("Dworcowa 35");

        WebElement postcode = driver.findElement(By.name("postcode"));
        postcode.sendKeys("01-580");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Dobre Miasto");

        WebElement country = driver.findElement(By.name("id_country"));
        country.click();
        WebElement country2 = driver.findElement(By.xpath("//option[@value='17']"));
        country2.click();

        WebElement continue4 = driver.findElement(By.name("confirm-addresses"));
        continue4.click();

        WebElement continue5 = driver.findElement(By.name("confirmDeliveryOption"));
        continue5.click();

        WebElement conditions = driver.findElement(By.name("conditions_to_approve[terms-and-conditions]"));
        conditions.click();

        WebElement payment = driver.findElement(By.id("payment-option-1"));
        payment.click();



//        WebElement thirdResult = new WebDriverWait(driver, Duration.ofSeconds(2))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id="payment-confirmation"]/div[1]/button")));

        WebElement order = driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
        order.click();

    }
}
