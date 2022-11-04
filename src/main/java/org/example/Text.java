package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Text {


    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[22]")private WebElement textCopy;



    public Text(WebDriver driver){
        PageFactory.initElements(driver,this);
       }
    public WebElement clickOnLast(){
        return textCopy;
    }
    public  WebElement getTextCopy(){
        return  textCopy;
    }


}
