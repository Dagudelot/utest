package co.com.utest.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage {

    public static final Target WELCOME_TITLE = Target.the("welcome title after registration").located( By.cssSelector("h1") );
}
