package co.com.utest.stepdefinitions;

import co.com.utest.models.AnswerData;
import co.com.utest.models.UserData;
import co.com.utest.questions.Answer;
import co.com.utest.tasks.HomePage;
import co.com.utest.tasks.OpenUp;
import co.com.utest.tasks.Registration;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegistrationStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage( new OnlineCast() );
    }

    @Given("^that Daniel is on the registration page$")
    public void thatDanielIsOnTheHomePage() {
        OnStage.theActorCalled("Daniel").wasAbleTo( OpenUp.thePage(), HomePage.openJoinPage() );
    }

    @When("^he enters his information$")
    public void heEntersHisInformation(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().attemptsTo( Registration.enterInformation( userData.get(0) ) );
    }

    @Then("^he access to the platform$")
    public void heAccessToThePlatform(List<AnswerData> answerData) {
        OnStage.theActorInTheSpotlight().should( GivenWhenThen.seeThat( Answer.toThe( answerData.get(0).getWelcomeTitle() ) ) );
    }
}
