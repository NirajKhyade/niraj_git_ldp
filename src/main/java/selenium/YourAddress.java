package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAddress {

    @FindBy(xpath = "//*[contains(text(),'Edit addresses for orders and gifts')]")private WebElement yourAddress;
    @FindBy(xpath = "//div[@id='ya-myab-plus-address-icon']")private WebElement clickOnPlusIcon;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")private WebElement fullName;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")private WebElement mobileNum;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")private WebElement flatNum;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine2']")private WebElement area;
    @FindBy(xpath = "//span[@id='address-ui-widgets-form-submit-button']")private WebElement submit;

    @FindBy (xpath = "//h4[@class='a-alert-heading']") private WebElement verifyAddress;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']") private WebElement pinCode;


    public YourAddress(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement address(){
        return yourAddress;
    }
    public WebElement fullName(){
        return fullName;
    }
    public WebElement mobileNum(){
        return mobileNum;
    }
    public WebElement flat(){
        return flatNum;
    }
    public WebElement clickOnPlus(){
        return clickOnPlusIcon;
}
    public WebElement myArea(){
        return area;
}
    public WebElement submit(){return submit;}
    public WebElement addVerify(){
        return verifyAddress;
    }
    public WebElement pinCode(){
        return pinCode;
    }
}
