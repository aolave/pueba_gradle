package aplicacion.serenity.book.steps;

import aplicacion.serenity.book.pages.BookPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class BookSteps extends ScenarioSteps {

    BookPages bookPages=new BookPages(getDriver());

    public BookSteps(Pages pages){
        super(pages);
    }

    @Step
    public void addBook(ExamplesTable data){
        bookPages.inBookOne(data);
        bookPages.inBookTwo(data);
        bookPages.inBookThree(data);
        bookPages.setClickAdd();
    }

    @Step
    public void clearBook(){
        bookPages.setClickClear();
    }

    @Step
    public void LogoutBook(){
        bookPages.setClickLogout();
    }

}


