package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddressBookPage;
import pages.Page;
import pages.ShippingMethodPage;

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

    @Test
    public void fillUpShippingInformation() {
        page.getInstance(ShippingMethodPage.class).getCompany().sendKeys(company_name);
        page.getInstance(ShippingMethodPage.class).getShipAddressOne().sendKeys(address_one);
        page.getInstance(ShippingMethodPage.class).getShipAddressTwo().sendKeys(address_two);
        page.getInstance(ShippingMethodPage.class).getShipAddressThree().sendKeys(address_three);
        page.getInstance(ShippingMethodPage.class).getShipCityName().sendKeys(city_name);
        Select selectRegion = new Select(page.getInstance(ShippingMethodPage.class).getShipRegionId());
        selectRegion.selectByValue("4");
        page.getInstance(ShippingMethodPage.class).getShipPostCode().sendKeys(zip_code);
        page.getInstance(ShippingMethodPage.class).getShipTelephone().sendKeys(phone_number);
        page.getInstance(ShippingMethodPage.class).getShipRadioButton().click();




    }


}
