package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.DarkSkyRegisterPage;

public class DarkSkyRegisterPageSD {

   private DarkSkyRegisterPage registerPage = new DarkSkyRegisterPage();

    @Given("^I am on the darkSky Register Page$")
    public void darkSkyRegister() throws InterruptedException {
    registerPage.goToDarkSkyRegisterPage();
    }

    @When("^I enter (.+) into (email|password) text fields on login page$")
    public void enterData (String value,String textField ) throws InterruptedException {

        switch(textField){
            case "email":
                registerPage.enterEmail(value);
            case "password":
                registerPage.enterPassword(value);
                break;
        }
    }
    @And("^I click on login button$")
    public void clicklogin(){
        registerPage.clickLogin();
    }

    @Then("^I verify error Username and password do not match$")
            public void verifyMessage(){
          //  registerPage.verifyErrorMessage();
            Assert.assertEquals(registerPage.verifyErrorMessage(), "Username and password do not match");
}
}

