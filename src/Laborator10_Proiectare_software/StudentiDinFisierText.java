package Laborator10_Proiectare_software;

import Laborator1_Proiectare_software.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentiDinFisierText implements IStudentiImport {
    private String fileName;
    public StudentiDinFisierText(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Student> doImport() {
            List<Student> listaStudenti = new ArrayList<>();
            Path path = Paths.get(fileName);

            try {
                List<String> lines = Files.readAllLines(path);

                for (String line : lines) {
                    String[] data = line.split(",");
                    if (data.length >= 5) {
                        try {
                            int numarMatricol = Integer.parseInt(data[0].trim());
                            String prenume = data[1].trim();
                            String nume = data[2].trim();
                            String formatie = data[3].trim();
                            double nota = Double.parseDouble(data[4].trim());
                            listaStudenti.add(new Student(numarMatricol, prenume, nume, formatie, nota));
                        } catch (NumberFormatException e) {
                            System.err.println();
                        }
                    }
                }
                System.out.println("Importul s-a realizat cu succes!");

            } catch (IOException e) {
                System.err.println();
            }

            return listaStudenti;
        }
    }


