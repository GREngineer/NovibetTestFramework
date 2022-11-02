package constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleChromeDriver {

    private static SingleChromeDriver singleChromeDriver = null;

    private SingleChromeDriver(){

    }

    public WebDriver openBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static SingleChromeDriver getInstance(){
        if (singleChromeDriver == null){
            singleChromeDriver = new SingleChromeDriver();
        }
        return singleChromeDriver;
    }
}
