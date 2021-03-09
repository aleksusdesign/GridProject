package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class IphonePage extends BasePage {

    @FindBy(xpath = "//input[@id='pricerange-from']")
    private WebElement priceFromInput;

    @FindBy(xpath = "//input[@id='pricerange-to']")
    private WebElement priceToInput;

    @FindBy(xpath = "//button[@class='filter-popup__button']")
    private WebElement showFilterListButton;


    @FindBy(xpath = "//div[contains(@class,'cur--discount')]//span[@class='sum']")
    private List<WebElement> pricesList;
    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void insertPriceFromInput(int value){
        priceFromInput.clear();
        priceFromInput.sendKeys(Integer.toString(value));
    }

    public void insertPriceToInput(int value){
        priceToInput.clear();
        priceToInput.sendKeys(Integer.toString(value));
    }

    public List<Integer> getPricesList() {
        List<Integer> list = new ArrayList<>();
        for(WebElement webElement : pricesList)
        {
            list.add(Integer.parseInt(webElement.getText().replaceAll("\\s", "")));
        }

        return list;
    }

    public WebElement getShowFilterListButton() {
        return showFilterListButton;
    }

    public void clickOnShowFilterListButton() {
        showFilterListButton.click();
    }



}
