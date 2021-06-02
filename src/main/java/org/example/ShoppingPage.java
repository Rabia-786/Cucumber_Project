package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingPage extends Utils{
    By booksLink = By.xpath("//a[@href='/books']");
    By booksPageTitle = By.cssSelector(".page-title > h1");
    By firstPrizeBookLink  = By.xpath("//a[@href='/first-prize-pies']");
    By addToCartButton = By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");
    By shoppingCart = By.xpath("(//a[@href='/cart'])[1]");
    By termsAndCondition = By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");
    By checoutAsAGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By firstName= By.xpath("//button[@id='BillingNewAddress_FirstName']");

    By lastName= By.xpath("//button[@id='BillingNewAddress_LastName']");

    By email= By.xpath("//button[@id='BillingNewAddress_Email']");

    By company= By.xpath("//button[@id='BillingNewAddress_Company']");
    By country = By.xpath("//button[@id='BillingNewAddress_CountryId']");


    By province = By.xpath("//button[@id='BillingNewAddress_StateProvinceId']");

    By city= By.xpath("//button[@id='BillingNewAddress_City']");

    By address1 = By.xpath("//button[@id='BillingNewAddress_Address1']");

    By address2 = By.xpath("//button[@id='BillingNewAddress_Address2']");

    By zipPostalCode= By.xpath("//button[@id='BillingNewAddress_ZipPostalCode']");

    By phoneNumber = By.xpath("//button[@id='BillingNewAddress_PhoneNumber']");

    By faxNumber= By.xpath("//button[@id='BillingNewAddress_FaxNumber']");
    By continueAddressButton = By.xpath("(//button[@name='save'])[1]");
    By shippingMethod = By.xpath("//input[@id='shippingoption_0']");
    By continueShippingMethod = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardPayment = By.xpath("//input[@id='paymentmethod_1']");
    By creditCardContinue = By.xpath("(//button[@class='button-1 payment-method-next-step-button'])[1]");
    By optionOfCreditCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expirationDate = By.xpath("//select[@id='ExpireMonth']");
    By expirationYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueCardDetails = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By confirmTheItem = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");

    public void userClicksOnBooks(){
        clickOnElement(booksLink );
    }

    public String getBooksPageTitle(){
        return findElement(booksPageTitle).getText();
    }
    public void userSelectsFirstPrizeBook(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement buttons =getElements(addToCartButton).get(1);
       buttons.click();

    }
}
