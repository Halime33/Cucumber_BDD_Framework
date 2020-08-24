package runnerTest.webPages;

import org.openqa.selenium.By;
import sun.security.util.Password;
import utils.ConfigReader;

public class DarkSkyRegisterPage extends ElementUtil{

//      //a[contains(text(), 'Dark Sky API')] --> Drk Sky API
//      //a[@class='button']   --> login
//      id= email  -->email
//      id= password --> password
 //     //button[@type='submit']  --> LOGIN
 //     //div[@class='stand-alone']  --> erorMessage

  private  By DarkSkyAPIBtn = By.xpath("//a[contains(text(),'Dark Sky API')]");
  private  By loginBtn =By.xpath("//a[@class='button']");
  private  By emailField = By.id("email");
  private  By passwordField = By.id("password");
  private  By LOGIN = By.xpath("//button[@type='submit']");
  private  By errorMessage = By.xpath("//div[@class='stand-alone']");

    public void goToDarkSkyRegisterPage() throws InterruptedException {
        clickOn(DarkSkyAPIBtn);
        Thread.sleep(2000);
        clickOn(loginBtn);
    }
    public  void enterEmail(String email)  {

        sendValue(emailField, email);
    }
    public void enterPassword(String password) throws InterruptedException {

        Thread.sleep(2000);
        sendValue(passwordField, password);

    }
    public void clickLogin(){

        clickOn(LOGIN);
    }

    public String verifyErrorMessage() {

        return getTextFromElement(errorMessage);
    }


}
