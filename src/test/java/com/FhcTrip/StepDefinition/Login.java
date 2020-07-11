package com.FhcTrip.StepDefinition;

import com.FhcTrip.Utilities.AllPage;
import com.FhcTrip.Utilities.ConfigReader;
import com.FhcTrip.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login {
    AllPage allPage = new AllPage();

    @Given("User is on Home Page")
    public void user_is_on_Home_Page() {
        Driver.getDriver().get(ConfigReader.getProperty("Base_url"));
    }

    @Given("Click on Log in link")
    public void click_on_Log_in_link() {
        allPage.homePage().logInLink.click();
    }

    @Given("Click on user name text box and type it {string}")
    public void click_on_user_name_text_box_and_type_it(String userName) {
        allPage.loginPage().userName.sendKeys(userName);
    }

    @Given("Click on password name text box and type it {string}")
    public void click_on_password_name_text_box_and_type_it(String password) {
        allPage.loginPage().password.sendKeys(password);
    }

    @Given("Click login button")
    public void click_login_button() {
        allPage.loginPage().btnSubmit.click();
    }

    @Then("Verify LISTOFUSERS text is located")
    public void verify_LISTOFUSERS_text_is_located() {
        Assert.assertEquals(allPage.userPage().userListText.getText(), "LISTOFUSERS");
    }
}
