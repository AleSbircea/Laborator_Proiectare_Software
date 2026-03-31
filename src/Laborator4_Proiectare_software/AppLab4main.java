package Laborator4_Proiectare_software;
import Laborator1_Proiectare_software.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

import static Laborator1_Proiectare_software.Student.gasesteNota;


public class AppLab4main {


    public static void main(String[] args) {
        //pb 4.5.1
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj", "Simina", "Alba-Iulia", "Marius", "Medias", "Mihai", "Cisnadie", "Daniela", "Sibiu");

        System.out.println("Se afiseaza continutul instantei varsta initiala:" + varste);
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        System.out.println("Se afiseaza continutul instantei varsta dupa adaugare:" + varste);

        HashMap<String, Tanar> tineri = new HashMap<>();

        for (String nume : varste.keySet()) {
            int varsta = varste.get(nume);
            String adresa = adrese.get(nume);
            Tanar persoana = new Tanar(nume, varsta, adresa);
            tineri.put(nume, persoana);
        }

        System.out.println("Se afiseaza continutul instantei tineri: " + tineri);


        //pb 4.5.2
        HashMap<String, Student> students = new HashMap<>();
        try {
            citireStudenti("studenti_out_sorted.txt",students);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            citireNoteStudenti("note_anon.txt", students);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //tema_lab4
        double notaM = gasesteNota("Bianca", "Popescu",students);
        double notaN = gasesteNota("Ioan", "Popa", students);
        System.out.println("Verificare note: ");
        System.out.println(notaM);
        System.out.println(notaN);
    }


    public static void citireStudenti(String fileName, HashMap<String, Student> students) throws IOException {
        System.out.println("Using Files.readAllLines:");
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);
        for (String line : allLinesInMemory) {
            String[] date = line.split(",");

            if (date.length >= 4) {
                int nrMatricol = Integer.parseInt(date[0].trim());
                String nume = date[1];
                String prenume = date[2];
                String grupa = date[3];
                Student s = new Student(nrMatricol, nume, prenume, grupa);
                students.put(date[0].trim(), s);
            }

        }
        System.out.println(students);
    }
        public static void citireNoteStudenti (String fileName, HashMap < String, Student > students) throws IOException
        {
            System.out.println("Using Files.readAllLines:");
            Path path = Paths.get(fileName);
            List<String> allLinesInMemory = Files.readAllLines(path);
            for (String line : allLinesInMemory) {
                String[] date = line.split(",");
                if (date.length == 2) {
                    String nrMatricol = date[0];
                    double nota = Double.parseDouble(date[1]);
                    Student s = students.get(nrMatricol);
                    if (s != null) {
                        s.setNote(nota);
                    }
                }

            }
            System.out.println(students);
        }
    }


