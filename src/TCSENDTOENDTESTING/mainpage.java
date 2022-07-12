package TCSENDTOENDTESTING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpage {

    //data memeber
    @FindBy(xpath = "//a[text()='Login']")
    private WebElement clic;

    //constructer
    public mainpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickonlog() {
        clic.click();
    }


}
