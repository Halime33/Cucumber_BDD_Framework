package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DarkSkyMainPage<ListTemp> extends ElementUtil {

    private By location = By.xpath("//form[@id='searchForm']//input[@type='text']");
    private By searchBtn = By.xpath("//a[@class='searchButton']");
    private By Today = By.xpath("//span[contains(text(),'Today')]");
    private By minTemp = By.xpath("(//span[@class='tempRange'])[1]//span[@class='minTemp']");
    private By maxTemp = By.xpath("(//span[@class='tempRange'])[1]//span[@class='maxTemp']");
    private By alltemp = By.xpath("//div[@class='timeline-container-scroll']//span[contains(@style,'opacity')]");  //***
    private By Times = By.xpath("//div[@class='scroll-container']//span[@class='hour']");
    private By maxTop = By.xpath("//span[@class='high-temp-text']");
    private By minTop = By.xpath("//span[@class='low-temp-text']");


    public String getDarkSkyPageTitle() throws InterruptedException {
        Thread.sleep(1000);
        return BasePage.get().getTitle();
    }

    public void chooseLocation(String locationValue) throws InterruptedException {
        clear(location);
        sendValue(location, locationValue);
        Thread.sleep(2000);
        clickOn(searchBtn);
        Thread.sleep(2000);
    }

  ///////////////////////////////////////////////////////
    public List<Integer> getTimeline(){
        List<WebElement>hour= webElements(Times);
        List<Integer>time=new ArrayList<Integer>();
        for(WebElement e:hour){
            String t= e.getText();
            if(!t.isEmpty()){
                int timehours=Integer.parseInt(t.replaceAll("[a-z]", ""));
                time.add(timehours);
             //   System.out.print(" " + timehours + " ");
            }
        }
        return time;
    }

    public boolean verifyHourFormat(String zoneId){
        ZoneId timezone = ZoneId.of(zoneId);
        int hour  = LocalTime.now(timezone).getHour();
        List<Integer> ls=new ArrayList<>();
        for(int i=0; i<getTimeline().size(); i++){
            if(hour<11) hour+=2;
            else  hour-=10;
            ls.add(hour);
        }

        return ls.equals(getTimeline());
    }
    ////////////////////////////////////////////////////////



    public void expandToday() throws InterruptedException {
        scrollByPixel("0", "1000");
        Thread.sleep(2000);
        clickElementByJS(Today);
    }

    public List<Integer> getAlltempList(boolean flag){
        List<WebElement> tempList = webElements(alltemp);
        List<Integer> tempInt = new ArrayList<Integer>();

            for (int i = 0; i < tempList.size(); i++) {
                String temp = tempList.get(i).getText();
                String ListTemp = temp.replaceAll("[^0-9]", "");
                if(flag) {
                    System.out.print(" " + ListTemp + " ");
                }
                tempInt.add(Integer.parseInt(ListTemp));
            }
        return tempInt;
    }

    public int maxTemp() throws InterruptedException {
        List<Integer> tempIntMax = getAlltempList(false);
        Thread.sleep(3000);
        return Collections.max(tempIntMax);
    }

    public int minTemp() throws InterruptedException {
        List<Integer> tempIntMin = getAlltempList(false);
        Thread.sleep(3000);
        return Collections.min(tempIntMin);
    }

    public int verifyMaxTemrature() throws InterruptedException {
        String highTemp = getTextFromElement(maxTop);
        String max = highTemp.replaceAll("[^0-9]", "");
        System.out.println("\n" + "ACTUAL MAXTEMP: " + max);
        int max1 = maxTemp();
        int max2 = Integer.parseInt(max);
            return max2;
        }

    public int verifyMinTemprature() throws InterruptedException {
            String lowTemp = getTextFromElement(minTop);
            String min = lowTemp.replaceAll("[^0-9]", "");
            System.out.println("\n" + "ACTUAL MINTEMP: " + min);

            int min1 = minTemp();
            int min2 = Integer.parseInt(min);
                return min2;
            }
        }













