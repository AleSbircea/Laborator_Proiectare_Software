package Laborator10_Proiectare_software;

import Laborator1_Proiectare_software.Student;

import java.util.List;

public class Importer {
    public List<Student> startImport(IStudentiImport strategyInstance) {
        return strategyInstance.doImport();
    }
}
