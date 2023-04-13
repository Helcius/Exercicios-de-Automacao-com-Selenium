import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MinhaPrimeiraAutomacao {

    private WebDriver driver;
    private static final String URL = "https://www.google.com.br/";

    @BeforeEach
    public void beforeEach(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void befterEach(){
        driver.quit();
    }

    @Test
    public void test_google() {

        driver.get(URL);

        assertEquals("Google", driver.getTitle());

        assertEquals("https://www.google.com.br/", driver.getCurrentUrl());
    }

    @Test
    public void test_google_janela() {

        driver.get(URL);

        driver.manage().window().setPosition(new Point(500, 500));
        driver.manage().window().minimize();
        driver.manage().window().maximize();

    }

    @Test
    public void test_google_janela_Edge() {
        WebDriverManager.edgedriver().setup();

        WebDriver driverEdge = new EdgeDriver();


        driverEdge.get(URL);

        Assertions.assertEquals("Google", driverEdge.getTitle());
        driverEdge.manage().window().setPosition(new Point(500, 500));
        driverEdge.manage().window().minimize();
        driverEdge.manage().window().maximize();
        driverEdge.quit();
    }


}
