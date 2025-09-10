package org.nttdata.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.interfaces.CheckoutInterface;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PreguntaMensajeConfirmacion implements Question {


    public static PreguntaMensajeConfirmacion esVisible(){

        return new PreguntaMensajeConfirmacion();
    }


    @Override
    public String answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(CheckoutInterface.MENSAJE_CONFIRMACION, isVisible()).forNoMoreThan(10).seconds()
        );


        return TextContent.of(CheckoutInterface.MENSAJE_CONFIRMACION).answeredBy(actor);
    }

}
