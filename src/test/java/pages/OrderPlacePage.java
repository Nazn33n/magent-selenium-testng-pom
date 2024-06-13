package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderPlacePage extends BasePage {
    public OrderPlacePage(WebDriver driver) throws IOException{
        super(driver);
    }

    private By clickMenItems = By.xpath("//*[@id=\"ui-id-5\"]/span[2]");
    private By clickSubMenu = By.linkText("Tops");
    private By selectSizeFromTopSection = By.cssSelector(".item.product.product-item:nth-child(3) .swatch-option.text:first-child");
    private By selectColorFromTopSection = By.cssSelector(".item.product.product-item:nth-child(3) .swatch-option.color");
    private By clickAddCartButtonFromTops = By.xpath("//*[@id=\"maincontent\"]//li[3]//button");


    private By clickMenLink = By.linkText("Men");
    private By clickMensBottomLink = By.linkText("Bottoms");
    private By selectSizeFromBottomSection = By.cssSelector(".item.product.product-item:nth-child(12) .swatch-option.text:nth-child(1)");
    private By selectColorFromBottomSection = By.cssSelector(".item.product.product-item:nth-child(12) .swatch-option.color:first-child");
    private By clickAddCartButtonFromBottoms = By.xpath("//*[@id=\"maincontent\"]//li[12]//button");



    private By clickGearItems = By.id("ui-id-6");
    private By clickWatchesLink = By.linkText("Watches");
    private By clickProductDetail = By.cssSelector(".item.product.product-item:nth-child(3)");
    private By clickAddCartButton = By.xpath("//*[@id=\"product-addtocart-button\"]");
    private By cartView = By.xpath("//a[@class='action showcart']");
    private By proceedToCheckout = By.id("top-cart-btn-checkout");

    //select men from the menu bar
    public WebElement getClickMenMenu() {return elementWithWait(clickMenItems, "clickable"); }
    public WebElement getClickTopMenu() { return elementWithWait(clickSubMenu, "clickable"); }

    //add product to cart from Top menu
    public WebElement getProductSize1() { return elementWithWait(selectSizeFromTopSection, "clickable"); }
    public WebElement getProductColor1() { return elementWithWait(selectColorFromTopSection, "clickable"); }
    public WebElement getAddCartButtonFromTops(){return elementWithWait(clickAddCartButtonFromTops, "clickable");}


    //add product to cart from Bottom menu
    public WebElement getMenLink(){return elementWithWait(clickMenLink, "clickable");}
    public WebElement getMenBottomLink(){return elementWithWait(clickMensBottomLink, "clickable");}
    public WebElement getProductSize2(){return elementWithWait(selectSizeFromBottomSection, "clickable");}
    public WebElement getProductColor2(){return elementWithWait(selectColorFromBottomSection, "clickable");}
    public WebElement getAddCartButtonFromBottoms(){return elementWithWait(clickAddCartButtonFromBottoms, "clickable");}

    //add product to cart from Gear menu
    public WebElement getClickGearMenu(){return elementWithWait(clickGearItems, "clickable");}


    //cart view

    public WebElement getWatchesList(){return elementWithWait(clickWatchesLink, "clickable");}
    public WebElement getProductDetails(){return elementWithWait(clickProductDetail, "clickable");}
    public WebElement getAddCartButtonFromWatchesList(){return elementWithWait(clickAddCartButton, "clickable");}
    public WebElement getCartIcon(){return elementWithWait(cartView, "clickable");}
    public WebElement getProceedCheckoutButton(){return elementWithWait(proceedToCheckout, "clickable");}



//        .products.list.items.product-items li:first-child .action.tocart.primary
    }

