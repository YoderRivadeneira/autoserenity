package org.nttdata.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.nttdata.actores.ActorUsuario;
import org.nttdata.tasks.TareaDeLogin;

public class PasosLogin {


    @Before
    public void setUp() throws Exception {
        ActorUsuario.inicializar();
    }

    @After
    public void tearDown() {
        ActorUsuario.limpiar();
    }
    @Given("el usuario se logea con {string} y {string}")
    public void elUsuarioSeLogeaCon(String usuario, String password) throws InterruptedException {
        ActorUsuario.obtener().attemptsTo(
                TareaDeLogin.iniciarSesionconCredenciales(usuario, password)

        );
        Thread.sleep(10000);
    }


}
