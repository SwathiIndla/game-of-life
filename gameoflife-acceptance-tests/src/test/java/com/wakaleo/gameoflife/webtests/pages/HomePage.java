package com.wakaleo.gameoflife.webtests.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://40.124.138.2:9090/gameoflife/home")
public class HomePage extends GameOfLifePage {

    @FindBy(linkText = "New Game")
    WebElement newGameLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNewGameLink() {
        newGameLink.click();
    }
}
