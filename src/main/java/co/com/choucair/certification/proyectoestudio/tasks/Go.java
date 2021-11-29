package co.com.choucair.certification.proyectoestudio.tasks;

import co.com.choucair.certification.proyectoestudio.userinterface.OpenUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Go implements Task {

    private OpenUtest openutest;

    public static Go toGooglePage() {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(Open.browserOn(openutest));
        
    }
}
