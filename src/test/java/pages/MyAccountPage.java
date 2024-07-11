package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) throws IOException {
        super(driver);
    }
    private By clickProfile = By.xpath("/html/body//header//ul/li[2]/span");
    private By clickMyAccount = By.linkText("My Account");
    private By clickMyOrders = By.linkText("My Orders");
    private By orderTable = By.id("my-orders-table");
    private By orderRow = By.tagName("tr");

    public WebElement getProfile() {return elementWithWait(clickProfile, "clickable");}
    public WebElement getMyAccount() {return elementWithWait(clickMyAccount, "clickable");}
    public WebElement getMyOrders() {return elementWithWait(clickMyOrders, "clickable");}
    public WebElement getOrderTable() {return elementWithWait(orderTable, "clickable");}
    public WebElement getOrderRow() {return elementWithWait(orderRow, "clickable");}
}
