package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class NewAccountPage extends BasePage {
    public NewAccountPage(WebDriver driver) throws IOException {
        super(driver);
    }

    private By clickNewAccountCreateLink = By.linkText("Create an Account");
    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By emailAddress = By.name("email");
    private By inputPassword = By.id("password");
    private By passwordConfirmation = By.id("password-confirmation");
    private By submitButton = By.cssSelector("button[title='Create an Account'] span");
    private By clickLogo = By.xpath("//header//a/img");

    public WebElement getClickNewAccountCreateLink() {return elementWithWait(clickNewAccountCreateLink, "clickable");}

    public WebElement getFirstName() {
        return elementWithWait(firstName, "presence");
    }

    public WebElement getLastName() {
        return elementWithWait(lastName, "presence");
    }

    public WebElement getEmailAddress() {return elementWithWait(emailAddress, "presence");}

    public WebElement getPassword() {return elementWithWait(inputPassword, "presence");}

    public WebElement getPasswordConfirmation() {return elementWithWait(passwordConfirmation, "presence");}

    public WebElement getSubmitButton() {return elementWithWait(submitButton, "clickable");}
    public WebElement getHomePage() {return elementWithWait(clickLogo, "clickable");}
}
