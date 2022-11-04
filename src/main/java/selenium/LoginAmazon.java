package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAmazon {
    @FindBy(xpath = "//input[@name='email']") private WebElement Uname;
    @FindBy(xpath = "//input[@id='continue']") private WebElement Continue;
    @FindBy(xpath = "//input[@type='password']")private WebElement password;
    @FindBy(xpath ="//input[@id='signInSubmit']")private WebElement submit;
    public LoginAmazon(WebDriver driver){PageFactory.initElements(driver,this);}
    public WebElement enterUsername(){    return Uname;}
    public WebElement clickOnContinueButton(){return Continue;}

    public WebElement enterPassword(){ return password;}
    public WebElement clickOnSubmitButton(){return submit;}
}
