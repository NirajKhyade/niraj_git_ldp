package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics {

    @FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_electronics']") private WebElement Electronics;
    @FindBy(xpath = "//span[contains(text(),'boAt Airdopes 141 True Wireless Earbuds with…')]") private WebElement Product;
    @FindBy(xpath = "//span[@class='a-text-bold'][1]") private WebElement Date;
    @FindBy(xpath = "//a[@id='nav-orders']") private WebElement returnYourOrder;

    @FindBy(xpath = "//a[contains(text(),'Today')]")private WebElement TodaySDeal;
    public Electronics(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    public WebElement clickElectronics() {return Electronics;}
    public WebElement clickOnProduct() {return Product;}

    public WebElement getDate() {return Date;}

    public WebElement pastOrder(WebDriver driver) {PageFactory.initElements(driver, this);return null;}

    public WebElement goToOrder(){return returnYourOrder;}
    public WebElement toDays(){return TodaySDeal;}
}
