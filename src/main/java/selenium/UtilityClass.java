package selenium;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
      static   Properties p=new Properties();
      static WebDriver driver;

    public UtilityClass(WebDriver driver) {

    }

    public static String getData(String key) throws IOException {
        FileInputStream file=new FileInputStream("/home/nirk/Intelij IDE Project/Amazon/src/main/java/selenium/idpassadd.properties");
        p.load(file);
        String values=p.getProperty(key);
        return values;
    }




}
