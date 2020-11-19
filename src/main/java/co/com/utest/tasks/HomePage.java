package co.com.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class HomePage implements Task {

    public static HomePage openJoinPage() {
        return Tasks.instrumented( HomePage.class );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on( co.com.utest.userinterface.HomePage.JOIN_BUTTON ) );
    }
}
