package org.nttdata.actores;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.nttdata.utils.TestContext;
import org.openqa.selenium.WebDriver;



public class ActorUsuario {

    private static final String NOMBRE_ACTOR = "UsuarioQAYoder";

    private ActorUsuario() {
    }
    public static void inicializar() throws Exception {
        TestContext.initialize();
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled(NOMBRE_ACTOR).can(BrowseTheWeb.with(TestContext.getDriver()));
    }

    public static Actor obtener() {
        return OnStage.theActorCalled(NOMBRE_ACTOR);
    }


    public static void limpiar() {
        TestContext.tearDown();
    }


}
