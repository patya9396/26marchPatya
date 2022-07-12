package com.Kautomated;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Zerotha {
    public static void main(String[]args) throws IOException {
        File myfile = new File("D:\\allexcelpdf\\kitelogin.xlsx");
        Sheet wf = WorkbookFactory.create(myfile).getSheet("Sheet1");
        String id = wf.getRow(0).getCell(0).getStringCellValue();
        String pass = wf.getRow(0).getCell(1).getStringCellValue();
        String pin = wf.getRow(0).getCell(2).getStringCellValue();
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("");


    }




}
