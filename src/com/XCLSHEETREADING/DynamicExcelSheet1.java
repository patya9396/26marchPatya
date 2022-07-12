package com.XCLSHEETREADING;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class DynamicExcelSheet1 {

    public static void main(String args[]) throws IOException {


        File myfile = new File("D:\\allexcelpdf\\GroupDupdated.xlsx");
        Sheet document = WorkbookFactory.create(myfile).getSheet("Sheet1");
        int rows = document.getLastRowNum();
        int totoalNoOfRow = rows;
        System.out.println("total no of rows will be=" + totoalNoOfRow);
        short coloums = document.getRow(rows).getLastCellNum();
        int totoalnoOfcoloums = coloums - 1;
        System.out.println("total np of coloums=" + totoalnoOfcoloums);

        for (int i = 0; i <= totoalNoOfRow; i++) {
            for (int j = 0; j <= totoalnoOfcoloums; j++) {
                Cell dataType = document.getRow(i).getCell(j);
                CellType celltype = dataType.getCellType();

                if (celltype == CellType.STRING) {
                    String values = dataType.getStringCellValue();
                    System.out.print(values + "                    ");
                } else if (celltype == CellType.NUMERIC) {
                    double value = dataType.getNumericCellValue();
                    System.out.print(value + "                    ");
                } else if (celltype == CellType.BOOLEAN) {
                    boolean value = dataType.getBooleanCellValue();
                    System.out.print(value + "                    ");
                } else if (celltype == CellType.BLANK) {
                    System.out.print("    ");
                }


            }
            System.out.println();


        }


    }


}
