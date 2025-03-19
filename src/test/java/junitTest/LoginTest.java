package junitTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LoginPage;

import java.time.Duration;

public class LoginTest {

    @Test
    public void loginTest() {
        // inisialisasi webdariver
        WebDriver driver = WebDriverManager.chromiumdriver().create();

        // inisialisasi page object
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com");

        // action test
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();

        // test validasi
        homePage.validateBackPackDisplated();

    }
}
