package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver;
  public BasePage(){
      if(driver==null){
          Timestamp timestamp = new Timestamp(System.currentTimeMillis());
          System.setProperty("webdriver.chrome.driver","src/test/resources/BrowserDriver/chromedriver.exe");
          driver = new ChromeDriver();
          //this.openBrowser();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


          // get Url
          driver.get("https://demo.nopcommerce.com/");
      }
  }
}
