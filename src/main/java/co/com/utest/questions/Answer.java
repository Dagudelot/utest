package co.com.utest.questions;

import co.com.utest.userinterface.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private final String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeTitle = Text.of( WelcomePage.WELCOME_TITLE ).viewedBy( actor ).asString();

        return question.equals(welcomeTitle);
    }
}
