package Test_Practice_;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class D1 {

    public static void main(String args[]) throws IOException, EncryptedDocumentException {
        File myfile = new File("D:\\allexcelpdf\\test5dynamic.xlsx");

        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
        int rows = mysheet.getLastRowNum();
        int totalnumberofrows = rows;
        System.out.println("total no of rows=" + rows);
        short coloum = mysheet.getRow(rows).getLastCellNum();
        int totalcoloum = coloum - 1;
        ArrayList al = new ArrayList();
        System.out.println("total no of coloum=" + totalcoloum);

        for (int i = 0; i <= totalnumberofrows; i++) {
            for (int j = 0; j <= totalcoloum; j++) {

                Cell type = mysheet.getRow(i).getCell(j);
                CellType dataType = type.getCellType();
                for (int k = 0; k <= al.size() - 1; k++) {


                    if (dataType == CellType.STRING) {
                        String value = type.getStringCellValue();
                        System.out.println(value);

                    } else if (dataType == CellType.BLANK) {

                        System.out.println("");
                    } else if (dataType == CellType.NUMERIC) {
                        double value = type.getNumericCellValue();
                        System.out.println(value);
                    } else if (dataType == CellType.BOOLEAN) {
                        boolean values = type.getBooleanCellValue();
                        System.out.println(values);
                    }
                }


            }
            System.out.println();


        }


    }


}
