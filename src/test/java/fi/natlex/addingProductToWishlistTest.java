package fi.natlex;

import fi.natlex.pageobjects.MainPage;
import fi.natlex.pageobjects.RingPage;
import fi.natlex.pageobjects.WishlistPage;
import io.qameta.allure.Description;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.*;

public class addingProductToWishlistTest {

    @org.junit.Test
    @Description("Adding Honey Mini Signet to Wishlist")
    public void checkAddingToFavorite()  {

        MainPage mainPage = open("https://mejuri.com/world/en", MainPage.class);

        mainPage.cookieIsVisible();
        mainPage.clickCookieButton();
        mainPage.clickIconProfile();
        mainPage.fillEmail("shannache@mail.ru");
        mainPage.fillPassword("Testtest123");
        mainPage.clickContinueButton();
        mainPage.searchIconIsVisible();
        mainPage.clickSearchIcon();
        mainPage.clickSearchField();
        mainPage.fillSearch("Honey Mini Signet");
        mainPage.ringCardIsVisible();
        mainPage.clickRingCard();
        RingPage ringPage = page(RingPage.class);
        ringPage.iconFavoriteIsVisible();
        ringPage.clickIconFavorite();
        ringPage.iconWishlistIsVisible();
        ringPage.clickIconWishList();
        WishlistPage wishlistPage = page(WishlistPage.class);
        wishlistPage.ringCardIsVisible();

        String expeсtedText = "Honey Mini Signet";
        String actualText = wishlistPage.getText();
        Assert.assertEquals ("It's impossible to find the product", expeсtedText, actualText);

    }
}
