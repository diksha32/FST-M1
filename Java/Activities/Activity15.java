package activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {

    private static String FILE_NAME="C:\\Users\\hp\\IdeaProjects\\TestSheet.xslx";

    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        int rowNum=0;
        Object[][] datatypes = {
                {"DataType","Type","Size(in bytes)"},
                {"int","Primitive",2},
                {"float","Primitive",4},
                {"double","Primitve",8},
                {"char","Primitve",1},
                {"String","Non-Primitive","No fixed size"}
        };

        for(Object[] datatype : datatypes){
            Row row = sheet.createRow(rowNum++);
            int colNum=0;
            for(Object field: datatype){
                Cell cell = row.createCell(colNum++);
                if(field instanceof String){
                    cell.setCellValue((String) field);
                } else if (field instanceof  Integer) {
                    cell.setCellValue((Integer) field);
                }
            }   
        }

        try{
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException ex) {
                System.out.println("Optional file " + FILE_NAME + " was not found.");
        }catch (IOException e) {
                System.out.println("Optional file " + FILE_NAME + " was not found.");
        }
    }
}
