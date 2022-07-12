package com.XCLSHEETREADING;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class exl4 {

    public static void main(String args[]) throws IOException {

        File myfile = new File("D:\\allexcelpdf\\test3.xlsx");

        Sheet wf = WorkbookFactory.create(myfile).getSheet("Sheet2");
        for (int i = 0; i <= 1; i++) {

            for (int j = 0; j <= 3; j++) {
                String allvalues = wf.getRow(i).getCell(j).getStringCellValue();
                System.out.print(allvalues + " ");


            }
            System.out.println();
        }


    }


}
