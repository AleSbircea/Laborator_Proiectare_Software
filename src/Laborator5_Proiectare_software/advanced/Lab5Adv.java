package Laborator5_Proiectare_software.advanced;

public class Lab5Adv {
    public static void main(String[] args) {
        NewIntCalculator calculatorI = new NewIntCalculator(10);
        int result = (Integer) calculatorI.add(5).subtract(3).multiply(2).result();
        System.out.println("2a) " + result);

        DoubleCalculator calculatorD = new DoubleCalculator(10.0);
        double result2 = (Double)calculatorD.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("2b) "+result2);
    }
}
