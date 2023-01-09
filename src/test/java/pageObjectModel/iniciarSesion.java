package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iniciarSesion extends clasePrincipal{

private By usuario = By.id("loginusername");
private By claveUsuario = By.id("loginpassword");
private By btnIniciarSesion = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
private By bienvenida = By.id("logout2");

private By laptopMenu = By.id("itemc");



    public iniciarSesion (WebDriver driver) {
        super(driver);
    }

    public void ingresarUsuario(String usuarioIngresado) throws Exception {
    Thread.sleep(2000);
     this.click(usuario);
     this.sendKeys(usuario,usuarioIngresado);

    }

    public void ingresoClave(String ClaveIngresada) throws Exception {
        this.click(claveUsuario);
        this.sendKeys(claveUsuario, ClaveIngresada);



    }

    public void btnInicioSesion() throws Exception {

        this.click(btnIniciarSesion);
    }


    public boolean bienvenidaUsuario() throws Exception {
        return this.isDisplayed(bienvenida);
    }

    public void btnLaptopMenu() throws Exception{

        this.scroll(laptopMenu);
        this.click(laptopMenu);
    }
}
