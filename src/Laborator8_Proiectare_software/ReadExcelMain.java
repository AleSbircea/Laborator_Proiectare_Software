package Laborator8_Proiectare_software;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcelMain {
    // problema 8.5.1
    public static void readExcel(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING  -> System.out.print(cell.getStringCellValue() + "\t");
                        case NUMERIC -> System.out.print(cell.getNumericCellValue() + "\t");
                        default      -> System.out.print("? \t");
                    }
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //problema 8.5.2
    public static void readExcel2(String filePath) {
        XSSFWorkbook workbookNew = new XSSFWorkbook();
        XSSFSheet sheetNew = workbookNew.createSheet("Average");
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbookOld = new XSSFWorkbook(fis)) {
            Sheet sheet = workbookOld.getSheetAt(0);

            for (Row oldRow : sheet) {
                Row newRow = sheetNew.createRow(oldRow.getRowNum());

                for (Cell oldCell : oldRow) {
                    Cell newCell = newRow.createCell(oldCell.getColumnIndex());
                    switch (oldCell.getCellType()) {
                        case STRING -> newCell.setCellValue(oldCell.getStringCellValue());
                        case NUMERIC -> newCell.setCellValue(oldCell.getNumericCellValue());
                        default -> {
                        }

                    }
                }
                if (oldRow.getRowNum() > 0) {
                    double sum = 0;
                    int count = 0;
                    for (int i = 3; i <= 5; i++) {
                        Cell c = newRow.getCell(i);
                        if (c != null && c.getCellType() == CellType.NUMERIC) {
                            sum += c.getNumericCellValue();
                            count++;
                        }
                    }

                    if (count > 0) {
                        double average = sum / count;
                        newRow.createCell(6).setCellValue(average);
                    }
                }
            }
            try (FileOutputStream fos = new FileOutputStream("laborator8_output2.xlsx")) {
                workbookNew.write(fos);
                System.out.println("Fișierul excel a fost creat cu succes!");

            }
        }catch (IOException e) {
                        e.printStackTrace();
        } finally {
            try {
                workbookNew.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


                //main
                public static void main (String[]args){
                    readExcel("laborator8_input.xlsx");
                    readExcel2("laborator8_input.xlsx");
                }

}