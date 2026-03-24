
package Laborator3_Proiectare_software;
import Laborator3_Proiectare_software.Application;
import java.io.IOException;


public class MainLab3 {
    public static void main(String[] args) {
        Application app = new Application();
        try {
            app.printTextFile1("in.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            app.printTextFile2("in.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
