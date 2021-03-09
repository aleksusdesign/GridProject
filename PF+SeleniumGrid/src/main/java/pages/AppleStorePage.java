package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleStorePage extends BasePage {

    @FindBy(xpath = "//ul[@id='menu']//a[@href='#iphone-section']")
    private WebElement iphoneSection;

    @FindBy(xpath = "//div[@id='iphone-section']//a[@class='button-more-detalis']")
    private WebElement iphoneDetailsButton;

    public AppleStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnIphoneSection(){
        iphoneSection.click();
    }

    public void clickOnIphoneDetailsButton(){
        iphoneDetailsButton.click();
    }


}
