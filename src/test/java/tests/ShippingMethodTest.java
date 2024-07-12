package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.OrderPlacePage;
import pages.Page;
import pages.ShippingMethodPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static utils.Constant.*;


public class ShippingMethodTest extends BaseTest {

    WebDriver driver;
    Page page;

    public ShippingMethodTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;
    }
    List<String> productTotalPrice = new ArrayList<>();
    List<String> orderIds = new ArrayList<>();
    @Test
    public void fillUpShippingInformation() throws Exception {
        page.getInstance(ShippingMethodPage.class).getCompany().sendKeys(company_name);
        page.getInstance(ShippingMethodPage.class).getShipAddressOne().sendKeys(address_one);
        page.getInstance(ShippingMethodPage.class).getShipAddressTwo().sendKeys(address_two);
        page.getInstance(ShippingMethodPage.class).getShipAddressThree().sendKeys(address_three);
        page.getInstance(ShippingMethodPage.class).getShipCityName().sendKeys(city_name);

        WebElement dropDown = page.getInstance(ShippingMethodPage.class).getShipRegionId();
        Select selectRegion = new Select(dropDown);
        selectRegion.selectByIndex(4);
        /*List<WebElement> list=selectRegion.getOptions();
        int size=list.size();
        Random r=new Random();
        int index=r.nextInt(size);
        list.get(index).click();*/
        page.getInstance(ShippingMethodPage.class).getShipPostCode().sendKeys(zip_code);
        page.getInstance(ShippingMethodPage.class).getShipTelephone().sendKeys(phone_number);
        page.getInstance(ShippingMethodPage.class).getShipRadioButton().click();
        page.getInstance(ShippingMethodPage.class).getShippingNextButton().click();

        Thread.sleep(3000);

        WebElement totalPrice = page.getInstance(ShippingMethodPage.class).getProductsTotalPrice();
        String saveTotalPrice = totalPrice.getText();
        productTotalPrice.add(saveTotalPrice);
        System.out.println(productTotalPrice);



        page.getInstance(ShippingMethodPage.class).getShippingCheckBox().click();
        page.getInstance(ShippingMethodPage.class).getShippingPlaceOrderButton().click();

        String actualText = page.getInstance(ShippingMethodPage.class).getShippingSuccessMsg().getText();
        Assert.assertEquals(actualText, success_message);
        System.out.println(success_message);
        takeScreenshot("ss2");
        String orderCompletionID = page.getInstance(ShippingMethodPage.class).getOrderCompletionId().getText();
        orderIds.add(orderCompletionID);
        System.out.println(orderCompletionID);


    }


}
