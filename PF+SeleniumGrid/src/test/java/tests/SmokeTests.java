package tests;

import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {


    private static final long DEFAULT_WAITING_TIME = 60;



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
}
