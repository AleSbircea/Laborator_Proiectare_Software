package Laborator10_Proiectare_software;

import Laborator1_Proiectare_software.Student;

import java.util.List;


public class Exporter {
    void startExport(IStudentiExport strategyInstance, List<Student> students){
        strategyInstance.doExport(students);
    }

}
