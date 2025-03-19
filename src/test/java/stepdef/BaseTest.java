package stepdef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class BaseTest {

    protected static WebDriver driver;

    protected void getDriver() {
//        ChromeOptions options = new ChromeOptions();
//        options addArguments("--headless");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);
 //       driver = WebDriverManager.chromedriver().create();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

}
