package tests;

import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.Page;
import java.util.Iterator;
import java.util.Set;
import static utils.Constant.*;


public class HomeTest extends BaseTest {
    WebDriver driver;
    Page page;
    JavascriptExecutor js;

    public HomeTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;

    }

    @Test
    public void locatorTest() throws Exception {
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Test Start .......");
        String pageTitle = driver.getTitle();     //Get the page title
        System.out.println("Page title is: " + pageTitle);

        //Get the current URL
        String current_url = driver.getCurrentUrl();
        System.out.println("Current url is: " + current_url);
        softAssert.assertEquals(current_url, "luma_url");
    }

    @Test
    public void subscribeTest() {

        page.getInstance(HomePage.class).getClickSubscribe().click();

        //Handel Windows
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);

        page.getInstance(HomePage.class).getInputSubscribeEmail().sendKeys(login_email);
        page.getInstance(HomePage.class).getInputSubscribeFirstName().sendKeys(first_name);
        page.getInstance(HomePage.class).getInputSubscribeLastName().sendKeys(last_name);
        page.getInstance(HomePage.class).getInputSubscribeCompanyName().sendKeys(company_name);
        page.getInstance(HomePage.class).getInputSubscribePosition().sendKeys(subscribe_position);
        page.getInstance(HomePage.class).getSubscribeButton().click();
        driver.close();
        driver.switchTo().window(parentWindow);
        System.out.println("Move to parent page");
    }

    @Test
    public void alertBoxTest() throws Exception {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(700,0)", "");

        page.getInstance(HomePage.class).getSizeFromHome().click();
        page.getInstance(HomePage.class).getColorFromHome().click();
        page.getInstance(HomePage.class).getAddToCartButton().click();
        page.getInstance(HomePage.class).getCartIcon().click();
        page.getInstance(HomePage.class).getDeleteIcon().click();
        Thread.sleep(5000);
        page.getInstance(HomePage.class).getOkFromAlertBox().click();

    }
    @Test
    public void comparisonTest() throws InterruptedException {

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(700,0)", "");
        page.getInstance(HomePage.class).getProductDetail().click();
        page.getInstance(HomePage.class).getProductsSize().click();
        page.getInstance(HomePage.class).getProductsColor().click();
        page.getInstance(HomePage.class).getProductsQty().clear();
        page.getInstance(HomePage.class).getProductsQty().sendKeys("2");
        Thread.sleep(6000);
        page.getInstance(HomePage.class).getProductsAddButton().click();
        page.getInstance(HomePage.class).getProductsCompareLink().click();
        page.getInstance(HomePage.class).getProductsCompareList().click();
//        page.getInstance(HomePage.class).getPrintPageLink().click();


    }
}
