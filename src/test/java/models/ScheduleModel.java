package models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static constant.PageElementPath.DENY_MEDIUM_SIZE_NOTIFICATION;
import static constant.PageElementPath.DENY_NOTIFICATION;

public class ScheduleModel {

    @CacheLookup
    @FindBy(how = How.XPATH, using = DENY_NOTIFICATION)
    public WebElement denyNotifications;

    @CacheLookup
    @FindBy(how = How.XPATH, using = DENY_MEDIUM_SIZE_NOTIFICATION)
    public WebElement denyFirstNotifications;


}
