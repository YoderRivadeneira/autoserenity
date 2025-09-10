package org.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.nttdata.interfaces.CarritoInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TareaCompletarCompra implements Task {

public TareaCompletarCompra (  ){

}

    public static TareaCompletarCompra Checkout() {
        return instrumented(TareaCompletarCompra.class);
    }


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarritoInterface.BOTON_CARRITO),
                Click.on(CarritoInterface.BOTON_CHECKOUT)
        );


    }
    }



