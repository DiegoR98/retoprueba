package userinterfaces;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.exito.com/")
public class url extends PageObject {
    public static final Target MENU_BUTTON = Target.the("menu")
            .located(By.xpath("//*[@id=\"Trazado_7822\"]"));
    public static final Target CAT_BUTTON = Target.the("categoria")
            .located(By.xpath("//*[@id=\"undefined-nivel2-Celulares y accesorios\"]"));
    public static final Target SUBCAT_BUTTON = Target.the("subcategoria")
            .located(By.xpath("//*[@id=\"Categorías-nivel3-Audifonos\"]"));


}