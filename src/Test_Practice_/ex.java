package Test_Practice_;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class ex {
    public static void main(String args[]) throws IOException {

        File f2 = new File("D:\\allexcelpdf\\test6dynamic.xlsx");
        Sheet wf = WorkbookFactory.create(f2).getSheet("Sheet5");
        String name = wf.getRow(0).getCell(1).getStringCellValue();
        System.out.println(name);


    }


}
