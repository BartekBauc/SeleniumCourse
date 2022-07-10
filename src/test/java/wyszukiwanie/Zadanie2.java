package wyszukiwanie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/ ");
        WebElement hotelLocation = driver.findElement(By.name("hotel_location"));
        WebElement searchRoomSubmit = driver.findElement(By.name("search_room_submit"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement submitNewsletter = driver.findElement(By.name("submitNewsletter"));
        hotelLocation.sendKeys("Warsaw");
        email.sendKeys("test@test.com");
        searchRoomSubmit.submit();

    }
}
