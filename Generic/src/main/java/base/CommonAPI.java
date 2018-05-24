package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class CommonAPI {

    public WebDriver driver = null;

    // before method - start before a test - open a browser
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("") String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imran\\IdeaProjects\\TestWebautomation\\Generic\\driver\\chromedriver_win32(1)");

        driver = new ChromeDriver();

    }


    // after method - end after a test - close a browser
    @AfterMethod
    public void TearDown(){
        driver.close();
    }

}
