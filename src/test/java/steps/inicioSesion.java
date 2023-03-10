package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class inicioSesion extends claseBase{



    @Given("^El usuario ingresa a la pagina de inicio$")
    public void el_usuario_ingresa_a_la_pagina_de_inicio() throws Throwable {
    Assert.assertTrue(inicioPagina.paginaInicioActiva());

    }
    @When("^Hace clic en el boton de Iniciar sesion$")
    public void hace_clic_en_el_boton_de_Iniciar_sesion() throws Throwable {
       inicioPagina.clickBtnInicioSesion();

    }

    @And("Ingresa el nombre del usuario {string}")
    public void ingresaElNombreDelUsuario(String usuarioIngresado) throws Exception {

        iniciarSesion.ingresarUsuario(usuarioIngresado);
    }

    @And("Ingresa la clave del usuario {string}")
    public void ingresaLaClaveDelUsuario(String clave) throws Exception {

        iniciarSesion.ingresoClave(clave);
        iniciarSesion.btnInicioSesion();

    }

    @Then("Ingresa a su cuenta")
    public void ingresaASuCuenta() throws Exception {
        Thread.sleep(2000);
        Assert.assertTrue("No se inicio sesion correctamente",iniciarSesion.bienvenidaUsuario());
    }

    @And("Hace clic en el menu opcion laptop")
    public void haceClicEnElMenuOpcionLaptop() throws Exception {
        Thread.sleep(5000);
        iniciarSesion.btnLaptopMenu();
    }
}
