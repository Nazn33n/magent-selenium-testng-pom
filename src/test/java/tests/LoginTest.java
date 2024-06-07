package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Page;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static utils.Constant.*;

public class LoginTest extends BaseTest {

    WebDriver driver;
    Page page;


    public LoginTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;

    }

    @Test
    public void initiateLoginTest() throws InterruptedException {
        page.getInstance(LoginPage.class).getSignInLink().click();
        page.getInstance(LoginPage.class).getLoginEmail().sendKeys(login_email);
        page.getInstance(LoginPage.class).getLoginPassword().sendKeys(login_password);
        page.getInstance(LoginPage.class).getLoginSubmitButton().click();
        Thread.sleep(3000);

    }

    @Test
    public void brokenLinkTest(){
        List<WebElement> links = driver.findElements(By.tagName("a"));

        int brokenLinks = 0;
        int workingLinks = 0;

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url != null && !url.isEmpty()) {
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.connect();

                    int responseCode = connection.getResponseCode();

                    if (responseCode >= 400) {
                        System.out.println(url + " is a broken link.");
                        brokenLinks++;
                    } else {
                        System.out.println(url + " is a working link.");
                        workingLinks++;
                    }
                } catch (Exception e) {
                    System.out.println(url + " is a broken link.");
                    brokenLinks++;
                }
            } else {
                System.out.println("URL is either not configured for anchor tag or it is empty.");
            }
        }

        System.out.println("Number of broken links: " + brokenLinks);
        System.out.println("Number of working links: " + workingLinks);
    }
}
