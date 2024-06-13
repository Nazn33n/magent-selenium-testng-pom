package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShippingMethodPage extends BasePage {
    private By companyName = By.name("company");
    private By shippingAddressOne = By.name("street[0]");
    private By shippingAddressTwo = By.name("street[1]");
    private By shippingAddressThree = By.name("street[2]");
    private By shippingCityName = By.name("city");
    private By shippingRegionId = By.name("region_id");
    private By shippingPostCode = By.name("postcode");
    private By shippingTelephone = By.name("telephone");
    private By shippingRadioButton = By.name("ko_unique_2");
    private By shippingNextButton = By.xpath("//*[@id=\"shipping-method-buttons-container\"]//button");
    private By shippingCheckBox = By.xpath("//*[@id=\"billing-address-same-as-shipping-checkmo\"]");
    private By shippingPlaceOrderButton = By.cssSelector(".action.primary.checkout");
    private By shippingSuccessMsg = By.xpath("/html/body/div[2]/main/div[1]/h1/span");


    public ShippingMethodPage(WebDriver driver) throws IOException {
        super(driver);
    }

    public WebElement getCompany(){return elementWithWait(companyName, "presence");}
    public WebElement getShipAddressOne(){return elementWithWait(shippingAddressOne, "presence");}
    public WebElement getShipAddressTwo(){return elementWithWait(shippingAddressTwo, "presence");}
    public WebElement getShipAddressThree(){return elementWithWait(shippingAddressThree, "presence");}
    public WebElement getShipCityName(){return elementWithWait(shippingCityName, "presence");}
    public WebElement getShipRegionId(){return elementWithWait(shippingRegionId, "presence");}
    public WebElement getShipPostCode(){return elementWithWait(shippingPostCode, "presence");}
    public WebElement getShipTelephone(){return elementWithWait(shippingTelephone, "presence");}
    public WebElement getShipRadioButton(){return elementWithWait(shippingRadioButton, "presence");}
    public WebElement getShippingNextButton(){return elementWithWait(shippingNextButton, "presence");}
    public WebElement getShippingCheckBox(){return elementWithWait(shippingCheckBox, "presence");}
    public WebElement getShippingPlaceOrderButton(){return elementWithWait(shippingPlaceOrderButton, "presence");}
    public WebElement getShippingSuccessMsg(){return elementWithWait(shippingSuccessMsg, "presence");}
}
