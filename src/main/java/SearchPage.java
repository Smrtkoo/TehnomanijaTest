import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{

    @FindBy(css = "div:nth-child(7) lib-product-box:nth-child(1) div:nth-child(1) a:nth-child(1)")
    WebElement iPhoneItem;

    @FindBy(css = ".add-to-cart-label")
    WebElement addToCart;

    @FindBy(css = ".minicart--counter")
    WebElement cartNumber;



    public SearchPage (ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickiPhoneItem()
    {
        iPhoneItem.click();
    }
    public void clickAddToCart()
    {
        addToCart.click();
    }
    public String cart()
    {
        return cartNumber.getText();
    }

}
