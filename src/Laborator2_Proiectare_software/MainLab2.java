package Laborator2_Proiectare_software;

import java.util.*;

public class MainLab2 {
    public static void main(String[] args){
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



    }
}
