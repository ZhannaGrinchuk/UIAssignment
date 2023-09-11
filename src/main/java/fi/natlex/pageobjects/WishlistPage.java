package fi.natlex.pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WishlistPage {


    //locator Ring card
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div[2]/div/div/div/div/div/div/div/div[2]/div/a/span/span")
    private SelenideElement ringCard;

    @Step("Product card is visible")
    public void ringCardIsVisible() {
        ringCard.shouldBe();
    }


    @Step("Getting text from the card")
    public String getText() {
        return ringCard.getText();
    }

}
