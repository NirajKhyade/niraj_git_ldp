import org.example.Browser_factory;
import org.example.Mobile;
import org.example.Text;
import org.example.ThirdItem;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.Electronics;
import selenium.UtilityClass;

import java.io.IOException;

public class Without_login extends Browser_factory {


    WebDriver driver;
    @BeforeClass
    public void openBrowser() throws IOException {
        driver=openBrowser(UtilityClass.getData("browser"));
    }
    @Test(priority = 1)
    public void todayDeal(){
        Electronics electronics = new Electronics(driver);
        electronics.toDays().click();
        System.out.println("TodayS deal clicked");
    }
    @Test(priority =2)
    public void third() throws InterruptedException {
        ThirdItem thirdPro=new ThirdItem(driver);
        thirdPro.clickOnThirdItem().click();
        thirdPro.clickOnCartButton().click();
        String expectedText="Added to Cart";
        String str2=thirdPro.cartVerify().getText();
        Assert.assertEquals(str2,expectedText);
        }

    @Test(priority = 3)
    public void clickOnMobile() throws IOException {
        Mobile mb=new Mobile(driver);
        mb.searchTab().sendKeys(UtilityClass.getData("search"));
        mb.goButton().click();
        System.out.println("showing list of products");
    }
    @Test(priority = 4)
    public void lastMobile(){
        WebElement scrollDown=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[22]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollDown);
    }
    @Test(priority = 5)
    public void text() throws InterruptedException {
        Text tx=new Text(driver);
        tx.clickOnLast().click();
        String str=tx.getTextCopy().getText();
        System.out.println("Details of Product  :  "+str);
        Thread.sleep(5000);
       driver.quit();

    }



}
