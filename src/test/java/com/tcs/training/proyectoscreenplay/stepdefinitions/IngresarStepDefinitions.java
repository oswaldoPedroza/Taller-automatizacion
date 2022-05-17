package com.tcs.training.proyectoscreenplay.stepdefinitions;


import com.tcs.training.proyectoscreenplay.userinterfaces.PageLinio;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class IngresarStepDefinitions {

    PageLinio page;
    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Oswaldo");
    }

    @Given("^el usuario esta en la aplicacion (.*)$")
    public void elUsuarioEstaEnLaAplicacionHttpsWwwLinioComCo(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));

    }


    @When("^el usuario ingresa a la seccion colchones de la categoria Hogar y selecciona un producto con el carrito$")
    public void elUsuarioIngresaALaSeccionColchonesDeLaCategoriaHogarYSeleccionaUnProductoConElCarrito() {

    }

    @When("^el usuario selecciona el producto (.*)x(.*)$")
    public void elUsuarioSeleccionaElProductoSuperMegaComboAzulQueenXResortadoMarshall(int arg1, int arg2) {

    }

    @When("^el usuario agrega productos al carrito de compras (.*)$")
    public void elUsuarioAgregaProductosAlCarritoDeCompras(int arg1) {

    }

    @When("^el usuario elimina el producto seleccionado del carrito de compras(.*)$")
    public void elUsuarioEliminaElProductoSeleccionadoDelCarritoDeCompras() {

    }

    @Then("^el usuario ve el mensaje (.*)$")
    public void elUsuarioVeElMensajeNoHayProductosSeleccionadosEnElCarrito(String mensaje) {

    }

}
