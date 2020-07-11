package com.FhcTrip.Pages;

import com.FhcTrip.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//a[@class=\"nav-link\"])[7]")
    public WebElement logInLink;

}
