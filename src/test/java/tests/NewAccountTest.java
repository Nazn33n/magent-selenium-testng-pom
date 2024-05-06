package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.NewAccountPage;
import pages.Page;
import utils.Utility;

import java.io.IOException;

import static utils.Constant.*;

public class NewAccountTest extends BaseTest {
    WebDriver driver;
    Page page;
    Utility utility;

    public NewAccountTest(String url) {
        super(url);
        utility = new Utility();
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;

    }

    @Test
    public void CreateNewAccountTest() throws IOException {

        page.getInstance(NewAccountPage.class).getFirstName().sendKeys(first_name);
        page.getInstance(NewAccountPage.class).getLastName().sendKeys(last_name);
        page.getInstance(NewAccountPage.class).getEmailAddress().sendKeys(utility.getEmail());
        page.getInstance(NewAccountPage.class).getPassword().sendKeys(input_password);
        page.getInstance(NewAccountPage.class).getPasswordConfirmation().sendKeys(password_confirmation);
        page.getInstance(NewAccountPage.class).getSubmitButton().click();


    }
}
