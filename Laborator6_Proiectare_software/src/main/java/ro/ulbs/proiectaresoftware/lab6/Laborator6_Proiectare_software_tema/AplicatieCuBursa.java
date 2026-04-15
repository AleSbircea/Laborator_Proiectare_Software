package ro.ulbs.proiectaresoftware.lab6.Laborator6_Proiectare_software_tema;

import Laborator5_Proiectare_software.Students.StudentBursieri;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AplicatieCuBursa {

    static void main(String[] args) {
        AplicatieCuBursa instanta = new AplicatieCuBursa();
        List<StudentBursieri> lista = instanta.genereaza();
        for (StudentBursieri student : lista) {
            System.out.println(student);
        }
        System.out.println("--------------------------------------------------");
        List<StudentBursieri> sortata = instanta.sorteaza(lista);
        for (StudentBursieri student : sortata) {
            System.out.println(student);
        }
    }
    public List<StudentBursieri> genereaza() {
        List<StudentBursieri> lista = new ArrayList<>();
        lista.add( new StudentBursieri(1025,"Andrei","Popa","ISM141/2", 8.70, 725.50));
        lista.add( new StudentBursieri(1024,"Ioan","Mihalcea","ISM141/1", 9.80, 801.10));
        lista.add( new StudentBursieri(1029,"Bianca","Popescu","TI131/1", 9.10, 780.80));
        lista.add( new StudentBursieri(1026,"Anamaria","Prodan","TI131/1", 8.90, 745.50));
        lista.add( new StudentBursieri(1029,"Bianca","Popescu","TI131/1", 9.10, 100.00));
        return lista;
    }
    public List<StudentBursieri> sorteaza(List<StudentBursieri> lst) {
        lst.sort(Comparator.comparing(StudentBursieri::getFormatieDeStudiu)
                .thenComparing(Comparator.comparing(StudentBursieri::getNote).reversed())
                .thenComparing(Comparator.comparing(StudentBursieri::getCuantumBursa).reversed())
                .thenComparing(StudentBursieri::getNumarMatricol)
                .thenComparing(StudentBursieri::getNume)
                .thenComparing(StudentBursieri::getPrenume)
        );
        return lst;
    }
}
