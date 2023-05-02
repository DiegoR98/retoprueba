package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirPagina;
import tasks.seleccionar;

public class retoStepdefs {
    @Before
    public void iniciarEscenario(){ OnStage.setTheStage(new OnlineCast());
    }

    @Given("que Diego ingresa a exito")
    public void queDiegoIngresaAExito() {
        OnStage.theActorCalled("Diego").wasAbleTo(AbrirPagina.urlApp());
    }

    @When("selecciona los productos")
    public void seleccionaLosProductos() {
        OnStage.theActorInTheSpotlight().attemptsTo(seleccionar.elementos());
    }

    @Then("los productos en el carrito seran igual a los seleccionados")
    public void losProductosEnElCarritoSeranIgualALosSeleccionados() {
    }
}
