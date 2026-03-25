
package Laborator3_Proiectare_software;
import java.io.IOException;


public class MainLab3 {
    public static void main(String[] args) {
        //apeluri pb 3.5.1
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
        //apel 3.5.2
        System.out.println();
        try {
            app.printStudentiSortatiDupaNume("studenti_in.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //apel 3.5.3-tema
        System.out.println();
        try {
            app.printStudentiSortatiDupaFormatie("studenti_out.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
