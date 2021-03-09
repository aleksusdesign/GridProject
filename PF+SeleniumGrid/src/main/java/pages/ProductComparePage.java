package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparePage extends BasePage{

    @FindBy(xpath = "//td[@class='compare-header']//p")
    private WebElement compareTitle;

    public ProductComparePage(WebDriver driver) {
        super(driver);
    }

    public String getTextCompareTitle(){
        return compareTitle.getText();
    }

    public WebElement getCompareTitle(){
        return compareTitle;
    }
}
