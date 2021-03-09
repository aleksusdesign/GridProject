package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    private static final long DEFAULT_WAITING_TIME = 60;

    @FindBy(xpath = "//div[@class='main-header-wrapper']")
    private WebElement header;

    @FindBy(xpath = "//div[@class='footer']")
    private WebElement footer;

    @FindBy(xpath = "//div[@class='shopping-cart shopping-cart--empty']")
    private WebElement cartIcon;

    @FindBy(xpath = "//div[@class='language']//div[@class='switcher-toggle']")
    private WebElement languageButton;

    @FindBy(xpath = "//button[@class = 'authentication__button--login']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@class='v-modal__cmp v-modal__cmp--is-center v-modal__cmp--md login-and-register-modal']")
    private WebElement signInPopup;

    @FindBy(xpath = "//input[@name='email'][@id='auth']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@class='v-modal__close-btn']")
    private WebElement signInPopupCloseButton;

    @FindBy(xpath = "//input[@id='search-form__input']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@id='global-search__submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[contains(@class,'wishlist-button')]//div[contains(@class,'items-count')]")
    private WebElement wishListProductsCount;

    @FindBy(xpath = "//div[@class='v-modal__cmp v-modal__cmp--is-center v-modal__cmp--md cart-popup checkout_modal']")
    private WebElement shoppingCartPopup;

    @FindBy(xpath = "//div[@class='compare']")
    private List<WebElement> listCompareButton;

    @FindBy(xpath = "//div[@class='v-price-box__cur']")
    private WebElement productsList;

    @FindBy(xpath = "//div[contains(@class, 'checkout_modal')]")
    private WebElement cartPopup;

    @FindBy(xpath = "//button[@class='order-now']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//a[@title='Apple'][@class='item__link']")
    private WebElement appleStoreButton;


    @FindBy(xpath = "//p[@class='header-catalog-button__text']")
    private WebElement catalogButton;

    @FindBy(xpath = "//button[contains(@class,'buy-button')]")
    private List<WebElement> listOfBuyButtons;

    @FindBy(xpath = "//div[@class = 'product__item']")
    private List<WebElement> listOfProductItemsInCart;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAppleStoreButton() {
        appleStoreButton.click();
    }

    public void isHeaderVisible() {
        header.isDisplayed();
    }

    public boolean isShoppingCartPopupVisible() {
        return shoppingCartPopup.isDisplayed();
    }

    public void isFooterVisible() {
        footer.isDisplayed();
    }

    public void isCartIconVisible() {
        cartIcon.isDisplayed();
    }

    public void isSignInButtonVisible() {
         signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }


    public boolean isEmailFieldVisible() {
        return emailField.isDisplayed();
    }

    public boolean isPasswordFieldVisible() {
        return passwordField.isDisplayed();
    }

    public WebElement getSignInPopup() {
        return signInPopup;
    }

    public WebElement getShoppingCartPopup() {
        return shoppingCartPopup;
    }

    public void clickSignInPopupCloseButton() {
        signInPopupCloseButton.click();
    }

    public void isSearchFieldVisible() {
       searchField.isDisplayed();
    }

    public void clickCartButton() {
        cartIcon.click();
    }

    public void generateCompareTwoItemsButton(){
        listCompareButton.get(1).click();
        waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        implicitWait(30);
        listCompareButton.get(2).click();
        waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        implicitWait(30);
        listCompareButton.get(1).click();
    }

    public void scrollToListOfProducts(){
        scrollIntoViewElement(productsList);
    }

    public void clickFirstBuyButton(){
        listOfBuyButtons.get(0).click();
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    public WebElement getCartPopup(){
        return cartPopup;
    }

    public int getSizeOfListOfProductItemsInCart(){
        return listOfProductItemsInCart.size();
    }

    public boolean isCheckoutButtonVisible(){
        return checkoutButton.isDisplayed();
    }


    public void clickOnCatalogButton() {
        catalogButton.click();
    }

}
