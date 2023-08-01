import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(css = "input[placeholder='Pretraži proizvode']")
    WebElement search;

    @FindBy(css = ".thm-search.cx-icon.fas.fa-search")
    WebElement searchIcon;

    public HomePage (ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void inputSearch(String text)
    {
        search.sendKeys(text);
        searchIcon.click();
    }

}
