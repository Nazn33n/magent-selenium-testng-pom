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
    private By clickMenDetail = By.xpath("//*/div[3]/div[1]//ol/li[3]");
    private By selectSizeFromTopSection = By.cssSelector(".swatch-option.text:first-child");
    private By selectColorFromTopSection = By.cssSelector(".swatch-option.color");
    private By selectProductTitle = By.cssSelector(".base");
    private By selectProductPrice = By.id("product-price-712");
    private By selectProductDescription = By.id("description");
    private By clickAddCartButtonFromTops = By.id("product-addtocart-button");


    private By clickMenLink = By.linkText("Men");
    private By clickMensBottomLink = By.linkText("Bottoms");
    private By clickBottomMenDetail = By.xpath("//*/div[3]/ol/li[1]");
    private By selectProductTitle1 = By.cssSelector(".base");
    private By selectProductPrice1 = By.id("product-price-1028");
    private By selectProductDescription1 = By.id("description");
    private By selectSizeFromBottomSection = By.cssSelector(".swatch-option.text:nth-child(1)");
    private By selectColorFromBottomSection = By.cssSelector(".swatch-option.color:first-child");
    private By clickAddCartButtonFromBottoms = By.id("product-addtocart-button");



    private By clickGearItems = By.id("ui-id-6");
    private By clickWatchesLink = By.linkText("Watches");
    private By clickProductDetail = By.xpath("//div[2]//div[3]/div[1]/div[3]//li[3]");
    private By selectProductTitle2 = By.cssSelector(".base");
    private By selectProductPrice2 = By.id("product-price-42");
    private By selectProductDescription2 = By.id("description");
    private By clickAddCartButton = By.id("product-addtocart-button");
    private By cartView = By.xpath("//a[@class='action showcart']");
    private By viewAndEditCart = By.xpath("*//div[2]/div[5]//a");
    private By proceedToCheckout = By.xpath("*//ul/li[1]/button");

    //select men from the menu bar
    public WebElement getClickMenMenu() {return elementWithWait(clickMenItems, "clickable"); }
    public WebElement getClickTopMenu() { return elementWithWait(clickSubMenu, "clickable"); }

    //add product to cart from Top menu
    public WebElement getMenDetail() { return elementWithWait(clickMenDetail, "clickable"); }

    public WebElement getProductSize1() { return elementWithWait(selectSizeFromTopSection, "clickable"); }
    public WebElement getProductColor1() { return elementWithWait(selectColorFromTopSection, "clickable"); }
    public WebElement getProductTitle() { return elementWithWait(selectProductTitle, "visibility"); }
    public WebElement getProductPrice() { return elementWithWait(selectProductPrice, "visibility"); }
    public WebElement getProductDescription() { return elementWithWait(selectProductDescription, "visibility"); }
    public WebElement getAddCartButtonFromTops(){return elementWithWait(clickAddCartButtonFromTops, "clickable");}


    //add product to cart from Bottom menu
    public WebElement getMenLink(){return elementWithWait(clickMenLink, "clickable");}
    public WebElement getMenBottomLink(){return elementWithWait(clickMensBottomLink, "clickable");}
    public WebElement getBottomMenDetail(){return elementWithWait(clickBottomMenDetail, "clickable");}
    public WebElement getProductTitle1() { return elementWithWait(selectProductTitle1, "visibility"); }
    public WebElement getProductPrice1() { return elementWithWait(selectProductPrice1, "visibility"); }
    public WebElement getProductDescription1() { return elementWithWait(selectProductDescription1, "visibility"); }
    public WebElement getProductSize2(){return elementWithWait(selectSizeFromBottomSection, "clickable");}
    public WebElement getProductColor2(){return elementWithWait(selectColorFromBottomSection, "clickable");}
    public WebElement getAddCartButtonFromBottoms(){return elementWithWait(clickAddCartButtonFromBottoms, "clickable");}

    //add product to cart from Gear menu
    public WebElement getClickGearMenu(){return elementWithWait(clickGearItems, "clickable");}


    //cart view
    public WebElement getWatchesList(){return elementWithWait(clickWatchesLink, "clickable");}
    public WebElement getProductDetails(){return elementWithWait(clickProductDetail, "clickable");}
    public WebElement getProductTitle2() { return elementWithWait(selectProductTitle2, "visibility"); }
    public WebElement getProductPrice2() { return elementWithWait(selectProductPrice2, "visibility"); }
    public WebElement getProductDescription2() { return elementWithWait(selectProductDescription2, "visibility"); }
    public WebElement getAddCartButtonFromWatchesList(){return elementWithWait(clickAddCartButton, "clickable");}
    public WebElement getCartIcon(){return elementWithWait(cartView, "clickable");}
    public WebElement getViewEditCart(){return elementWithWait(viewAndEditCart, "clickable");}
    public WebElement getProceedCheckoutButton(){return elementWithWait(proceedToCheckout, "clickable");}
    }

