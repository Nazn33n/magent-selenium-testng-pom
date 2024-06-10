package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class HomePage extends BasePage {
    public HomePage(WebDriver driver) throws IOException {
        super(driver);
    }

    //Subscribe locator
    private By subscribeLink = By.linkText("Subscribe");
    private By subscribeEmail = By.id("mce-EMAIL");
    private By subscribeFirstName = By.id("mce-FNAME");
    private By subscribeLastName = By.id("mce-LNAME");
    private By subscribeCompanyName = By.id("mce-COMPANY");
    private By subscribePosition = By.id("mce-POSITION");
    private By subscribeButton = By.id("mc-embedded-subscribe");

    // add product to cart for deletion feature
    private By selectSizeFromHome = By.cssSelector(".product-item:first-child .swatch-option.text:nth-child(1)");
    private By selectColorFromHome = By.cssSelector(".product-item:first-child .swatch-option.color:nth-child(1)");
    private By pressAddToCartButton = By.cssSelector(".product-item:first-child .action.tocart.primary");
    private By presscartIcon = By.cssSelector(".action.showcart");
    private By pressDeleteIcon = By.cssSelector(".action.delete");
    private By pressOkFromAlertBox = By.xpath("/html/body/div[4]/aside[2]/div[2]/footer/button[2]");


    //Add two product to cart for comparison feature
    private By productDetail = By.className("product-image-photo");
    private By productsSize = By.cssSelector(".swatch-option.text:nth-child(1)");
    private By productsColor = By.cssSelector(".swatch-option.color:nth-child(1)");
    private By productQty = By.id("qty");
    private By productAddButton = By.cssSelector(".action.primary.tocart");
    private By productCompareLink = By.cssSelector(".action.tocompare");
    private By productCompareList = By.linkText("comparison list");
//   private By printPage = By.linkText("Print This Page");

    //Subscribe locator
    public WebElement getClickSubscribe() {
        return elementWithWait(subscribeLink, "clickable");
    }

    public WebElement getInputSubscribeEmail() {
        return elementWithWait(subscribeEmail, "presence");
    }

    public WebElement getInputSubscribeFirstName() {
        return elementWithWait(subscribeFirstName, "presence");
    }

    public WebElement getInputSubscribeLastName() {
        return elementWithWait(subscribeLastName, "presence");
    }

    public WebElement getInputSubscribeCompanyName() {
        return elementWithWait(subscribeCompanyName, "presence");
    }

    public WebElement getInputSubscribePosition() {
        return elementWithWait(subscribePosition, "presence");
    }

    public WebElement getSubscribeButton() {
        return elementWithWait(subscribeButton, "clickable");
    }

    //add product to cart for deletion feature
    public WebElement getSizeFromHome() {
        return elementWithWait(selectSizeFromHome, "clickable");
    }

    public WebElement getColorFromHome() {
        return elementWithWait(selectColorFromHome, "clickable");
    }

    public WebElement getAddToCartButton() {
        return elementWithWait(pressAddToCartButton, "clickable");
    }

    public WebElement getCartIcon() {
        return elementWithWait(presscartIcon, "clickable");
    }

    public WebElement getDeleteIcon() {
        return elementWithWait(pressDeleteIcon, "clickable");
    }

    public WebElement getOkFromAlertBox() {
        return elementWithWait(pressOkFromAlertBox, "clickable");
    }


    //Add two product to cart for comparison feature
    public WebElement getProductDetail() {
        return elementWithWait(productDetail, "clickable");
    }

    public WebElement getProductsSize() {
        return elementWithWait(productsSize, "clickable");
    }

    public WebElement getProductsColor() {
        return elementWithWait(productsColor, "clickable");
    }

    public WebElement getProductsQty() {
        return elementWithWait(productQty, "clickable");
    }

    public WebElement getProductsAddButton() {
        return elementWithWait(productAddButton, "clickable");
    }

    public WebElement getProductsCompareLink() {
        return elementWithWait(productCompareLink, "clickable");
    }

    public WebElement getProductsCompareList() {
        return elementWithWait(productCompareList, "clickable");
    }
}
