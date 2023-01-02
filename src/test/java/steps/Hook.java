package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    private static ChromeDriver driver;
    private static int numeroCaso = 0;

    @Before

    public void abrirNavegador(){

        numeroCaso ++;
        System.out.println("Se esta ejecutando el escenario nro: " + numeroCaso);
        System.setProperty("webbdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
    }

    @After
    public void cerrarNavegador(){

        driver.quit();

    }

    public static  ChromeDriver getDriver(){

        System.out.println("El escenaro nro " + numeroCaso + "se ejecuto correctamente");
        return driver;
    }
}
