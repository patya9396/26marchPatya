package TCSENDTOENDTESTING;

import com.Code.Screen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Testclass {
    public static void main(String args[]) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://nextstep.tcs.com/campus/#/");
        Thread.sleep(20000);
        mainpage page = new mainpage(driver);
        Screen.Ss(driver);
        page.clickonlog();
        Thread.sleep(20000);
        LoginPage login = new LoginPage(driver);
        login.emailid();
        login.passwared();
        login.loginbutton();
        Screen.Ss(driver);
        Thread.sleep(20000);
        HomePage home = new HomePage(driver);
        home.gettext();
        Screen.Ss(driver);
        home.logoutbutton();
        driver.close();


    }


}
