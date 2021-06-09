package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    LoadProperty loadProperty = new LoadProperty();
    String browserName = loadProperty.getProperty("browser");


    public static final String AUTOMATE_USERNAME = "rabia_wnUsBH";
    public static final String AUTOMATE_ACCESS_KEY = "e2YY8px4d98xMcwfvMf4";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static final boolean browserStack = false;
    DesiredCapabilities caps = new DesiredCapabilities();

    public void openBrowser() {
        if (browserStack) {
            if (browserName.equalsIgnoreCase("chrome")) {
                System.out.println("chrome remote");
                caps.setCapability("os", "windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "chrome");
                // caps.setCapability("resolution", "14.0");
                caps.setCapability("browser_version", "latest"); // test name
                caps.setCapability("browserstack.local", "false"); // CI/CD job
                caps.setCapability("browserstack.selenium_version", "3.5.2");
            } else if (browserName.equalsIgnoreCase("edge")) {
                caps.setCapability("os", "windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "edge");
                // caps.setCapability("resolution", "14.0");
                caps.setCapability("browser_version", "latest"); // test name
                caps.setCapability("browserstack.local", "false"); // CI/CD job
                caps.setCapability("browserstack.selenium_version", "3.5.2");
            } else if (browserName.equalsIgnoreCase("safari")) {

                caps.setCapability("os", "OS X");
                caps.setCapability("os_version", "Big Sur");
                caps.setCapability("browser", "Safari");
                // caps.setCapability("resolution", "14.0");
                caps.setCapability("browser_version", "14.0"); // test name
                caps.setCapability("browserstack.local", "false"); // CI/CD job
                caps.setCapability("browserstack.selenium_version", "3.14.0");
            } else if (browserName.equalsIgnoreCase("Firefox")){
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.10.0");

            }
            try {
                driver = new RemoteWebDriver(new URL(URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        //open locally
       else{
            if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDriver/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "src/test/resources/BrowserDriver/msedgedriver.exe");
                driver = new EdgeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/BrowserDriver/geckodriver.exe");
               driver = new FirefoxDriver();


            } else {
                System.out.println("Incorrect browser name ....." + browserName);
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }

}