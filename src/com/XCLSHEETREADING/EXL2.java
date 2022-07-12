package com.XCLSHEETREADING;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class EXL2 {
    public static void main(String args[]) throws IOException {


        File f1 = new File("D:\\allexcelpdf\\test1.xlsx");
        Sheet wf = WorkbookFactory.create(f1).getSheet("Sheet1");
        String name1 = wf.getRow(0).getCell(0).getStringCellValue();
        System.out.println(name1);
        boolean booleanvalue = wf.getRow(0).getCell(6).getBooleanCellValue();
        System.out.println(booleanvalue);
        String name2 = wf.getRow(6).getCell(4).getStringCellValue();
        System.out.println(name2);
        String chart = wf.getRow(12).getCell(2).getStringCellValue();
        System.out.println(chart);
        double number1 = wf.getRow(13).getCell(10).getNumericCellValue();
        System.out.println(number1);
        double number2 = wf.getRow(18).getCell(6).getNumericCellValue();
        System.out.println(number2);


    }


}
