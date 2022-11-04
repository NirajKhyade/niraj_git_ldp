package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodayDeal {

   @FindBy(xpath = "(//a[@tabindex='0'])[7]")private WebElement today;

    public TodayDeal(WebDriver driver){PageFactory.initElements(driver,this);}
    public WebElement clickToTodayS(){return today;}
}

