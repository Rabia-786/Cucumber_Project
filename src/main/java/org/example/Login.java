package org.example;

import org.openqa.selenium.By;

public class Login extends Utils{
    LoadProperty loadProperty = new LoadProperty();

    By loginButton = By.xpath("//a[@class='ico-login']");
    By emailButton = By.xpath("//input[@class='email valid']");
    By password = By.xpath("//input[@class='password valid']");
    By emailText = By.xpath("//input[@id='Email']");
    By passwordText = By.xpath("//input[@id='Password']");
    By getLoginButton = By.xpath("//button[@class='button-1 login-button']");
    public void  userGoToLoginPage(){
        clickOnElement(loginButton);
    }

    public void userTypesEmail(String email){
       enterText(emailText,email);

    }
     public void userTypesPassword(String password){
         enterText(passwordText,password);
     }
    public void  userClicksOnLogin(){
        clickOnElement(loginButton);

    }

}
