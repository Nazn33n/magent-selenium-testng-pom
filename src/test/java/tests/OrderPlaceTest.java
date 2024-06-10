package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.OrderPlacePage;
import pages.Page;

public class OrderPlaceTest extends BaseTest {
    WebDriver driver;
    Page page;

    public OrderPlaceTest(String urlType) {
        super(urlType);
    }


    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;
    }

    @Test
    public void addProductFromTop() {

        page.getInstance(OrderPlacePage.class).getClickMenMenu().click();
        page.getInstance(OrderPlacePage.class).getClickTopMenu().click();
        page.getInstance(OrderPlacePage.class).getProductSize1().click();
        page.getInstance(OrderPlacePage.class).getProductSize1().click();
        page.getInstance(OrderPlacePage.class).getProductColor1().click();
        page.getInstance(OrderPlacePage.class).getAddCartButtonFromTops().click();
    }
    @Test
    public void addProductFromBottom() throws InterruptedException {
        page.getInstance(OrderPlacePage.class).getMenLink().click();
        page.getInstance(OrderPlacePage.class).getMenBottomLink().click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(600,0)", "");

        page.getInstance(OrderPlacePage.class).getProductSize2().click();
        page.getInstance(OrderPlacePage.class).getProductColor2().click();
        page.getInstance(OrderPlacePage.class).getAddCartButtonFromBottoms().click();
        Thread.sleep(3000);
    }
    @Test
    public void addProductFromGear() throws InterruptedException {
        page.getInstance(OrderPlacePage.class).getClickGearMenu().click();
        page.getInstance(OrderPlacePage.class).getWatchesList().click();
        page.getInstance(OrderPlacePage.class).getProductDetails().click();

        page.getInstance(OrderPlacePage.class) .getAddCartButtonFromWatchesList().click();
        Thread.sleep(3000);
        page.getInstance(OrderPlacePage.class).getCartIcon().click();
        page.getInstance(OrderPlacePage.class).getProceedCheckoutButton().click();
    }
}
