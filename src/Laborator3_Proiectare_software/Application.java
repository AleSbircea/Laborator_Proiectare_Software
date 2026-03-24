package Laborator3_Proiectare_software;
import Laborator1_Proiectare_software.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {


//pb 3.5.1 a si b
        public void printTextFile1(String fileName) throws IOException {
            System.out.println("Parcurgere linie cu linie si adaugare new line dupa fiecare sfarsit de linie:");
            System.out.println();
            String lines=Files.readString(Paths.get(fileName));
            String[] linesSplit = lines.split("\n");
            List<String> linesToWrite=new ArrayList<>();
            for(String line: linesSplit) {
                System.out.println(line+"\n");
                linesToWrite.add(line);
            }
            //pt c
            try {
                System.out.println("Urmeaza sa scriem textul in fisier...");
                writeTextFile(linesToWrite, "out.txt");
                System.out.println("Textul este scris in fisier!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void printTextFile2(String fileName) throws IOException {
            System.out.println("Parcurgere linie cu linie si adaugare new line dupa fiecare punct:");
            System.out.println();
            String lines=Files.readString(Paths.get(fileName));
            String[] linesSplit = lines.split("\\.");
            List<String> linesToWrite=new ArrayList<>();
            for(String line: linesSplit) {
                System.out.println(line+".\n");
                linesToWrite.add(line);
            }
            //pt c
            try {
                System.out.println("Urmeaza sa scriem textul in fisier...");
                writeTextFile(linesToWrite, "out.txt");
                System.out.println("Textul este scris in fisier!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//pb 3.5.1 c
        public void writeTextFile(List<String> linesToWrite, String fileName) throws IOException {
            Path path = Paths.get(fileName);
            Files.write(path, linesToWrite, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }
//pb 3.5.2
        public void printStudentiSortatiDupaNume(String fileName) throws IOException {
            System.out.println("Lista Studenti Sortati Dupa Nume:");
            Path path = Paths.get(fileName);
            String lines=Files.readString(path);
            String[] listStudents = lines.split("\r\n");
            List<Student> listSortedStudentsByName =new ArrayList<>();
            List<String> linesToWrite=new ArrayList<>();
            for(String line: listStudents) {
                String[] lineSplit = line.split(",");
                Student s=new Student(Integer.parseInt(lineSplit[0]),lineSplit[1],lineSplit[2],lineSplit[3]);
                listSortedStudentsByName.add(s);
            }
            listSortedStudentsByName.sort(Comparator.comparing(Student::getNume));
            for(Student s: listSortedStudentsByName) {
                System.out.println(s);
                linesToWrite.add(String.valueOf(s.getNumarMatricol())+","+s.getPrenume()+","+s.getNume()+","+s.getFormatieDeStudiu());
            }
            try {
                System.out.println("Urmeaza sa scriem textul in fisier...");
                writeTextFile(linesToWrite, "studenti_out.txt");
                System.out.println("Textul este scris in fisier!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//3.5.3-tema
        public void printStudentiSortatiDupaFormatie(String fileName) throws IOException {
            System.out.println("Lista Studenti Sortati Dupa Formatie De Studiu:");
            Path path = Paths.get(fileName);
            String lines=Files.readString(path);
            String[] listStudents = lines.split("\r\n");
            List<Student> listSortedStudentsByFormatie =new ArrayList<>();
            List<String> linesToWrite=new ArrayList<>();
            for(String line: listStudents) {
                String[] lineSplit = line.split(",");
                Student s=new Student(Integer.parseInt(lineSplit[0]),lineSplit[1],lineSplit[2],lineSplit[3]);
                listSortedStudentsByFormatie.add(s);
            }
            listSortedStudentsByFormatie.sort(Comparator.comparing(Student::getFormatieDeStudiu));
            for(Student s: listSortedStudentsByFormatie) {
                System.out.println(s);
                linesToWrite.add(String.valueOf(s.getNumarMatricol())+","+s.getPrenume()+","+s.getNume()+","+s.getFormatieDeStudiu());
            }
            try {
                System.out.println("Urmeaza sa scriem textul in fisier...");
                writeTextFile(linesToWrite, "studenti_out_sorted.txt");
                System.out.println("Textul este scris in fisier!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


}

