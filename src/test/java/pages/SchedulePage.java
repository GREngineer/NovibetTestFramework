package pages;

import constant.SingleChromeDriver;
import models.ScheduleModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static constant.PageElementPath.*;

public class SchedulePage {



    private final WebDriver driver;

    private final ScheduleModel scheduleModel;

    public SchedulePage(){
        driver = SingleChromeDriver.getInstance().openBrowser();
        scheduleModel = PageFactory.initElements(driver, ScheduleModel.class);
    }

    //Go to Scheduled Matches website

    public void openApplication(){
        driver.manage().window().maximize();
        driver.get(SCHEDULED_PAGE_WEBSITE_LINK);
    }

    //Close medium size notification popup
    public void denyNotifications(){
        scheduleModel.denyFirstNotifications.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(DENY_NOTIFICATION)));
        scheduleModel.denyNotifications.click();
    }
}

//    I managed to reach up to this part of the exercise. For the next tasks, I can imagine I would need to find
//    the xpath for the scheduled matches page that points to the schedule table, copy and store only 4 of
//    the values (home team + dash + away team + start time) in a list. Then make a second list for the matches in the
//    Live Page and create an if/else loop that compares them; this is however far beyond my coding skill at the moment.
//    Regarding calls to the website, I would use Jenkins to deploy the code every five minutes, but I wasn't able to
//    complete that within the timeframe. Thanks for reading a  ͟v͟e͟r͟y͟ junior's work!




