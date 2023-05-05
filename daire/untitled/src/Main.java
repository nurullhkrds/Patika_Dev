import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double pi=3.14,cevre,alan,yarıCap;
        Scanner scan=new Scanner(System.in);
        yarıCap= scan.nextDouble();
        cevre=2*pi*yarıCap;
        alan=pi*yarıCap*yarıCap;

            System.out.println("Çevre: "+cevre+" Alan: "+ alan);

    }
}