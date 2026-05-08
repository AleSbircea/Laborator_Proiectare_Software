package Laborator8_Proiectare_software;
import ro.ulbs.proiectare.lab7.StudentImutabil;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class ExcelStudent {
    //metoda care exporta lista/setul din laboratorul 7 si o scrie intr-un excel
    public void exportToExcel(Set<StudentImutabil> studenti, String filePath) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Lista_studenti");
        int rowNum = 0;

        for (StudentImutabil s : studenti) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(s.getNumarMatricol());
            row.createCell(1).setCellValue(s.getPrenume());
            row.createCell(2).setCellValue(s.getNume());
            row.createCell(3).setCellValue(s.getFormatieDeStudiu());
            row.createCell(4).setCellValue(s.getNote());
        }

        try (FileOutputStream out = new FileOutputStream(filePath)) {
            workbook.write(out);
            System.out.println("Fisierul a fost creat cu succes!");
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

        //metoda care citeste din fisier si afiseaza un set/lista
        public  Set<StudentImutabil> readExcelStudent(String filePath) {
            Set<StudentImutabil> studenti = new LinkedHashSet<>();

            try (FileInputStream fis = new FileInputStream(filePath);
                 Workbook workbook = new XSSFWorkbook(fis)) {
                Sheet sheet = workbook.getSheetAt(0);

                for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    if (row == null) continue;
                    int numarMatricol = (int) row.getCell(0).getNumericCellValue();
                    String prenume    = row.getCell(1).getStringCellValue();
                    String nume       = row.getCell(2).getStringCellValue();
                    String formatie   = row.getCell(3).getStringCellValue();
                    double nota       = row.getCell(4).getNumericCellValue();

                    studenti.add(new StudentImutabil(numarMatricol, prenume, nume, formatie, nota));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            return studenti;
        }

    public static void main(String[] args) {
        //a
        Set<StudentImutabil> studenti = new LinkedHashSet<>();
        studenti.add(new StudentImutabil(121, "Iulia", "Popescu", "TI22/1", 10));
        studenti.add(new StudentImutabil(211, "Maria", "Ionescu", "TI22/1", 5));
        studenti.add(new StudentImutabil(131, "Andrei", "Bogdan", "TI22/1",6.5));
        studenti.add(new StudentImutabil(114, "Ema", "Dumitrean", "TI22/2", 8.3));
        studenti.add(new StudentImutabil(127, "Vlad", "Popa", "TI22/2", 7.8));
        ExcelStudent e= new ExcelStudent();
        //e.exportToExcel(studenti, "laborator8_students.xlsx");

        //b
        System.out.println("\nSet studenti cititi din Excel:");

        Set<StudentImutabil> studentiCititi = e.readExcelStudent("laborator8_students.xlsx");
        for (StudentImutabil s : studentiCititi) {
            System.out.println(s);
        }
    }
}
