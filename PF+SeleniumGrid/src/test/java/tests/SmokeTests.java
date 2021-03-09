package tests;

import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {


    private static final long DEFAULT_WAITING_TIME = 60;
    private static final long EXPECTED_COUNT_OF_CART_ITEMS = 1;



    @Test
    public void checkMainComponentsOnHomePage() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().isHeaderVisible();
        getHomePage().isFooterVisible();
        getHomePage().isSearchFieldVisible();
        getHomePage().isCartIconVisible();
        getHomePage().isSignInButtonVisible();
        getHomePage().clickSignInButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getSignInPopup());
        assertTrue(getHomePage().isEmailFieldVisible());
        assertTrue(getHomePage().isPasswordFieldVisible());
        getHomePage().clickSignInPopupCloseButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickCartButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getShoppingCartPopup());
        assertTrue(getHomePage().isShoppingCartPopupVisible());
    }



    @Test
    public void checkAddToCart() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().scrollToListOfProducts();
        getHomePage().clickFirstBuyButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getCartPopup());
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertTrue(getHomePage().isCheckoutButtonVisible());
        assertEquals(getHomePage().getSizeOfListOfProductItemsInCart(),EXPECTED_COUNT_OF_CART_ITEMS);
        getHomePage().clickCheckputButton();
        assertTrue(getCheckoutPage().isCustomerFieldsFormVisible());
        assertTrue(getCheckoutPage().isCartFormVisible());
    }



}
