package aplicacion.serenity.login.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import aplicacion.serenity.login.steps.LoginSteps;

public class LoginDefinitions {

    @Steps
    LoginSteps loginSteps;


    @Given("como usuario ingreso a la pagina de shi training Site")
    public void enterSite(){
        loginSteps.enterPage();
    }

    @When("ingreso las credenciales:$login")
    public void enterDataLogin(ExamplesTable login){
        loginSteps.inDataLogin(login);
    }

    @Then("ingreso a la pagina prinacipal del sitio")
    public void  checkEnter(){
    }
}
