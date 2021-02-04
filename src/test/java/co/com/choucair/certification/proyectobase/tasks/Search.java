package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchCertificacionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Performable;

public class Search implements Task {
    private String certificaciones;

    public Search(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public static Search the(String certificaciones) {
        return Tasks.instrumented(Search.class,certificaciones);
    }

    @Override
    public <T extends Actor > void  performAs(T actor){
        actor.attemptsTo(Click.on(SearchCertificacionesPage.BUTTON_UC),
                Enter.theValue(certificaciones).into(SearchCertificacionesPage.INPUT_COURSE),
                Click.on(SearchCertificacionesPage.BUTTON_GO),
                Click.on(SearchCertificacionesPage.SELECT_COURSE)
        );
    }
}
