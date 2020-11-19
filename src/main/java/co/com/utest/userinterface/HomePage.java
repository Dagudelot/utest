package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class HomePage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("join button").located( By.className("unauthenticated-nav-bar__sign-up") );
}
