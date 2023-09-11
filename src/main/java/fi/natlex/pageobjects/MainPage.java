package fi.natlex.pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    //locator of icon Profile
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[2]/header/div[1]/div[2]/ul/li[2]/button")
    private SelenideElement iconProfile;

    //locator of Cookie button
    @FindBy(how = How.ID, using = "onetrust-accept-btn-handler")
    private SelenideElement cookieButton;

    //locator of field Email
    @FindBy(how = How.XPATH, using = "//*[@id=\"input-email\"]")
    private SelenideElement emailField;

    //locator of field Password
    @FindBy(how = How.XPATH, using = "//*[@id=\"input-password\"]")
    private SelenideElement passwordField;

    //locator of button Continue
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[5]/div[1]/div/div/div/div[1]/div[2]/form/div[3]/button")
    private SelenideElement continueButton;

    //locator of icon Search
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[2]/header/div[1]/div[2]/ul/li[1]/button")
    private SelenideElement searchIcon;

    //locator of field Search
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[3]/section/div/div[1]/div[1]/input")
    private SelenideElement fieldSearch;

    //locator of Ring card in Search
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[3]/section/div/div[2]/section/div[1]/a")
    private SelenideElement ringCard;


    @Step("Button Cookie is visible")
    public void cookieIsVisible() {
        cookieButton.shouldBe();
    }

    @Step("Click on icon Profile")
    public void clickIconProfile() {
        iconProfile.click();
    }

    @Step("Click on cookie button")
    public void clickCookieButton() {
        cookieButton.click();
    }

    @Step("Click on Continue button")
    public void clickContinueButton() {
        continueButton.click();
    }

    @Step("Filling out Email field")
    public void fillEmail(String username) {
        emailField.sendKeys(username);
    }

    @Step("Filling out Password field")
    public void fillPassword(String username) {
        passwordField.sendKeys(username);
    }

    @Step("Click on Search Icon")
    public void clickSearchIcon() {
        searchIcon.click();
    }

    @Step("Search icon is visible")
    public void searchIconIsVisible() {
        searchIcon.shouldBe();
    }


    @Step("Click on field Search")
    public void clickSearchField() {
        fieldSearch.click();
    }


    @Step("Filling out Search field")
    public void fillSearch(String username) {
        fieldSearch.sendKeys(username);
    }

    @Step("Product card is visible")
    public void ringCardIsVisible() {
        ringCard.shouldBe();
    }

    @Step("Click on product card")
    public void clickRingCard() {
        ringCard.click();
    }
}
