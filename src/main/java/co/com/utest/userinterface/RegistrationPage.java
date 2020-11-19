package co.com.utest.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPage {

    public static final Target FIRST_NAME_INPUT         = Target.the("input for the first name").located( By.id("firstName") );
    public static final Target LAST_NAME_INPUT          = Target.the("input for the last name").located( By.id("lastName") );
    public static final Target EMAIL_INPUT              = Target.the("input for email").located( By.id("email") );
    public static final Target PASSWORD_INPUT           = Target.the("input for password").located( By.id("password") );
    public static final Target CONFIRM_PASSWORD_INPUT   = Target.the("input for confirming password").located( By.id("confirmPassword") );
    public static final Target MONTH_OF_BIRTH_SELECT    = Target.the("select for the month of birth").located( By.id("birthMonth") );
    public static final Target DAY_OF_BIRTH_SELECT      = Target.the("select for the day of birth").located( By.id("birthDay") );
    public static final Target YEAR_OF_BIRTH_SELECT     = Target.the("select for the year of birth").located( By.id("birthYear") );
    public static final Target NEXT_LOCATION_BUTTON     = Target.the("NEXT LOCATION button").located( By.cssSelector("a[ng-click='validateBasicInfoStep(userForm);']") );
    public static final Target NEXT_DEVICES_BUTTON      = Target.the("NEXT DEVICES button").located( By.cssSelector("a[ng-click='validateAddressInfoStep(forms.userForm);']") );
    public static final Target NEXT_LAST_STEP_BUTTON    = Target.the("NEXT LAST STEP button").located( By.cssSelector("a[ng-click='validateDevices(userForm);']") );
    public static final Target COMPLETE_SETUP_BUTTON    = Target.the("COMPLETE SETUP button").located( By.cssSelector("a[ng-click='submitForm(userForm);']") );
    public static final Target MOBILE_DEVICE_SELECT     = Target.the("select for the mobile device").located( By.cssSelector("div[name=\"handsetMakerId\"]") );
    public static final Target MOBILE_MODEL_SELECT      = Target.the("select for the mobile model").located( By.cssSelector("div[name=\"handsetModelId\"]") );
    public static final Target MOBILE_OS_SELECT         = Target.the("select for the mobile OS").located( By.cssSelector("div[name=\"handsetOSId\"]") );
    public static final Target TERM_OF_USE_INPUT        = Target.the("term of use input").located( By.id("termOfUse") );
    public static final Target PRIVACY_SETTING_INPUT    = Target.the("privacy setting input").located( By.id("privacySetting") );

    public static Target getMonthOption(String birthMonth) {
        return Target.the("option of the month of birth").located( By.cssSelector("#birthMonth > option[label="+birthMonth+"]") );
    }

    public static Target getDayOption(Integer birthDay) {
        return Target.the("option of the day of birth").located( By.cssSelector("#birthDay > option[label='"+birthDay+"']") );
    }

    public static Target getYearOption(Integer birthYear) {
        return Target.the("option of the year of birth").located( By.cssSelector("#birthYear > option[label='"+birthYear+"']") );
    }

    public static Target getMobileDeviceOption(String mobileDevice) {
        return Target.the("option of the mobile device").located( By.xpath("//*[@role=\"option\"]/span/div[text()='"+mobileDevice+"']") );
    }

    public static Target getMobileModelOption(String mobileModel) {
        return Target.the("option of the mobile model").located( By.xpath("//*[@role=\"option\"]/span/div[text()='"+mobileModel+"']") );
    }

    public static Target getMobileOSOption(String mobileOS) {
        return Target.the("option of the mobile OS").located( By.xpath("//*[@role=\"option\"]/span/div[text()='"+mobileOS+"']") );
    }
}