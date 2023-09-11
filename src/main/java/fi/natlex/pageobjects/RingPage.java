package fi.natlex.pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class RingPage {

    //locator of icon Favorite
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div[1]/div[2]/div/div[4]/div/div/button[2]")
    private SelenideElement iconFavorite;

    //locator of icon My Wishlist
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[2]/header/div[1]/div[2]/ul/li[3]/a")
    private SelenideElement iconWishlist;


    @Step("Click on icon Favorite")
    public void clickIconFavorite() {
        iconFavorite.click();
    }

    @Step("Click on icon Wishlist")
    public void clickIconWishList() {
        iconWishlist.click();
    }

    @Step("Icon Favorite is visible")
    public void iconFavoriteIsVisible() {
        iconFavorite.shouldBe();
    }

    @Step("Icon Wishlist is visible")
    public void iconWishlistIsVisible() {
        iconWishlist.shouldBe();
    }

    @Step("Open page My Wishlist")
    public boolean isCardAddedToWishList(){
        urlContaining("https://mejuri.com/world/en/account/my-wishlist");
        return true;
    }

}
