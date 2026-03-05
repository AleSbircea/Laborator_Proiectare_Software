public class Student {
    protected int numarMatricol;
    protected String prenume;
    protected String nume;
    protected String formatieDeStudiu;
    Student(int numarMatricol,String prenume, String nume, String  formatieStudiu){
        this.numarMatricol=numarMatricol;
        this.prenume=prenume;
        this.nume=nume;
        this.formatieDeStudiu=formatieStudiu;
    }
    @Override
    public String toString(){
        return "Student: " + numarMatricol+ ", "  + prenume + ", "  + nume + ", " + formatieDeStudiu+";";
    }

}
