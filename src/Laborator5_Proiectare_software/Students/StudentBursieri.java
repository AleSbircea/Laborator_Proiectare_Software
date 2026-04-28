package Laborator5_Proiectare_software.Students;

import Laborator1_Proiectare_software.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentBursieri extends Student {
    protected  double cuantumBursa;
    public StudentBursieri(int numarMatricol, String prenume, String nume, String formatieStudiu, double note, double cuantumBursa) {
        super(numarMatricol, prenume, nume, formatieStudiu);
        this.note = note;
        this.cuantumBursa = cuantumBursa;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentBursieri studentBursier = (StudentBursieri) o;
        return Objects.equals(numarMatricol, studentBursier.numarMatricol) &&
                Objects.equals(nume, studentBursier.nume) &&
                Objects.equals(prenume, studentBursier.prenume) &&
                Objects.equals(formatieDeStudiu, studentBursier.formatieDeStudiu)&&
                Objects.equals(note, studentBursier.note)&&
                Objects.equals(cuantumBursa, studentBursier.cuantumBursa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cuantumBursa);
    }

    @Override
    public String toString() {
        return super.toString()+" => "+cuantumBursa+".";
    }

    public static void writeInFile(List<StudentBursieri> sBursieri, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<String> linesToWrite = new ArrayList<>();
        for (StudentBursieri s : sBursieri) {
            linesToWrite.add(s.toString());
        }
        Files.write(path, linesToWrite);
    }
    //adaugare lab6

    public double getCuantumBursa() {
        return cuantumBursa;
    }
}
