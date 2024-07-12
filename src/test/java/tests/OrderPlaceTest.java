package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.OrderPlacePage;
import pages.Page;

import java.util.ArrayList;
import java.util.List;


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

    List<String> productTitles = new ArrayList<>();
    List<String> productPrices = new ArrayList<>();
    List<String> productDescriptions = new ArrayList<>();


    @Test
    public void addProductFromTop() {

        page.getInstance(OrderPlacePage.class).getClickMenMenu().click();
        page.getInstance(OrderPlacePage.class).getClickTopMenu().click();
        page.getInstance(OrderPlacePage.class).getMenDetail().click();
        WebElement titleElement = page.getInstance(OrderPlacePage.class).getProductTitle();
        String productTitle = titleElement.getText();
        productTitles.add(productTitle);
        WebElement priceElement = page.getInstance(OrderPlacePage.class).getProductPrice();
        String productPrice = priceElement.getText();
        productPrices.add(productPrice);
        WebElement descriptionElement = page.getInstance(OrderPlacePage.class).getProductDescription();
        String productDescription = descriptionElement.getText();
        productDescriptions.add(productDescription);
        page.getInstance(OrderPlacePage.class).getProductSize1().click();
        page.getInstance(OrderPlacePage.class).getProductColor1().click();
        page.getInstance(OrderPlacePage.class).getAddCartButtonFromTops().click();
    }

    @Test
    public void addProductFromBottom() throws InterruptedException {
        page.getInstance(OrderPlacePage.class).getMenLink().click();
        page.getInstance(OrderPlacePage.class).getMenBottomLink().click();
        page.getInstance(OrderPlacePage.class).getBottomMenDetail().click();
        WebElement titleElement1 = page.getInstance(OrderPlacePage.class).getProductTitle1();
        String productTitle1 = titleElement1.getText();
        productTitles.add(productTitle1);
        WebElement priceElement1 = page.getInstance(OrderPlacePage.class).getProductPrice1();
        String productPrice1 = priceElement1.getText();
        productPrices.add(productPrice1);
        WebElement descriptionElement1 = page.getInstance(OrderPlacePage.class).getProductDescription1();
        String productDescription1 = descriptionElement1.getText();
        productDescriptions.add(productDescription1);
        page.getInstance(OrderPlacePage.class).getProductSize2().click();
        page.getInstance(OrderPlacePage.class).getProductColor2().click();
        page.getInstance(OrderPlacePage.class).getAddCartButtonFromBottoms().click();

    }

    @Test
    public void addProductFromGear() throws Exception {
        page.getInstance(OrderPlacePage.class).getClickGearMenu().click();
        page.getInstance(OrderPlacePage.class).getWatchesList().click();
        page.getInstance(OrderPlacePage.class).getProductDetails().click();
        WebElement titleElement2 = page.getInstance(OrderPlacePage.class).getProductTitle2();
        String productTitle2 = titleElement2.getText();
        productTitles.add(productTitle2);
        WebElement priceElement2 = page.getInstance(OrderPlacePage.class).getProductPrice2();
        String productPrice2 = priceElement2.getText();
        productPrices.add(productPrice2);
        WebElement descriptionElement2 = page.getInstance(OrderPlacePage.class).getProductDescription2();
        String productDescription2 = descriptionElement2.getText();
        productDescriptions.add(productDescription2);
        page.getInstance(OrderPlacePage.class).getAddCartButtonFromWatchesList().click();
        Thread.sleep(3000);
        page.getInstance(OrderPlacePage.class).getCartIcon().click();
        page.getInstance(OrderPlacePage.class).getViewEditCart().click();
        takeScreenshot("ss1");
        page.getInstance(OrderPlacePage.class).getProceedCheckoutButton().click();
        System.out.println(productTitles);
        System.out.println(productPrices);
        System.out.println(productDescriptions);

    }


}
