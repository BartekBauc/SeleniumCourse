package testobjectpattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import pageFactoryObjects.HomeFactoryPage;
//import pageObjects.*;

import static taskcheckconfig.GenerateEmail.withTimestamp;

public class RegistrationTest {

//    private WebDriver driver;
//    private String email;
//
//    private static final String EXPECTED_TEXT = "MY PERSONAL INFORMATION";
//
//    @BeforeEach
//    void setUp() {
//        System.setProperty("webdriver.chrome.driver",
//                "src/main/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://hotel-testlab.coderslab.pl/en/");
//    }
//
//
//    @Test
//    void registrationTest() {
//        HomePage homePage = new HomePage(driver);
//        AuthenticationPage authenticationPage = homePage.clickSignInButton();
//        email = withTimestamp();
//        CreateAccountPage createAccountPage = authenticationPage.createAccount(email);
//        AccountPage accountPage = createAccountPage.registerUser("Adam", "Słodowy", "password1");
//        accountPage.verifyPersonalInfoLink(EXPECTED_TEXT);
//    }
//
//    //    @Test
////    void registrationTestFactoryVersion(){
////        HomeFactoryPage homePage = new HomeFactoryPage(driver);
////        AuthenticationPage authenticationPage = homePage.clickSignInButton();
////        CreateAccountPage createAccountPage = authenticationPage.createAccount(withTimestamp());
////        AccountPage accountPage = createAccountPage.registerUser("Adam", "Słodowy", "password1");
////        accountPage.verifyPersonalInfoLink(EXPECTED_TEXT);
////    }
//    @Test
//    void searchHotel() {
//        HomePage homePage = new HomePage(driver);
//        email = withTimestamp();
//        AuthenticationPage authenticationPage = homePage.clickSignInButton();
//        HomePage homePage2 = authenticationPage.signIn(email, "password1");
//    }
//
////    @Test
////    void searchForHotel(){
////        HomeFactoryPage homePage = new HomeFactoryPage(driver);
////        AuthenticationPage authenticationPage = homePage.clickSignInButton();
////        CreateAccountPage createAccountPage = authenticationPage.createAccount(withTimestamp());
////        createAccountPage.registerUser("Adam", "Słodowy", PASSWORD);
////        homePage.openPage();
////        SearchResultsPage searchResultsPage = homePage.searchForHotel();
////        List<WebElement> list = searchResultsPage.getSearchResultList();
////        Assertions.assertThat(list).isNotEmpty();
////    }
//
//    @AfterEach
//    void tearDown() {
//        driver.close();
//    }
}





