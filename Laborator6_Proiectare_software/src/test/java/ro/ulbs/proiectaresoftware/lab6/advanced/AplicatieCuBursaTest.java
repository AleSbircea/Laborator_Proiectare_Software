package ro.ulbs.proiectaresoftware.lab6.advanced;
import Laborator5_Proiectare_software.Students.StudentBursieri;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.ulbs.proiectaresoftware.lab6.Laborator6_Proiectare_software_tema.AplicatieCuBursa;
import java.util.ArrayList;
import java.util.List;

public class AplicatieCuBursaTest {
    AplicatieCuBursa appCuBursa = new AplicatieCuBursa();

    @Test
    public void testSorteazaStudenti() {
        List<StudentBursieri> lista = appCuBursa.genereaza();
        List<StudentBursieri> lst = appCuBursa.sorteaza(lista);

        for (int i = 0; i < lst.size() - 1; i++) {
            StudentBursieri s1 = lst.get(i);
            StudentBursieri s2 = lst.get(i + 1);

            int compFormatie = s1.getFormatieDeStudiu().compareTo(s2.getFormatieDeStudiu());
            Assertions.assertTrue(compFormatie <= 0);
            if (compFormatie == 0) {
                Assertions.assertTrue(s1.getNote() >= s2.getNote());
            }
            if (Double.compare(s1.getNote(), s2.getNote()) == 0) {
                Assertions.assertTrue(s1.getCuantumBursa() >= s2.getCuantumBursa());
            }
        }
    }
}