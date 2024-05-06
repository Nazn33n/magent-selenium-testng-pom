package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderPlacePage extends BasePage {
    private By clickMenItems = By.cssSelector("a[id='ui-id-5'] span:nth-child(2)");
    private By clickSubMenu = By.linkText("Tops");
    private By selectSizeFromTopSection = By.cssSelector(".item.product.product-item:nth-child(3) .swatch-option.text:first-child");
    private By selectColorFromTopSection = By.cssSelector(".item.product.product-item:nth-child(3) .swatch-option.color");
    private By clickAddCartButton = By.cssSelector(".item.product.product-item:nth-child(3) .actions-primary");
    private By clickMenLink = By.linkText("Men");
    private By clickMenBottomLink = By.linkText("Bottoms");
    private By selectSizeFromBottomSection = By.cssSelector(".item.product.product-item:nth-child(12) .swatch-option.text:nth-child(1)");
    private By selectColorFromBottomSection = By.cssSelector(".item.product.product-item:nth-child(12) .swatch-option.color:first-child");
    private By cartView = By.cssSelector(".action.showcart");
    private By proceedToCheckout = By.id("top-cart-btn-checkout");
    private By clickGearItems = By.id("ui-id-6");
    private By clickWatchesLink = By.linkText("Watches");
    private By clickAddCartButtonFromWatches = By.cssSelector(".item.product.product-item:nth-child(3) .actions-primary");


    public OrderPlacePage(WebDriver driver) throws IOException { super(driver); }

    //select men from the menu bar
    public WebElement getClickMenMenu() {return elementWithWait(clickMenItems, "clickable"); }
    public WebElement getClickTopMenu() { return elementWithWait(clickSubMenu, "clickable"); }

    //add product to cart from Top menu
    public WebElement getProductSize1() { return elementWithWait(selectSizeFromTopSection, "clickable"); }
    public WebElement getProductColor1() { return elementWithWait(selectColorFromTopSection, "clickable"); }
    public WebElement getAddCartButton(){return elementWithWait(clickAddCartButton, "clickable");}
    public WebElement getMenLink(){return elementWithWait(clickMenLink, "clickable");}
    public WebElement GetMenBottomLink(){return elementWithWait(clickMenBottomLink, "clickable");}

    //add product to cart from Bottom menu
    public WebElement getProductSize2(){return elementWithWait(selectSizeFromBottomSection, "clickable");}
    public WebElement getProductColor2(){return elementWithWait(selectColorFromBottomSection, "clickable");}

    //add product to cart from Gear menu
    public WebElement getClickGearMenu(){return elementWithWait(clickGearItems, "clickable");}


    //cart view
    public WebElement getCartIcon(){return elementWithWait(cartView, "clickable");}
    public WebElement getProceedCheckoutButton(){return elementWithWait(proceedToCheckout, "clickable");}
    public WebElement getWatchesList(){return elementWithWait(clickWatchesLink, "clickable");}
    public WebElement getAddCartButtonFromWatchesList(){return elementWithWait(clickAddCartButtonFromWatches, "clickable");}




//        .products.list.items.product-items li:first-child .action.tocart.primary
    }

