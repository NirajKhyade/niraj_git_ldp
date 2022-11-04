package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
@FindBy (xpath = "//div[@class='a-row a-spacing-small'])[3]/div/img")private WebElement thirdProduct;

@FindBy(xpath = "//span[@class=\"a-list-item\"]/div/div")private WebElement cart;

public AddToCart(WebDriver driver){
    PageFactory.initElements(driver,AddToCart.class);
}
public WebElement thirdProductGetsClick(){return thirdProduct;}
    public WebElement addToCart(){return cart;}
}
