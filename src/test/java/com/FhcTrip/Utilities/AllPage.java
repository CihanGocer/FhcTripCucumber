package com.FhcTrip.Utilities;

import com.FhcTrip.Pages.HomePage;
import com.FhcTrip.Pages.LoginPage;
import com.FhcTrip.Pages.UserPage;
import com.FhcTrip.StepDefinition.Login;

public class AllPage {

    protected HomePage homePage;
    protected LoginPage loginPage;
    protected UserPage userPage;


    public HomePage homePage(){
        if(homePage == null){
            homePage = new HomePage();
        }return homePage;
    }
    public LoginPage loginPage(){
        if(loginPage == null){
            loginPage = new LoginPage();
        }return loginPage;
    }
    public UserPage userPage(){
        if(userPage == null){
            userPage = new UserPage();
        }return userPage;
    }
}
