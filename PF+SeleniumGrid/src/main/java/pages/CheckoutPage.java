package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class = 'customer_fields_wrapper']")
    private WebElement customerFieldsForm;

    @FindBy(xpath = "//div[@id = 'mini_cart_container']")
    private WebElement cartForm;

    public boolean isCustomerFieldsFormVisible() {
        return customerFieldsForm.isDisplayed();
    }

    public boolean isCartFormVisible() {
        return cartForm.isDisplayed();
    }
}
