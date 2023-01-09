package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class registrarUsuario extends claseBase{

    @Given("Hace clic en el boton de Inscribirse")
    public void haceClicEnElBotonDeInscribirse() throws Exception {

    registroUsuario.btnRegistro();


    }

    @And("Ingresa su usuario {string}")
    public void ingresaSuUsuario(String usuarioCrear) throws Exception {

        registroUsuario.ingresarUsuarioRegistrar(usuarioCrear);
    }

    @And("Ingresa su clave {string}")
    public void ingresaSuClave(String claveCrear) throws Exception {

        registroUsuario.ingresarClaveRegistrar(claveCrear);
        registroUsuario.setBtnRegistroUsuario();


    }


    @Then("Se registra el usuario exitosamente")
    public void seRegistraElUsuarioExitosamente() throws Exception {

        Thread.sleep(2000);
       registroUsuario.mensajeAlerta();

    }
}
