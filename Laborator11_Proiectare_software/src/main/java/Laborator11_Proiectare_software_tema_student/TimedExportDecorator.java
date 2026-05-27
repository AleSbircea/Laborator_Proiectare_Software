package Laborator11_Proiectare_software_tema_student;

import Laborator10_Proiectare_software.IStudentiExport;
import Laborator1_Proiectare_software.Student;

import java.util.List;

public class TimedExportDecorator extends ExportDecorator {
    public TimedExportDecorator(IStudentiExport wrappedExport) {
        super(wrappedExport);
    }

    public void doExport(List<Student> studenti) {
        long start = System.currentTimeMillis();

        wrappedExport.doExport(studenti);
        long end = System.currentTimeMillis();
        System.out.println("Timpul executie pentru " + wrappedExport.getClass().getSimpleName() + " este de " + (end - start) + " ms.");
    }
}
