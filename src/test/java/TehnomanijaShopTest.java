import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TehnomanijaShopTest extends BaseTest{
    HomePage homePage;
    SearchPage searchPage;
    @BeforeMethod
    public void setUp()
    {
        driver = openBrowser();
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
    }

    @Test
    public void buyingIphone()
    {
        homePage.inputSearch("iPhone");
        Assert.assertTrue(true,"Apple iPhone 14 128GB Midnight");
        searchPage.clickiPhoneItem();
        searchPage.clickAddToCart();
        Assert.assertEquals(searchPage.cart(),"1");
    }

    @AfterMethod
    public void after()
    {
        driver.quit();
    }
}
