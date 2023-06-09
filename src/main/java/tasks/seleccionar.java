package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.url.*;

public class seleccionar implements Task {
    public static seleccionar elementos(){
        return Tasks.instrumented(seleccionar.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MENU_BUTTON,isPresent()).forNoMoreThan(20).seconds(),
                Click.on(MENU_BUTTON),
                Click.on(CAT_BUTTON),
                Click.on(SUBCAT_BUTTON)
        );

    }
}
