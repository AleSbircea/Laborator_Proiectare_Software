package Laborator10_Proiectare_software;

import Laborator1_Proiectare_software.Student;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ro.ulbs.proiectare.lab7.StudentImutabil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class StudentiInFisierXlsx implements IStudentiExport {
    private String fileName;
    public StudentiInFisierXlsx(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void doExport(List<Student> studenti) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet(fileName);
        int rowNum = 0;

        for (Student s : studenti) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(s.getNumarMatricol());
            row.createCell(1).setCellValue(s.getPrenume());
            row.createCell(2).setCellValue(s.getNume());
            row.createCell(3).setCellValue(s.getFormatieDeStudiu());
            row.createCell(4).setCellValue(s.getNote());
        }

        try (FileOutputStream out = new FileOutputStream(fileName)) {
            workbook.write(out);
            System.out.println("Fisierul xlsx a fost creat cu succes!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
