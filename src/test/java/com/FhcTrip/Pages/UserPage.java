package com.FhcTrip.Pages;

import com.FhcTrip.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
    public UserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//span[contains(text(),'ListOfUsers')]")
    public WebElement userListText;
}
