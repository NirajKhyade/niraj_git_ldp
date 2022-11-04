package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateOfOrder {
    @FindBy(xpath  ="//span[@id='a-autoid-1-announce']")private WebElement pastOrders;
    @FindBy(xpath  ="//div[@class='a-popover-inner']")private WebElement lastYear;

    @FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement yourAccount;

    public DateOfOrder(WebDriver driver){ PageFactory.initElements(driver,this);}
    public WebElement clickOnListBox(){return pastOrders;}
    public WebElement clickOnYear(){return lastYear;}

    public WebElement account(){return yourAccount;}
}

