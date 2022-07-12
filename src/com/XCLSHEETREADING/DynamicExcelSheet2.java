package com.XCLSHEETREADING;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class DynamicExcelSheet2 {


    public static void main(String[] args) throws IOException {
        File myfile = new File("D:\\allexcelpdf\\dynamictest9pc.xlsx");
        Sheet document = WorkbookFactory.create(myfile).getSheet("Sheet1");
        int frow = document.getFirstRowNum();
        int fristrow = frow;

        System.out.println("getting frist no row=" + fristrow);
        short celles = document.getRow(frow).getFirstCellNum();
        //int fristcell = celles - 1;
        System.out.println("getting frist no of coloums=" + celles);
        int lnum = document.getLastRowNum();
        int lastnumrow = lnum;
        System.out.println("last no of rows is=" + lastnumrow);
        short rlast = document.getRow(lnum).getLastCellNum();
        int lastcell = rlast - 1;
        System.out.println("last cell is=" + lastcell);
        System.out.println("================================================================");
        for (int i = fristrow; i <= lastnumrow; i++) {
            for (int j = celles; j <= lastcell; j++) {

                Cell dataType = document.getRow(i).getCell(j);
                CellType cellType = dataType.getCellType();
                if (cellType == CellType.STRING) {
                    String values = dataType.getStringCellValue();
                    System.out.print(values + " ");
                } else if (cellType == CellType.BOOLEAN) {
                    boolean values = dataType.getBooleanCellValue();
                    System.out.print(values + " ");
                } else if (cellType == CellType.BLANK) {
                    System.out.print("");
                } else if (cellType == CellType.NUMERIC) {
                    double values = dataType.getNumericCellValue();
                    System.out.print(values + "  ");

                }

            }
            System.out.println();


        }


    }


}
