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

//    This is a simple automation script



