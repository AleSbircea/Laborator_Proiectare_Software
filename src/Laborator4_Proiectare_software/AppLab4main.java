package Laborator4_Proiectare_software;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class AppLab4main {
    public static void main(String[] args) {
        //pb 4.5.1
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj", "Simina", "Alba-Iulia", "Marius", "Medias", "Mihai", "Cisnadie", "Daniela", "Sibiu");
        HashMap<String, Tanar> tineri;

        System.out.println("Se afiseaza continutul instantei varsta initiala:" + varste);
        varste.put("Vlad",19);
        varste.put("Iulia",19);
        System.out.println("Se afiseaza continutul instantei varsta dupa adaugare:" + varste);

    }
}
