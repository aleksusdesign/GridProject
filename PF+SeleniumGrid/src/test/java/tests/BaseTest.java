package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductComparePage;
import utils.CapabilityFactory;

public class BaseTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();// ThreadLocal позволяет нам хранить данные, которые будут доступны только конкретным потоком. Каждый поток будет иметь свой собственный экземпляр ThreadLocal
    private CapabilityFactory capabilityFactory = new CapabilityFactory();

    private static final String HTTPS_ALLO_UA = "https://allo.ua/";

    @BeforeMethod
    @Parameters(value = "browser")
    public void setUp(String browser) throws MalformedURLException {
        driver.set(new RemoteWebDriver(new URL("http://192.168.31.100:4444/wd/hub"), capabilityFactory.getCapabilities(browser)));
        getDriver().get(HTTPS_ALLO_UA);
    }

    @AfterMethod
    public void tearDown() {
        getDriver().close();
    }

    @AfterClass
    void terminate() {
        driver.remove();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public ProductComparePage getComparePage(){return new ProductComparePage(getDriver());}
    public CheckoutPage getCheckoutPage(){return new CheckoutPage(getDriver());}

}
