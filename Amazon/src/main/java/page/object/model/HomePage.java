package page.object.model;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
  // page factory
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    // methods
    public void searchBook()
        searchBox.sendKeys("selenium Books");


}
