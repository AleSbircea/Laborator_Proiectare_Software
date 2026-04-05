package Laborator5_Proiectare_software.Students;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Laborator5_Proiectare_software.Students.StudentBursieri.writeInFile;

public class MainStudents {
    public static void main(String[] args) {
        List<StudentBursieri> bursieri = new ArrayList<>();
        bursieri.add(new StudentBursieri(1025, "Andrei", "Popa", "ISM141/2", 8.70, 725.50));
        bursieri.add(new StudentBursieri(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80, 801.10));
        bursieri.add(new StudentBursieri(1026, "Anamaria", "Prodan", "TI131/1", 8.90, 745.50));
        bursieri.add(new StudentBursieri(1029, "Bianca", "Popescu", "TI131/1,", 9.10, 780.80));

        try {
            System.out.println("Urmeaza sa scriem textul in fisier...");
            writeInFile(bursieri, "bursieri_out.txt");
            System.out.println("Textul este scris in fisier!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
