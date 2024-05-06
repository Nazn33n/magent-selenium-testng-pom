package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class AddressBookPage extends BasePage {
    private By phoneNumber = By.id("telephone");
    private By addressOne = By.id("street_1");
    private By addressTwo = By.id("street_2");
    private By addressThree = By.id("street_3");
    private By cityName = By.id("city");
    private By stateDropdown = By.id("region_id");
    private By zipCode = By.id("zip");
    private By countryDropdown = By.id("country");
    private By saveAddressButton = By.cssSelector("button[title='Save Address']");
    private By editAddress = By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/a");


    public AddressBookPage(WebDriver driver) throws IOException {
        super(driver);

    }

    public WebElement getEditAddress() {
        return elementWithWait(editAddress, "clickable");
    }

    public WebElement getPhoneNumber() {
        return elementWithWait(phoneNumber, "presence");
    }

    public WebElement getAddressOne() {
        return elementWithWait(addressOne, "presence");
    }

    public WebElement getAddressTwo() {
        return elementWithWait(addressTwo, "presence");
    }

    public WebElement getAddressThree() {
        return elementWithWait(addressThree, "presence");
    }

    public WebElement getCityName() { return elementWithWait(cityName, "presence"); }

    public WebElement getRegionDropdown() { return elementWithWait(stateDropdown, "presence"); }


    public WebElement getZipCode() {
        return elementWithWait(zipCode, "presence");
    }

    public WebElement getCountryDropdown() {
        return elementWithWait(countryDropdown, "presence");
    }

    public WebElement getSaveAddressButton() {
        return elementWithWait(saveAddressButton, "clickable");
    }
}
