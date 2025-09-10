package org.nttdata.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.nttdata.actores.ActorUsuario;
import org.nttdata.questions.PreguntaMensajeConfirmacion;
import org.nttdata.tasks.TareaFinalizarCompra;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class PasosCompletarCompra {


    @And("completa el formulario de compra con {string}, {string} y {string}")
    public void completaFormularioCon(String nombre, String apellido, String codigoPostal)  throws InterruptedException{
        ActorUsuario.obtener().attemptsTo(TareaFinalizarCompra.finalizarCompra(nombre,apellido,codigoPostal));

        Thread.sleep(10000);
    }

    @Then("el mensaje de compra exitosa debe ser {string}")
    public void elMensajeDeCompraExitosaDebeSer(String mensajeEsperado) {

        ActorUsuario.obtener().should(
                seeThat(
                        "Validación del mensaje de confirmación",actor-> PreguntaMensajeConfirmacion.esVisible().answeredBy(actor).toLowerCase(),containsString(mensajeEsperado.toLowerCase())


                )

        );

    }
}
