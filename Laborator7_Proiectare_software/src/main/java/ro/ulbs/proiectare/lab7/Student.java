package ro.ulbs.proiectare.lab7;

import java.util.HashMap;
import java.util.Objects;

public final class Student {
    private final int numarMatricol;
    private final String prenume;
    private final String nume;
    private final String formatieDeStudiu;
    private final double note;

    public Student(int numarMatricol, String prenume, String nume, String formatieStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieStudiu;
        this.note = 1;
    }

    @Override
    public String toString() {
        return "Student: " + numarMatricol + ", " + prenume + ", " + nume + ", " + formatieDeStudiu + "," + note +";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(numarMatricol, student.numarMatricol) &&
                Objects.equals(nume, student.nume) &&
                Objects.equals(prenume, student.prenume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu)&&
                Objects.equals(note, student.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarMatricol, nume, prenume, formatieDeStudiu,note);
    }


    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getNumarMatricol() {
        return numarMatricol;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    public double getNote() {
        return note;
    }

}

