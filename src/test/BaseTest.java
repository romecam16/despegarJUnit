package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    String ciudad;
    String fechaEntrada;
    String fechaSalida;
    int numeroPersonas;
    String url = "https://www.despegar.com.co/";
    public WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void buscarAlojamiento(String ciudad, String fechaEntrada, String fechaSalida, int numeroPersonas) {

    }

    public void verificarListaResultados(String ciudad) {

    }

    @After
    public void tearDown() {
        driver.quit();

    }
}
