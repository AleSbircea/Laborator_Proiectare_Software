package Laborator10_Proiectare_software;

import Laborator1_Proiectare_software.Student;
import Laborator5_Proiectare_software.Students.StudentBursieri;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentiInFisierText implements IStudentiExport {
    private String fileName;
    public StudentiInFisierText(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void doExport(List<Student> studenti){
        try {
            Path path = Paths.get(fileName);
            List<String> linesToWrite = new ArrayList<>();
            for (Student s : studenti) {
                linesToWrite.add(s.toString());
            }
            Files.write(path, linesToWrite);
            System.out.println("Exportul in txt a fost realizat!");
        } catch (IOException e) {
            System.err.println();
            e.printStackTrace();
        }
        }
    }

