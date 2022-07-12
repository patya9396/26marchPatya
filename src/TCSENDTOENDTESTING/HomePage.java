package TCSENDTOENDTESTING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //datmemember
    @FindBy(xpath = "(//span[@class='ng-binding'])[3]")
    private WebElement text;
    @FindBy(xpath = "//a[text()=' Logout']")
    private WebElement logout;

    //constructer
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    //methods
    public void gettext() {

        String actualtext = text.getText();
        String expectetext = "(DT20222537542)";
        if (actualtext.equals(expectetext)) {
            System.out.println("our test case pass");
        } else {
            System.out.println("test case fail");
        }

    }

    public void logoutbutton() {
        logout.click();

    }


}
