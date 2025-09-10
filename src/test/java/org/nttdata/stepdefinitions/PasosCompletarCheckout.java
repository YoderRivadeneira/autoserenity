package org.nttdata.stepdefinitions;

import io.cucumber.java.en.And;
import org.nttdata.actores.ActorUsuario;
import org.nttdata.tasks.TareaCompletarCompra;

public class PasosCompletarCheckout {


    @And("procede al checkout de los productos agregados al carrito")
    public void procedeAlCheckout() throws InterruptedException  {
        ActorUsuario.obtener().attemptsTo(
                TareaCompletarCompra.Checkout()

        );
        Thread.sleep(10000);
    }
}
