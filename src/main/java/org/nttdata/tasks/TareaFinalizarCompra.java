package org.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.interfaces.CheckoutInterface;
import org.nttdata.interfaces.LoginInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TareaFinalizarCompra implements Task {

    private final String nombre;
    private final String apellido;
    private final String codigoPostal;


    public TareaFinalizarCompra(String nombre, String apellido, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public static TareaFinalizarCompra finalizarCompra(String nombre, String apellido,String codigoPostal) {
        return instrumented(TareaFinalizarCompra.class, nombre, apellido,codigoPostal);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CheckoutInterface.NOMBRE_FIELD),
                Enter.theValue(apellido).into(CheckoutInterface.APELLIDO_FIELD),
                Enter.theValue(codigoPostal).into(CheckoutInterface.CODIGO_POSTAL_FIELD),
                WaitUntil.the(CheckoutInterface.BOTON_CONTINUAR,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckoutInterface.BOTON_CONTINUAR),
                WaitUntil.the(CheckoutInterface.BOTON_FINISH,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckoutInterface.BOTON_FINISH)


                );


    }
}
