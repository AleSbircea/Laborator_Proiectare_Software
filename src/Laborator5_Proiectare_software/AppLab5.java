package Laborator5_Proiectare_software;

public class AppLab5 {
    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a)" + result);
    }
}
