package page.object.model;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
// add new commit
    @Test

    public void test1(){
        PageFactory.initElements(driver,HomePage.class);
        HomePage hp = PageFactory.initElements(driver,HomePage.class);
        hp.searchBook();

    }
}
