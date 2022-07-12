package Test_Practice_;

import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import java.io.File;
import java.io.IOException;


public class ex1 {

    public static void main(String args[]) throws EncryptedDocumentException, IOException {


        File myfile = new File("D:\\allexcelpdf\\test5dynamic.xlsx");
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
        int totalnooftherows = mysheet.getLastRowNum();

        System.out.println("total no of the rows=" + totalnooftherows);
        short totalnumberofcell = mysheet.getRow(totalnooftherows).getLastCellNum();
        int cellcount = totalnumberofcell - 1;
        System.out.println("total no of cell are=" + cellcount);
        for (int i = 0; i <= totalnooftherows; i++) {
            for (int j = 0; j <= cellcount; j++) {

                Cell cellvalue = mysheet.getRow(i).getCell(j);
                CellType datattye = cellvalue.getCellType();

                if (datattye == CellType.STRING) {

                    String value = cellvalue.getStringCellValue();
                    System.out.println(value);

                } else if (datattye == CellType.NUMERIC) {
                    double value = cellvalue.getNumericCellValue();
                    System.out.println(value);
                } else if (datattye == CellType.BOOLEAN) {
                    boolean value = cellvalue.getBooleanCellValue();
                    System.out.println(value);
                } else if (datattye == CellType.BLANK) {
                    System.out.println("");

                }


            }


        }


    }


}
