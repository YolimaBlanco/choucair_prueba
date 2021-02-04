package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.SearchCertificacionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String questions;

    public Answer(String question){
        this.questions = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(SearchCertificacionesPage.NAME_COURSE).viewedBy(actor).asString();
        if (questions.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

}
