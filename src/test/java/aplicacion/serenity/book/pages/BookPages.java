package aplicacion.serenity.book.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookPages extends PageObject {

    @FindBy(xpath = "//*[@id=\'listing\']/tbody/tr[2]/td[4]/input")
    WebElementFacade numBookOne;

    @FindBy(xpath = "//*[@id=\'listing\']/tbody/tr[3]/td[4]/input")
    WebElementFacade numBookTwo;

    @FindBy(xpath = "//*[@id=\'listing\']/tbody/tr[4]/td[4]/input")
    WebElementFacade numBookThree;

    @FindBy(xpath = "//*[@id=\'available\']/input[1]")
    WebElementFacade clickAdd;

    @FindBy(xpath = "//*[@id=\"available\"]/input[2]")
    WebElementFacade clickClear;

    @FindBy(xpath = "//*[@id=\'available\']/input[3]")
    WebElementFacade clickLogout;

    public WebDriver driver;

public BookPages(WebDriver driver){

    super(driver);
    this.driver=driver;
}
    public void inBookOne(ExamplesTable data){
        numBookOne.type(data.getRow(0).get("bookOne"));
    }

    public void inBookTwo(ExamplesTable data){
        numBookTwo.type(data.getRow(0).get("bookTwo"));
    }

    public void inBookThree(ExamplesTable data){
        numBookThree.type(data.getRow(0).get("bookThree"));
    }

    public void setClickAdd(){
        clickAdd.click();
    }

    public void setClickClear(){
        clickClear.click();
    }

    public void setClickLogout(){
        clickLogout.click();
    }




}
