package Laborator3_Proiectare_software;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardOpenOption.*;

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

}
