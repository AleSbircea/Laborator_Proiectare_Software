package Laborator2_Proiectare_software;
import Laborator1_Proiectare_software.Student;
import java.util.*;

public class MainLab2 {
    public static void main(String[] args){
        //exercitiul 2.5.1
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        x.add(8);
        x.add(1);
        x.add(4);
        x.add(9);
        x.add(5);

        y.add(2);
        y.add(5);
        y.add(3);
        y.add(6);
        y.add(9);
        y.add(1);
        y.add(7);

        System.out.println(x.toString());
        Collections.sort(x);
        System.out.println(x.toString());
        System.out.println();
        System.out.println(y.toString());
        Collections.sort(y);
        System.out.println(y.toString());
        System.out.println();

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println(xPlusY);
        Collections.sort(xPlusY);
        System.out.println(xPlusY);
        System.out.println();

        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println(zSet);
        System.out.println();

        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println(xMinusY);
        System.out.println();

        for(int i=0;i<xPlusY.size();i++){
            if(xPlusY.get(i)<=p){
                xPlusYLimitedByP.add(xPlusY.get(i));
            }
        }
        System.out.println(xPlusYLimitedByP);

        //exercitiul 2.5.2
        List<Student> students=new ArrayList();
        students.add(new  Student(102, "Ana","Ionescu", "TI22/1"));
        students.add(new Student(120, "Alis", "Popa", "TI21/2"));
        students.add(new Student(112, "Maria", "Popa", "TI21/1"));
        for(Student student:students){
            System.out.println(student);
        }
        for(Student student:students){
            if(student.sameStudent((new Student(120, "Alis", "Popa", "TI21/2")))){
                System.out.println("Studentul este gasit.");
            }
            if(student.sameStudent((new Student(112, "Maria", "Popa", "TI21/1")))){
                System.out.println("Studentul este gasit.");
            }


        }

        //tema
        Set<Student> studentsSet=new HashSet<>(students);;
        studentsSet.addAll(students);
        boolean finds1=studentsSet.contains(new Student(120, "Alis", "Popa", "TI21/2"));
        boolean finds2=studentsSet.contains(new Student(112, "Maria", "Popa", "TI21/1"));
        System.out.println("Studentul Alis este gasit?" + " " + finds1);
        System.out.println("Studentul Maria este gasit?" + " " + finds2);



    }
}
