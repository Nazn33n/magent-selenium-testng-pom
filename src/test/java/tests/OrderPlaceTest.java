package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.OrderPlacePage;
import pages.Page;

public class OrderPlaceTest extends BaseTest {
    WebDriver driver;
    Page page;

    public OrderPlaceTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;
    }

    @Test
    public void addProductToCart() {
        page.getInstance(OrderPlacePage.class).getClickMenMenu().click();
        page.getInstance(OrderPlacePage.class).getClickTopMenu().click();
        page.getInstance(OrderPlacePage.class).getProductSize1().click();
        page.getInstance(OrderPlacePage.class).getProductColor1().click();
        page.getInstance(OrderPlacePage.class).getAddCartButton().click();
        page.getInstance(OrderPlacePage.class).getMenLink().click();
        page.getInstance(OrderPlacePage.class).GetMenBottomLink().click();
        page.getInstance(OrderPlacePage.class).getProductSize2().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(600,0)", "");
        page.getInstance(OrderPlacePage.class).getProductColor2().click();
        page.getInstance(OrderPlacePage.class).getClickGearMenu().click();
        page.getInstance(OrderPlacePage.class).getWatchesList().click();
        page.getInstance(OrderPlacePage.class).getAddCartButtonFromWatchesList().click();
        page.getInstance(OrderPlacePage.class).getCartIcon().click();
        page.getInstance(OrderPlacePage.class).getProceedCheckoutButton().click();
    }
}
