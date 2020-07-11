package com.FhcTrip.Pages;

import com.FhcTrip.StepDefinition.Login;
import com.FhcTrip.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "UserName")
    public WebElement userName;
    @FindBy (id = "Password")
    public WebElement password;
    @FindBy (id = "btnSubmit")
    public WebElement btnSubmit;
}
