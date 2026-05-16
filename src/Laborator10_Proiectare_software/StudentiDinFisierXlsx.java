package Laborator10_Proiectare_software;

import Laborator1_Proiectare_software.Student;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentiDinFisierXlsx implements IStudentiImport {
    private String fileName;
    public StudentiDinFisierXlsx(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public List<Student> doImport() {
        List<Student> listaStudenti = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fileName);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); //

            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;

                int numarMatricol = (int) row.getCell(0).getNumericCellValue();
                String prenume    = row.getCell(1).getStringCellValue();
                String nume       = row.getCell(2).getStringCellValue();
                String formatie   = row.getCell(3).getStringCellValue();
                double nota       = row.getCell(4).getNumericCellValue();

                listaStudenti.add(new Student(numarMatricol, prenume, nume, formatie, nota));
            }
            System.out.println("Importul din Excel a fost finalizat!");

        } catch (IOException e) {
            System.err.println();
        }

        return listaStudenti;
    }
}
