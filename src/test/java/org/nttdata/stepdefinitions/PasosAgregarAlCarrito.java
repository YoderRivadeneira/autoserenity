package org.nttdata.stepdefinitions;

import io.cucumber.java.en.When;
import org.nttdata.actores.ActorUsuario;
import org.nttdata.tasks.TareaDeAgregarAlCarrito;
import org.nttdata.tasks.TareaDeLogin;
import java.util.Arrays;

public class PasosAgregarAlCarrito {

    @When("el usuario agrega dos productos al carrito")
    public void elUsuarioAgregaDosProductosAlCarrito() throws InterruptedException {
        ActorUsuario.obtener().attemptsTo(
                TareaDeAgregarAlCarrito.agregarProductos(Arrays.asList("Sauce Labs Backpack", "Sauce Labs Bike Light"))

        );
        Thread.sleep(10000);

    }
}
