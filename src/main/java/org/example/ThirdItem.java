package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdItem {
    @FindBy (xpath = "//img[@alt='Redmi A1 | starting from 5319']")private WebElement thirdProduct;
    @FindBy (xpath = "//input[@id='add-to-cart-button']")private WebElement addToCart;

    @FindBy(xpath = "(//input[@class='a-button-input'])[20]")private WebElement clickOnCartButton;

    @FindBy(xpath = "//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")private WebElement verifyCart;

    @FindBy(xpath = "//img[@alt='Redmi A1 | starting from 5319']") private WebElement thirdProductDetails;

    public ThirdItem(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement clickOnThirdItem(){
        return thirdProduct;
    }
    public WebElement clickOnAddToCart(){return addToCart;  }

    public WebElement clickOnCartButton(){
        return clickOnCartButton;
    }

    public WebElement cartVerify(){return verifyCart;  }
    public WebElement thirdProductDetails(){
        return  thirdProductDetails;
    }



}
