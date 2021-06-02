package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterPageSucessfully extends Utils{
    public void verifyRegisterMessage (){

        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")),"Your registration completed");
        // final result
        System.out.println("Your registration completed");
    }
}
