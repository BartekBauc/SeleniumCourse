package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AccountPage;
import pageObjects.AuthenticationPage;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;

import static taskcheckconfig.GenerateEmail.withTimestamp;

public class NewAccountCreatingSteps {

    private WebDriver driver;
    private static final String EXPECTED_TEXT = "MY PERSONAL INFORMATION";
    private static final String PASSWORD = "password1";
    private static final String RESULT = "Your account has been created.";
    private String email;

    @Given("an open browser with https://hotel-testlab.coderslab.pl/en/")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        email = withTimestamp();
    }
    @When("find and click \"sign in\", fill in the registration form")
    public void registration() {
        HomePage homePage = new HomePage(driver);
        AuthenticationPage authenticationPage = homePage.clickSignInButton();
        CreateAccountPage createAccountPage = authenticationPage.createAccount(email);
        AccountPage accountPage = createAccountPage.registerUser("Adam", "Słodowy", PASSWORD);
    }
    @Then("new page should contain: Your account has been created.")
    public void confirmation() {
        WebElement alert = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]"));
        String actualText = alert.getText();
        Assertions.assertThat(actualText).isEqualTo(RESULT);
    }
}
