import org.junit.jupiter.api.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCliques {

    private static WebDriver driver;
    private  static  String URL = "https://igorsmasc.github.io/botoes_atividade_selenium/";

//    @BeforeAll
//    public static void setup(){
//    }

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
//
//    @AfterAll
//    public static void tearDown(){
//        driver.quit();
//    }

    @Test
    public void testCliqueBotaoComID(){
        WebElement element = driver.findElement(By.id("button1"));
        element.click();

        Alert alert = driver.switchTo().alert();



        Assertions.assertEquals("O botão 1 foi selecionado.", alert.getText());
        alert.accept();
    }

    @Test
    public void testCliqueBotaoComClassName(){
        WebElement element = driver.findElement(By.className("button-2"));
        element.click();

        Alert alert = driver.switchTo().alert();



        Assertions.assertEquals("O botão 2 foi selecionado.", alert.getText());
        alert.accept();
    }

    @Test
    public void testCliqueBotaoComName(){
        WebElement element = driver.findElement(By.name("button3"));
        element.click();

        Alert alert = driver.switchTo().alert();



        Assertions.assertEquals("O botão 3 foi selecionado.", alert.getText());
        alert.accept();
    }

    @Test
    public void testCliqueBotaoComCSS(){
        WebElement element = driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg.btn-block.button-4"));
        element.click();

        Alert alert = driver.switchTo().alert();


        Assertions.assertEquals("O botão 4 foi selecionado.", alert.getText());
        alert.accept();

    }

    @Test
    public void testCliqueBotaoComXPATH(){
        WebElement element = driver.findElement(By.xpath("./html/body/div/div/div[1]/div[5]/div/div[2]/button"));
        element.click();

        Alert alert = driver.switchTo().alert();


        Assertions.assertEquals("O botão 5 foi selecionado.", alert.getText());

        alert.accept();
    }

    @Test
    public void testCliqueBotaolIVRE() throws InterruptedException {
        WebElement element1 = driver.findElement(By.id("button6-switch"));
        element1.click();

        Thread.sleep(3000);

        WebElement element2 = driver.findElement(By.id("button6"));
        element2.click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();


        Assertions.assertEquals("O botão 6 foi selecionado.", alert.getText());

        Thread.sleep(3000);

        alert.accept();
    }

    @Test
    public void testCliqueBotaolIVREDesabilitado(){

        WebElement elementBotao = driver.findElement(By.id("button6"));

        Assertions.assertFalse(elementBotao.isEnabled());

    }

    @Test
    public void testCliqueBotaoLinkText(){
        WebElement element = driver.findElement(By.linkText("Link 1"));
        element.click();

        Alert alert = driver.switchTo().alert();



        Assertions.assertEquals("O link 1 foi selecionado.", alert.getText());
        alert.accept();
    }

    @Test
    public void testCliqueBotaoPartialLinkText(){
        WebElement element = driver.findElement(By.partialLinkText("k 2"));
        element.click();

        Alert alert = driver.switchTo().alert();



        Assertions.assertEquals("O link 2 foi selecionado.", alert.getText());
        alert.accept();
    }

    @Test
    public void testCliqueBotaoLivreLink(){
        WebElement element = driver.findElement(By.id("link3"));
        element.click();

        Alert alert = driver.switchTo().alert();



        Assertions.assertEquals("O link 3 foi selecionado.", alert.getText());
        alert.accept();
    }
}
