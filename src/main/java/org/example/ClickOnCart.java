package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnCart {

    @FindBy (xpath = "")private WebElement cartClicked;

    public ClickOnCart(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public WebElement clickOnCart(){
        return cartClicked;
    }
}
