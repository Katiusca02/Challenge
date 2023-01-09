package pageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class registroUsuario extends clasePrincipal{

    private By btnRegistro = By.id("signin2");
    private By usuario = By.id("sign-username");
    private By claveUsuario = By.id("sign-password");

    private By btnRegistroUsuario = By.xpath("/html/body/div[2]/div/div/div[3]/button[2]");

    private String mensaje = "Sign up successful.";

    public registroUsuario(WebDriver driver) {
        super(driver);
    }

    public void btnRegistro() throws Exception {

        this.click(btnRegistro);
    }

    public void setBtnRegistroUsuario() throws Exception {

        this.click(btnRegistroUsuario);
    }

    public void ingresarUsuarioRegistrar(String usuarioIngresado) throws Exception {

        this.click(usuario);
        this.sendKeys(usuario,usuarioIngresado);

    }
    public void ingresarClaveRegistrar(String claveIngresada) throws Exception {

        this.click(claveUsuario);
        this.sendKeys(claveUsuario,claveIngresada);

    }

    public void mensajeAlerta() throws Exception {
        this.aceptarAlerta();

    }
}
