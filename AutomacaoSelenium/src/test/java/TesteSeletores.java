import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSeletores {

    private static WebDriver driver;
    private static final String URL = "https://igorsmasc.github.io/praticando_locators_selenium/";

    @BeforeAll
    public static void beforeEach(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @AfterAll
    public static void afterEach(){
        driver.quit();
    }

    @Test
    public void locatorById(){
        WebElement element = driver.findElement(By.id("locator-id"));
        assertEquals("Achei com ID", element.getText());
    }

    @Test
    public void locatorByClassName(){
        WebElement element = driver.findElement(By.className("locator-class-name"));
        assertEquals("Achei com Class Name", element.getText());
    }

    @Test
    public void locatorByName(){
        WebElement element = driver.findElement(By.name("locator-name"));
        assertEquals("Achei com Name", element.getText());
    }

    @Test
    public void locatorByCSSSelector(){
        WebElement element = driver.findElement(By.cssSelector(".lead.css-selector-locator"));
        assertEquals("Achei com CSS Selector", element.getText());
    }

    @Test
    public void locatorByLinkText(){
        WebElement element = driver.findElement(By.linkText("Achei com o link text"));
        assertEquals("Achei com o link text", element.getText());
    }

    @Test
    public void locatorByPartialLinkText(){
        WebElement element = driver.findElement(By.partialLinkText("Achei com o partial"));
        assertEquals("Achei com o partial link text", element.getText());
    }

    @Test
    public void locatorByTagName(){
        WebElement element = driver.findElement(By.tagName("details"));
        assertEquals("Achei com Tag Name", element.getText());
    }

    @Test
    public void locatorByXPATH(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"locator-xpath\"]/b"));
        assertEquals("XPATH", element.getText());
    }
}
