package testng;

import pages.SchedulePage;

public class SeleniumTest {

    static {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
    }


    public static void main(String[] args){

        SchedulePage schedulePage = new SchedulePage();
        schedulePage.openApplication();
        schedulePage.denyNotifications();

    }
}
