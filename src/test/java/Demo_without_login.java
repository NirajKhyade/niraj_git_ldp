import org.example.Browser_factory;
import org.example.Mobile;
import org.example.Text;
import org.example.ThirdItem;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.Electronics;
import selenium.UtilityClass;

import java.io.IOException;

public class Demo_without_login extends Browser_factory {

        WebDriver driver;

        @BeforeClass
        public void openChrome() throws IOException {
            driver=openBrowser(UtilityClass.getData("browser"));


        }
        @Test(priority = 1)
        public void TodayDeal(){
        Electronics electronics = new Electronics(driver);
            electronics.toDays().click();

    }
        @Test(priority =2)
        public void third() throws InterruptedException {
        ThirdItem thirdPro=new ThirdItem(driver);
            thirdPro.clickOnThirdItem().click();
            thirdPro.clickOnAddToCart().click();
            thirdPro.clickOnCartButton().click();
        //String Expected="Added to Cart";
        //String str=thirdpro.cartverify().getText();
        //Assert.assertEquals(str,Expected);
    }

        @Test(priority = 3)
        public void clickOnMobile(){
        Mobile mb=new Mobile(driver);
        mb.searchTab().sendKeys("mobile");
        mb.goButton().click();
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
            System.out.println("Details of mobile :  "+str);
            Thread.sleep(5000);
            driver.quit();
    }


    }