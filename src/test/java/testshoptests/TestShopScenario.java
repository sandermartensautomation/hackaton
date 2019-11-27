package testshoptests;

import lib.BrowserFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Popup;

public class TestShopScenario {

    protected WebDriver driver;
    protected WebDriverWait myWaitVar;

    @Before
    public void setUp() {
        // Create a new instance of the Chrome driver
        driver = BrowserFactory.createBrowser(BrowserFactory.Browser.FIREFOX);
        myWaitVar = new WebDriverWait(driver,20);
        driver.manage().window().maximize();

        // Open the website
        driver.get("http://192.168.1.139:8080/#/");
    }

    @Test
    public void test(){
        Popup homepagePopup = new Popup(driver);
        homepagePopup.clickNext();
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
