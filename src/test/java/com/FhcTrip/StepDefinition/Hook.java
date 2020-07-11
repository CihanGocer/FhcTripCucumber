package com.FhcTrip.StepDefinition;

import com.FhcTrip.Utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
 @Before
    public void setUp(){

 }
 @After
 public void tearDown(Scenario scenario){

     //Taking the screenshot
     final byte[] screenshot;
     screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
     //We are embedding the screenshot as an image in our framework
     //We SHOULD get screenshot after every FAILING Scenario
     //Attaching the image if scenario fails
     if (scenario.isFailed()) {
         scenario.embed(screenshot, "image/png");
     }
     Driver.closeDriver();
 }

}
