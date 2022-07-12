package com.XCLSHEETREADING;

import com.Code.Screen;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CodeForDynamicSheet {

    public static void main(String args[]) throws IOException {

        File myfile = new File("D:\\allexcelpdf\\test6.xlsx");
        Sheet wf = WorkbookFactory.create(myfile).getSheet("Sheet3");
        int noofrows = wf.getLastRowNum();
        int totalrows = noofrows;
        System.out.println("total no of row" + totalrows);

        short noofcoloum = wf.getRow(totalrows).getLastCellNum();
        int totalcoloum = noofcoloum - 1;
        System.out.println("total no of coloum" + totalcoloum);


        for (int i = 0; i <= totalrows; i++) {

            for (int j = 0; j <= totalcoloum; j++) {

                Cell values = wf.getRow(i).getCell(j);
                CellType type = values.getCellType();
                if (type == CellType.STRING) {

                    Object string = values.getStringCellValue();
                    System.out.print(string + " ");
                } else if (type == CellType.NUMERIC) {
                    double number = values.getNumericCellValue();
                    System.out.print(number + " ");
                } else if (type == CellType.BOOLEAN) {
                    boolean bole = values.getBooleanCellValue();
                    System.out.print(bole);

                } else if (type == CellType.BLANK) {
                    System.out.print(" ");

                }


            }
            System.out.println();


        }


    }


}
