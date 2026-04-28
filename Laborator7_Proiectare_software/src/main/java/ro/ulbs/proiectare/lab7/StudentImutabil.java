package ro.ulbs.proiectare.lab7;
import java.util.*;

public final class StudentImutabil {
    private final int numarMatricol;
    private final String prenume;
    private final String nume;
    private final String formatieDeStudiu;
    private final double note;

    public StudentImutabil(int numarMatricol, String prenume, String nume, String formatieStudiu, double note) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieStudiu;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student: " + numarMatricol + ", " + prenume + ", " + nume + ", " + formatieDeStudiu + "," + note +";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentImutabil student = (StudentImutabil) o;
        return Objects.equals(numarMatricol, student.numarMatricol) &&
                Objects.equals(nume, student.nume) &&
                Objects.equals(prenume, student.prenume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu)&&
                Objects.equals(note, student.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarMatricol, nume, prenume, formatieDeStudiu, note);
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
    static StudentImutabil schimbaFormatia(StudentImutabil student, String nouaFormatieDeStudiu) {
        return new StudentImutabil(
                student.getNumarMatricol(),
                student.getPrenume(),
                student.getNume(),
                nouaFormatieDeStudiu,
                student.getNote()
        );
    }
    static Set<StudentImutabil> imparteInDouaFormatii(Set <StudentImutabil> studenti, String formatia1, String formatia2) {
        Set<StudentImutabil> studentiNoi = new HashSet<>();
        List<StudentImutabil> listaStudenti = new ArrayList<>(studenti);
        int mijloculListei = (listaStudenti.size() + 1) / 2;

        for (int i = 0; i < listaStudenti.size(); i++) {
            StudentImutabil studentiVechi = listaStudenti.get(i);
            String grupaAleasa = (i < mijloculListei) ? formatia1 : formatia2;
            studentiNoi.add(schimbaFormatia(studentiVechi, grupaAleasa));
        }
        return studentiNoi;
    }

}

