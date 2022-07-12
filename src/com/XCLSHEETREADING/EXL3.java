package com.XCLSHEETREADING;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class EXL3 {

    public static void main(String args[]) throws IOException {

        File f2 = new File("D:\\allexcelpdf\\GroupD.xlsx");
        Sheet wf = WorkbookFactory.create(f2).getSheet("Sheet1");
        String name = wf.getRow(20).getCell(1).getStringCellValue();
        System.out.println(name);
        double cum = wf.getRow(20).getCell(2).getNumericCellValue();
        System.out.println(cum);


    }


}
