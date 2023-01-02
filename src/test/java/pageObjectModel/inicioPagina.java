package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class inicioPagina extends clasePrincipal{

    private String titulo= "STORE";
    private By btnInicioSesion = By.id("login2");

    public inicioPagina (WebDriver driver) {
        super(driver);
    }
    public boolean paginaInicioActiva() throws Exception {

        return this.getTitle().equals(titulo);

    }

    public void clickBtnInicioSesion() throws Exception {

        Thread.sleep(2000);
        this.click(btnInicioSesion);
    }



}
