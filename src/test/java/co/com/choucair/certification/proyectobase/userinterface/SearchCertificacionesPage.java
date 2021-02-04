package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCertificacionesPage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Selecciona Certificaciones choucair")
            .located(By.xpath("//div[@id='certificaciones']//strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar Certificacion")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Click para buscar Certificación")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Click para seleccionar Certificación")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));

    public static final Target NAME_COURSE = Target.the("Extrae el nombre de la certificación")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
}
