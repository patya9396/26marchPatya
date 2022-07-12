package Test_Practice_.Crickbuzz;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class com {


    public static void main(String argg[]) throws IOException, InterruptedException {

        File myfile = new File("D:\\allexcelpdf\\crickbuzz.xlsx");
        Sheet wf = WorkbookFactory.create(myfile).getSheet("Sheet1");
        String url = wf.getRow(0).getCell(0).getStringCellValue();

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(10000);
        List<WebElement> score = driver.findElements(By.xpath("((//div[contains(@class,'b-col cb-col-100 ')])[3] //div)[1]"));
        Iterator<WebElement> allscore = score.iterator();
        while (allscore.hasNext()) {

            String crickbuzzallscore = allscore.next().getText();
            System.out.println(crickbuzzallscore);

        }
        System.out.println("============================================================================================");
        //getting sinle news in cricbuzz
        WebElement news = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-20']//div)[3]"));
        System.out.println(news.getText());
        System.out.println("**************************************************************************************************");
      /*  //getting all news from letest news
        List<WebElement> allnews = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-20']//div)[1]"));
        Iterator<WebElement> gettingallmews = allnews.iterator();
        while (gettingallmews.hasNext()){
            System.out.println(gettingallmews.next().getText());

        }
         //for getting a score board
        System.out.println("===================================================================");
        List<WebElement> n1 = driver.findElements(By.xpath("((//div[contains(@class,'-hm-mtch-crd-width cb-')])[1]//div)[2]"));
        Iterator<WebElement> scoreboard = n1.iterator();
        while (scoreboard.hasNext()){
            System.out.println(scoreboard.next().getText());
        }

                */


    }


}
