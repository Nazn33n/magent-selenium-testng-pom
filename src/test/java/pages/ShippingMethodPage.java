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
    private By shippingRegionId = By.id("P8J7CJ3");
    private By shippingPostCode = By.name("postcode");
    private By shippingTelephone = By.name("telephone");
    private By shippingRadioButton = By.name("ko_unique_2");


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
}
