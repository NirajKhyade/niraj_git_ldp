package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobile {

    @FindBy (xpath = "//input[@id='twotabsearchtextbox']") private WebElement searchTab;
    @FindBy (xpath = "(//input[@type='submit'])[1]") private WebElement click;

    public Mobile(WebDriver driver) {PageFactory.initElements(driver,this);}

    public WebElement searchTab(){return searchTab;}

    public WebElement goButton(){return click;}
}
