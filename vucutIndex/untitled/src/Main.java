import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double kilo,boy,indeks;

        System.out.println("Boyunuzu Giriniz: ");
        boy=scan.nextDouble();
        System.out.println("Kilonuzu Giriniz: ");

        kilo=scan.nextDouble();

        indeks=kilo/(boy*boy);
        System.out.println("Vücut kilo Endeksiniz: "+indeks);


    }
}