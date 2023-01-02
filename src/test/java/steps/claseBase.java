package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.iniciarSesion;
import pageObjectModel.inicioPagina;

public class claseBase {
    protected ChromeDriver driver = Hook.getDriver();
    protected inicioPagina inicioPagina = new inicioPagina(driver);
    protected iniciarSesion iniciarSesion = new iniciarSesion(driver);

}
