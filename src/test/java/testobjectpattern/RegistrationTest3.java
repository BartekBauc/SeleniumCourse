package testobjectpattern;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class RegistrationTest3 {


    @BeforeAll
    static void beforeAll() {
        System.out.println("Przed wszystkimi");
    }


    @BeforeEach
    void setUp() {
        System.out.println("Przed każdym testem");
    }

    @Test
    @Order(0)
    void MyPageObjectTest() {
        System.out.println("Pierwszy");
    }

    @Test
    @Order(1)
    void secondTest() {
        System.out.println("Drugi");
    }

    @Test
    @Order(2)
    void thirdTest() {
        System.out.println("Trzeci");
    }

    @AfterEach
    void tearDown() {
        System.out.println("po każdym teście");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Po wszystkich");

    }

}
