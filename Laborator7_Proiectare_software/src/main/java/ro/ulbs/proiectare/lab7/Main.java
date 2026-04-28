package ro.ulbs.proiectare.lab7;

import ro.ulbs.proiectare.lab7.forms.Circle;
import ro.ulbs.proiectare.lab7.forms.Form;
import ro.ulbs.proiectare.lab7.forms.Square;
import ro.ulbs.proiectare.lab7.forms.Triangle;
import ro.ulbs.proiectare.lab7.util.PasswordMaker;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static ro.ulbs.proiectare.lab7.StudentImutabil.imparteInDouaFormatii;

public class Main {
    public static void main(String[] args) {

        // 7.6.1. Contor instante
        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");
        System.out.println("Area = " + tri.getArea()+" details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);
        System.out.println("Total instance count is " + Form.getInstanceCount());   // sau tri.getInstanceCount() sau sq.getInstanceCount()

        //7.6.2 Password maker singleton
        PasswordMaker pm2 = PasswordMaker.getInstance();
        System.out.println("\n7.6.2 a+b) Generated passwords: ");
        System.out.println("1:" + PasswordMaker.getInstance().getPassword());
        System.out.println("2:" + PasswordMaker.getInstance().getPassword());
        System.out.println("3:" + PasswordMaker.getInstance().getPassword());
        System.out.println("4:" + pm2.getPassword());
        System.out.println("5:" + pm2.getPassword());
        System.out.println("\n7.6.2 c) Number of time getInstance() has been called: "+ PasswordMaker.getCallingCounts());
        System.out.println();

        //7.6.3 Tema
        Set<StudentImutabil> sInitiali = new LinkedHashSet<>();
        sInitiali.add(new StudentImutabil(121, "Iulia", "Popescu", "TI22/1", 10));
        sInitiali.add(new StudentImutabil(211, "Maria", "Ionescu", "TI22/1", 5));
        sInitiali.add(new StudentImutabil(131, "Andrei", "Bogdan", "TI22/1",6.5));
        sInitiali.add(new StudentImutabil(114, "Ema", "Dumitrean", "TI22/2", 8.3));
        sInitiali.add(new StudentImutabil(127, "Vlad", "Popa", "TI22/2", 7.8));
        sInitiali.forEach(System.out::println);
        System.out.println();

        Set<StudentImutabil> sImpartiti = StudentImutabil.imparteInDouaFormatii(sInitiali, "TI22/1", "TI22/2");
        System.out.println("VERIFICARE:");
        for (StudentImutabil s : sImpartiti) {
            if (s.getFormatieDeStudiu().equals("TI22/1")) {
                System.out.println("TI22/1 =>" + s);
            } else {
                System.out.println("TI22/2 =>" + s);
            }
        }

    }

}
