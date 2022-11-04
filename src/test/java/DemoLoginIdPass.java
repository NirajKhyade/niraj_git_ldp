import org.example.Browser_factory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.*;

import java.io.IOException;

public class DemoLoginIdPass extends Browser_factory {
    WebDriver driver;
    @BeforeClass
    public void openChrome() throws IOException {
        driver=openBrowser(UtilityClass.getData("browser"));
    }
    @Test(priority = 1)
    public void selectElectronics() {
        Electronics electronics = new Electronics(driver);
        electronics.clickElectronics().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");
        electronics.clickOnProduct();
        //String DeliveryDate=elec.getDate().getText();
        //System.out.println(DeliveryDate);
        electronics.goToOrder().click();
    }

    @Test(priority = 2)
    public void loginAmazon() throws IOException, IOException {
        LoginAmazon loginAmazon = new LoginAmazon(driver);
        loginAmazon.enterUsername().sendKeys(UtilityClass.getData("uname"));
        loginAmazon.clickOnContinueButton().click();
        loginAmazon.enterPassword().sendKeys(UtilityClass.getData("password"));
        loginAmazon.clickOnSubmitButton().click();

    }

    //add thread.sleep
    @Test(priority = 3)
    public void selectListBox() {
        DateOfOrder dt = new DateOfOrder(driver);
        dt.clickOnListBox().click();
        dt.clickOnYear().click();
        driver.navigate().back();
        dt.account().click();
    }
    @Test(priority = 4)
    public  void addNewPayment(){
        NewPayment nw=new NewPayment(driver);
        nw.clickOnNewPayment().click();
        //nw.addNewCard().click();
        nw.close();
        driver.navigate().back();
    }
    @Test(priority = 5)
    public void address() throws IOException, InterruptedException {
        YourAddress youraddress=new YourAddress(driver);
        youraddress.address().click();
        youraddress.clickOnPlus().click();
        youraddress.fullName().sendKeys(UtilityClass.getData("fullName"));
        youraddress.mobileNum().sendKeys(UtilityClass.getData("mobileNum"));
        youraddress.flat().sendKeys(UtilityClass.getData("flat"));
        youraddress.myArea().sendKeys(UtilityClass.getData("area"));
        youraddress.pinCode().sendKeys(UtilityClass.getData("pinCode"));
        Thread.sleep(1000);
        youraddress.submit().click();
        try {
            youraddress.submit().click();
        }
        catch (Exception e) {
            System.out.println("Clicked again on add address");
            youraddress.submit().click();
        }
        Thread.sleep(1000);
        String expected="Address saved";
        String str=youraddress.addVerify().getText();
        try {
            Assert.assertEquals(str,expected);
        }catch (AssertionError e){
            System.out.println(e.getMessage());
        }


        driver.quit();
        }

    }




