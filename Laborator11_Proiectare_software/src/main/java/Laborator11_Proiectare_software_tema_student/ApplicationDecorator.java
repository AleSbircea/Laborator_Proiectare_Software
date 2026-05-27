package Laborator11_Proiectare_software_tema_student;

import Laborator10_Proiectare_software.IStudentiExport;
import Laborator10_Proiectare_software.StudentiInConsola;
import Laborator10_Proiectare_software.StudentiInFisierText;
import Laborator10_Proiectare_software.StudentiInFisierXlsx;
import Laborator1_Proiectare_software.Student;
import Laborator11_Proiectare_software_tema_student.TimedExportDecorator;
import java.util.Arrays;
import java.util.List;

public class ApplicationDecorator {
    public static void main(String[] args) {
        List<Student> studenti = Arrays.asList(
                new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70),
                new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10),
                new Student(1026, "Anamaria", "Prodan", "TI131/1", 8.90),
                new Student(1029, "Bianca", "Popescu", "TI131/1", 10),
                new Student(1029, "Maria", "Pana", "TI131/2", 4.10),
                new Student(1029, "Gabriela", "Mohanu", "TI131/2", 7.33),
                new Student(1029, "Marius", "Nasta", "TI131/2", 3.20),
                new Student(1029, "Marius", "Nasta", "TI131/1", 5.12),
                new Student(1029, "Andrei", "Dobrescu", "TI131/2", 2.22)
        );

        List<IStudentiExport> strategies = Arrays.asList(
                new StudentiInConsola(),
                new StudentiInFisierText("studentiStrategyText.txt"),
                new StudentiInFisierXlsx("studentiStrategyExcel.xlsx")
        );

        for (IStudentiExport strategy : strategies) {
            IStudentiExport decorated = new TimedExportDecorator(strategy);
            decorated.doExport(studenti);
        }
    }
}
