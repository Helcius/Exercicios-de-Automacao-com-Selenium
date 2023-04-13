import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteSelect {

    private static WebDriver driver;
    private  static  String URL = "https://igorsmasc.github.io/praticando_selects_radio_checkbox/";

    @BeforeEach
    public void beforeEach(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }

    @Test
    public void testSelect(){
        WebElement selectMultiploWebElem = driver.findElement(By.id("ingredientes"));
        Select select = new Select(selectMultiploWebElem);

        select.

    }
}
