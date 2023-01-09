package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.iniciarSesion;
import pageObjectModel.inicioPagina;
import pageObjectModel.registroUsuario;


public class claseBase {
    protected ChromeDriver driver = Hook.getDriver();
    protected inicioPagina inicioPagina = new inicioPagina(driver);
    protected iniciarSesion iniciarSesion = new iniciarSesion(driver);
    protected registroUsuario registroUsuario = new registroUsuario(driver);


}
