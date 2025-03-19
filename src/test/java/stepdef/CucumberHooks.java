import io.cucumber.java.After;
import io.cucumber.java.Before;
package stepdef;

public class CucumberHooks extends BaseTest{
    @Before
    public void beforeTest() {
         driver = WebDriverManager.chromiumdriver().create();
    }
    @After
    public void afterTest() {
        driver.close();
    }
}
