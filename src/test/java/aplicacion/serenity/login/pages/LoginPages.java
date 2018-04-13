package aplicacion.serenity.login.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;



@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPages extends PageObject {



    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[1]/td[2]/input")
    WebElementFacade textUser;

    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[2]/td[2]/input")
    WebElementFacade textPassword;

    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")
    WebElementFacade btnLogin;

    public WebDriver driver;

	
	
	
public LoginPages(WebDriver driver){
    super(driver);
    this.driver=driver;
}

    public void inUser(ExamplesTable data){
        textUser.type(data.getRow(0).get("user"));
    }

    public void inPassword(ExamplesTable data){
        textPassword.type(data.getRow(0).get("password"));
    }

    public void clickLogin(){
        btnLogin.click();
    }

	
	
}