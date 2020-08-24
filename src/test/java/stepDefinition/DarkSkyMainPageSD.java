package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.DarkSkyMainPage;

public class DarkSkyMainPageSD {

    private DarkSkyMainPage darkSky = new DarkSkyMainPage();

    @Given("^I am on DarkSky Main Page$")
    public void setDarkSkyMainPage() throws InterruptedException {
        Assert.assertEquals(darkSky.getDarkSkyPageTitle(), "Dark Sky - Broadway, New York, NY");
    }

    @When("^I entered (.+) into search box and click search button$")
    public void verifyChosenLocation(String locationValue) throws InterruptedException {
        darkSky.chooseLocation(locationValue);
        Assert.assertEquals(darkSky.getDarkSkyPageTitle(), "Dark Sky - E Kamm Ave, California");
    }

    @Then("^I verify timeline is displayed with two hours incremented$")
    public void verifyTimeLine(){
        Assert.assertTrue("Hours not displayed correctly", darkSky.verifyHourFormat("America/Los_Angeles"));


    }
       @When("^I expand today$")
       public void expandToday() throws InterruptedException {
     //   darkSky.chooseLocation(locationValue);
       darkSky.expandToday();
       Thread.sleep(2000);
    }
       @And("^I get all tempList$")
       public void getAlltempList() throws InterruptedException {
           darkSky.getAlltempList(true);
    }

        @And("^I find maximum temperature$")
        public void findMaxTemp() throws InterruptedException {
            darkSky.maxTemp();
            }
        @And("^I find minimum temperature$")
        public void findMinTemp() throws InterruptedException {
            darkSky.minTemp();
    }
        @And("^I verify maximum temperature$")
        public void verifyMaxTemp() throws InterruptedException {
         //   Assert.assertEquals(darkSky.maxTemp(), darkSky.verifyMaxTemrature());
            darkSky.verifyMaxTemrature();
        }

        @Then("^I verify minimum temperature$")
        public void verifyMinTemp() throws InterruptedException {
         //   Assert.assertEquals(darkSky.minTemp(), darkSky.verifyMinTemprature());
              darkSky.verifyMinTemprature();

        }


        }
















