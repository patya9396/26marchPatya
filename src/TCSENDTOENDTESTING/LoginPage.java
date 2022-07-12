package TCSENDTOENDTESTING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //data member
    @FindBy(xpath = "//input[@name='loginID']")
    private WebElement Email;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement pass;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement loginbutoon;

    //constructer
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    //methods
    public void emailid() {
        Email.sendKeys("cprathmesh1616@gmail.com");
    }

    public void passwared() {
        pass.sendKeys("Pc1616@#");
    }

    public void loginbutton() {
        loginbutoon.click();
    }


}
