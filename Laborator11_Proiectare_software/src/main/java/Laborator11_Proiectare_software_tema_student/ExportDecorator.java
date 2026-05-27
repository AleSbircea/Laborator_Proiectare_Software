package Laborator11_Proiectare_software_tema_student;
import Laborator10_Proiectare_software.IStudentiExport;
import Laborator1_Proiectare_software.Student;
import java.util.List;

public class ExportDecorator implements IStudentiExport {
    protected IStudentiExport wrappedExport;

    public ExportDecorator(IStudentiExport wrappedExport) {
        this.wrappedExport = wrappedExport;
    }
    public void doExport(List<Student> studenti) {
        wrappedExport.doExport(studenti);
    }
}
