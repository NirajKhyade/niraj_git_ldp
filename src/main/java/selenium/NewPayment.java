package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPayment {

    @FindBy(xpath = "//*[contains(text(),'                Payment options')]")private WebElement newPayment;
    @FindBy(xpath = "//input[@class='a-button-input'][1]")private WebElement addNew;
    @FindBy(xpath = "//input[@id='pp-lKBqqb-15']")private WebElement cardNum;
    @FindBy(xpath = "//button[@class=' a-button-close a-declarative']")private WebElement close;

    public NewPayment(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public WebElement clickOnNewPayment(){
        return newPayment;
    }
    public WebElement addNewCard(){
        return addNew;
    }
    public WebElement addCardNum(){return cardNum;}

    public WebElement close(){
        return close;
    }
}
