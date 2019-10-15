package BaseClasses.uii.uiTestBase;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class UiTestBase {

    @BeforeTest(alwaysRun = true)
    public void setup() {
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = "https://potolkoff58.ru";
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

    @AfterTest
    public void tearDown() {
        if(WebDriverRunner.getWebDriver()!= null) {
            WebDriverRunner.getWebDriver().quit();
        }
    }
}
