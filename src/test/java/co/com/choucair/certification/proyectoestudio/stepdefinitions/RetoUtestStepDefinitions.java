package co.com.choucair.certification.proyectoestudio.stepdefinitions;

import co.com.choucair.certification.proyectoestudio.tasks.Go;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RetoUtestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the user want to register$")
    public void theUserWantToRegister() {
        OnStage.theActorCalled("Milena").wasAbleTo(Go.toGooglePage());

    }

    @When("^the user fill form$")
    public void theUserFillForm() {

    }

    @Then("^user registers successfully$")
    public void userRegistersSuccessfully() {

    }
}
