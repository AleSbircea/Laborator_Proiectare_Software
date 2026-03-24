package Laborator1_Proiectare_software;

import java.util.Objects;

public class Student {
    protected int numarMatricol;
    protected String prenume;
    protected String nume;
    protected String formatieDeStudiu;
    public Student(int numarMatricol,String prenume, String nume, String  formatieStudiu){
        this.numarMatricol=numarMatricol;
        this.prenume=prenume;
        this.nume=nume;
        this.formatieDeStudiu=formatieStudiu;
    }
    @Override
    public String toString(){
        return "Student: " + numarMatricol+ ", "  + prenume + ", "  + nume + ", " + formatieDeStudiu+";";
    }
    public boolean sameStudent(Student student){
        if(this.numarMatricol==student.numarMatricol && this.prenume.equals(student.prenume) && this.nume.equals(student.nume)&& this.formatieDeStudiu.equals(student.formatieDeStudiu)){
            return true;
        }
        return false;
    }
//adaugare lab2
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(numarMatricol, student.numarMatricol) &&
                Objects.equals(nume, student.nume) &&
                Objects.equals(prenume, student.prenume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarMatricol, nume, prenume, formatieDeStudiu);
    }
//adaugare lab3
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
}
