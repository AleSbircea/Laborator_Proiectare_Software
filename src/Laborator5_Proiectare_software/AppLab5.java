package Laborator5_Proiectare_software;

public class AppLab5 {
    public static void main(String[] args) {
        //5.5.1 a
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a)" + result);

        //5.5.1 b
        AdvancedCalculator advCalculator = new AdvancedCalculator(10);
        int result2 = advCalculator.division(5).riseToPower(4).root(2).result();
        System.out.println("b)" + result2);
    }
}
