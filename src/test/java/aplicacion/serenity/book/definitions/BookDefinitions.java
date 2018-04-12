package aplicacion.serenity.book.definitions;

import aplicacion.serenity.book.steps.BookSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class BookDefinitions {

    @Steps
    BookSteps bookSteps;

    @When("enter the amount:$book")
    public void enterDataBook(ExamplesTable book){
        bookSteps.addBook(book);
        bookSteps.clearBook();
        bookSteps.LogoutBook();
    }

    @Then("add book in my cart")
    public void  checkBook(){
    }
}

