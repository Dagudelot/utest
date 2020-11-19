package co.com.utest.tasks;

import co.com.utest.models.UserData;
import co.com.utest.userinterface.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registration implements Task {

    private final UserData userData;

    public Registration(UserData userData) {
        this.userData = userData;
    }

    public static Registration enterInformation(UserData userData) {
        return Tasks.instrumented( Registration.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue( userData.getFirstName() ).into( RegistrationPage.FIRST_NAME_INPUT ),
                Enter.theValue( userData.getLastName() ).into( RegistrationPage.LAST_NAME_INPUT ),
                Enter.theValue( userData.getEmail() ).into( RegistrationPage.EMAIL_INPUT ),
                Click.on( RegistrationPage.MONTH_OF_BIRTH_SELECT),
                Click.on( RegistrationPage.getMonthOption( userData.getMonthOfBirth() )),
                Click.on( RegistrationPage.DAY_OF_BIRTH_SELECT),
                Click.on( RegistrationPage.getDayOption( userData.getDayOfBirth() )),
                Click.on( RegistrationPage.YEAR_OF_BIRTH_SELECT),
                Click.on( RegistrationPage.getYearOption( userData.getYearOfBirth() )),
                Click.on( RegistrationPage.NEXT_LOCATION_BUTTON ),
                Click.on( RegistrationPage.NEXT_DEVICES_BUTTON ),
                Click.on( RegistrationPage.MOBILE_DEVICE_SELECT ),
                Click.on( RegistrationPage.getMobileDeviceOption( userData.getMobileDevice() ) ),
                Click.on( RegistrationPage.MOBILE_MODEL_SELECT ),
                Click.on( RegistrationPage.getMobileModelOption( userData.getMobileModel() ) ),
                Click.on( RegistrationPage.MOBILE_OS_SELECT ),
                Click.on( RegistrationPage.getMobileOSOption( userData.getMobileOS() ) ),
                Click.on( RegistrationPage.NEXT_LAST_STEP_BUTTON ),
                Enter.theValue( userData.getPassword() ).into( RegistrationPage.PASSWORD_INPUT ),
                Enter.theValue( userData.getPassword() ).into( RegistrationPage.CONFIRM_PASSWORD_INPUT ),
                Click.on( RegistrationPage.TERM_OF_USE_INPUT ),
                Click.on( RegistrationPage.PRIVACY_SETTING_INPUT ),
                Click.on( RegistrationPage.COMPLETE_SETUP_BUTTON )
        );
    }
}
