package tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.*;
import pages.BasePage;
import pages.Page;

import utils.ConfigProperties;

public class BaseTest {
    private String url=null;
    private String urlType=null;
    public static WebDriver driver;
    public static String resourcesRoot = "./resources/";// Set Path f resources
    FluentWait wait;
    public static Page page;
    private static ConfigProperties configProperties;
    public static String baseUrl;

    public BaseTest(String urlType){
        this.urlType = urlType;
    }


    public void init() throws IOException {

        configProperties = new ConfigProperties();
        url = configProperties.config.getProperty("BASE_URL");
    }

    @BeforeMethod
    public void beforeMethod(Method method)
    {
//        Allure.addAttachment(method.getName(), screenshot());
    }

    @AfterMethod
    public void afterMethod(Method method)
    {
//        tearDown();
//        Allure.addAttachment(method.getName(),screenshot());
    }


    @BeforeSuite
    @Parameters(value = {"browser"})
    public void setupTest(String browser) throws IOException {

        init();

        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",resourcesRoot+"drivers\\chromedriver123.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

           driver = new ChromeDriver(options);

            System.out.println("Chrome Browser is Selected");
        }
        else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("Mozila Firefox Browser is Selected");
        }
        else{
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("Edge Browser is Selected");
        }


        wait = new FluentWait(driver);
        page = new BasePage(driver);
        driver.manage().window().maximize();
        driver.get(this.url);


        wait.withTimeout(Duration.ofSeconds(Long.valueOf(configProperties.config.getProperty("TIMEOUT_IN_SECONDS"))));
        wait.withTimeout(Duration.ofSeconds(Long.valueOf(configProperties.config.getProperty("POLLING_IN_MILISECONDS"))));
    }
//
//        public void popupHandle() throws NoSuchElementException{
//
//        //Popup handle
//            try {
//                WebElement close = page.getInstance(HomePage.class).getPopupCloseBtn();
//                close.click();
//            }
//            catch (TimeoutException e2){
//            }
//        }
//
//
//    public static void takeScreenshot(WebDriver webDriver, String filePath) throws Exception{
//        //Convert web driver object to TakeScreenshot
//        TakesScreenshot screenshot = ((TakesScreenshot) webDriver);
//
//        //Call getScreenshotAs method to create image file
//        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//
//        //Move image file to new destination
//        File destinationFile = new File(filePath);
//
//        //Copy file at destination
//        FileUtils.copyFile(srcFile,destinationFile);

//    }

    @AfterSuite
    public void tearDown(){
        driver.quit();

    }

}
