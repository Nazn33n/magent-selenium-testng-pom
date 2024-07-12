package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.NewAccountPage;
import pages.Page;
import utils.Utility;
import java.io.IOException;
import java.util.List;

public class MyAccountTest extends BaseTest {
    WebDriver driver;
    Page page;
    Utility utility;

    public MyAccountTest(String url) {
        super(url);
        utility = new Utility();
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;

    }


    @Test
    public void ProfileTest() throws IOException {

        page.getInstance(MyAccountPage.class).getProfile().click();
        page.getInstance(MyAccountPage.class).getMyAccount().click();
        page.getInstance(MyAccountPage.class).getMyOrders().click();

    }

    @Test
    public void OrderValidationTest() throws Exception {


//        boolean isMatchFound = false;
//        for (String orderTotal : productTotalPrice) {
//            if (orderTotal.equals(productTotalPrice)) {
//                isMatchFound = true;
//                break;
//            }
//        }
//
//        if (isMatchFound) {
//            System.out.println("Match found for order total price: " + productTotalPrice);
//        } else {
//            System.out.println("No match found for order total price: " + productTotalPrice);
//        }
//    }

//        WebElement orderTable = page.getInstance(MyAccountPage.class).getOrderTable();
//        List<WebElement> rows = orderTable.findElements(By.tagName("tr"));
//
//        // Loop through each row
//        for (WebElement row : rows) {
//            // Get all cells in the row
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//            System.out.print(cells.size());
//
//            // Check if the row has the expected number of cells
//            if (cells.size() == 6) {
//                // Extract details from cells
//                String orderId = cells.get(0).getText();
//                String orderDate = cells.get(1).getText();
//                String customerName = cells.get(2).getText();
//                String orderAmount = cells.get(3).getText();
//                String orderStatus = cells.get(4).getText();
//
//                System.out.println(" "+orderId+" "+orderDate+" "+customerName+" "+orderAmount+" "+orderStatus);
//                // Validate the order details
//                if (orderId.equals("000006162") &&
//                        orderDate.equals("6/13/24") &&
//                        customerName.equals("nahar ali") &&
//                        orderAmount.equals("$54.00") &&
//                        orderStatus.equals("Pending")) {
//                    System.out.print("Order validated successfully.");
//                } else {
//                    System.out.print("Order validation failed.");
//                }
//                takeScreenshot("ss");
//            }
//            else {
//                System.out.print(" ");
//            }
//        }
//    }

}}
