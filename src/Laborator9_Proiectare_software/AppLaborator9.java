package Laborator9_Proiectare_software;


import org.apache.poi.ss.formula.functions.T;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.apache.poi.sl.draw.geom.GuideIf.Op.max;
import static org.apache.poi.sl.draw.geom.GuideIf.Op.min;


public class AppLaborator9 {
    public static void main(String[] args) {

        //problema 9.3.1
        List<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();
        numbers = IntStream.range(0, 10)
                .map(i -> 5 + rand.nextInt(21))
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Numerele generate random sunt:" + numbers);

        //suma nr
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma numerelor este: " + sum);

        //min si max
        Optional<Integer> minim =  numbers.stream().min(Comparator.naturalOrder());
        Optional<Integer> maxim =  numbers.stream().max(Comparator.naturalOrder());
        System.out.println("Minimul numerelor este: " + minim.orElse(0));
        System.out.println("Maximul numerelor este: " + maxim.orElse(0));

        //numere mai mari ca 10 si mai mici ca 20
        List<Integer> numbersFiltered = numbers.stream()
                        .filter(n->n>10&&n<20)
                                .collect(Collectors.toList());
        System.out.println("Numerele intre 10 si 20 sunt:"+numbersFiltered);

        //maparea listei
        List<Double> numbersMap=numbers.stream()
                .map(n->n.doubleValue())
                        .collect(Collectors.toList());
        System.out.println("Lista de nr mapate: "+numbersMap);

        //gasirea lui 12
        boolean nrDoisprezece = numbers.stream()
                .anyMatch(n -> n == 12);
        System.out.println("Nr doisprezece se afla in lista generata? => " +nrDoisprezece);

    }
}
