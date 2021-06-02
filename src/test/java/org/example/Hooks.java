package org.example;

import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import sun.misc.resources.Messages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks extends Utils{
    String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    BrowserSelector browserSelector = new BrowserSelector();
    @Before
    public void openBrowser(){
        browserSelector.openBrowser();
        driver.get("https://demo.nopcommerce.com");
    }
    @After
    public void closeBrowser(Scenario scenario){
        String screenshotName = scenario.getName().replaceAll(".';:?!","")+timestamp+".png";
        if(scenario.isFailed()){
            File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File destinationPath = new File(System.getProperty("user.dir")+"/target/Destination/screenshot/"+screenshotName);
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            scenario.write(("!!!!!!!!.....Scenario Failed.....!!!!!!!!"));
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
        }
        driver.quit();
}}
