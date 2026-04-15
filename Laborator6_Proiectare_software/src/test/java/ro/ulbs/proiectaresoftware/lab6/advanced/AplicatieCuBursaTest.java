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
        List<StudentBursieri> lista = new ArrayList<>();
        lista.add( new StudentBursieri(1025,"Andreea","Popescu","ISM141/2", 8.20, 705.50));
        lista.add( new StudentBursieri(1024,"Ioana","Marin","ISM121/1", 9.50, 800.10));
        lista.add( new StudentBursieri(1029,"Bogdan","Ionescu","TI121/1", 9.00, 750.80));
        List<StudentBursieri> lst = appCuBursa.sorteaza(lista);
        Assertions.assertEquals("ISM121/1", lst.get(0).getFormatieDeStudiu());
        Assertions.assertEquals("ISM141/2", lst.get(1).getFormatieDeStudiu());
        Assertions.assertEquals("TI121/1", lst.get(2).getFormatieDeStudiu());
    }

}
