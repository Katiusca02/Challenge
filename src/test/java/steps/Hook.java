package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class Hook {

    private static ChromeDriver driver;
    private DriverManager driverManager;
    private static int numeroCaso = 0;

    @Before

    public void abrirNavegador(){

        numeroCaso ++;
        System.out.println("Se esta ejecutando el escenario nro: " + numeroCaso);
        System.setProperty("webbdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
    }

    @After
    public void cerrarNavegador(Scenario scenario){

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Caso Fallido" );
        }
        driver.quit();

    }

    public static  ChromeDriver getDriver(){

        System.out.println("El escenaro nro " + numeroCaso + "se ejecuto correctamente");
        return driver;
    }
}
