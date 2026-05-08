package Laborator9_Proiectare_software;

import Laborator1_Proiectare_software.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStudenti {
    public static void main(String[] args) {
        List<Student> studentiCuNote = Arrays.asList(
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
        //pb 9.3.3
        //studenti cu 10
        List<Student> studentiCuZece= studentiCuNote.stream()
                .filter(n->n.getNote()==10)
                .collect(Collectors.toList());
        System.out.println("Sudentii cu nota 10:" + studentiCuZece);

        //studenti sub nota 5
        List<Student> studentiSubCinci= studentiCuNote.stream()
                .filter(n->n.getNote()<5)
                .collect(Collectors.toList());
        System.out.println("Sudentii cu nota sub 5:" + studentiSubCinci);

        //studentii cu note sub 4 au nota rotunjita la 4
        List<Student> studentiRotunjiti= studentiCuNote.stream()
                .map(s -> {
                    if (s.getNote() < 4) {
                        return new Student(s.getNumarMatricol(), s.getPrenume(), s.getNume(), s.getFormatieDeStudiu(), 4.0);
                    }
                    return s;
                })
                .collect(Collectors.toList());
        System.out.println("Studentii cu note sub 4:\n" + studentiRotunjiti );

        //suma notelor
        double sum = studentiRotunjiti.stream()
                .mapToDouble(s->s.getNote())
                .sum();
        System.out.println("Suma notelor este: " + sum);

        //media notelor
        double average =  sum/studentiRotunjiti.size();
        System.out.println("Media notelor este: " + average);
    }
}
