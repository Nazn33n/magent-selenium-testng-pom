package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.Page;

public class MyAccountTest extends BaseTest {
    WebDriver driver;
    Page page;


    public MyAccountTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;

    }

    @Test
    public void changePasswordLinkTest() throws InterruptedException {
        page.getInstance(MyAccountPage.class).getChangePassword().click();


    }

}
