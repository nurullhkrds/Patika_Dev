import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int mat,tarih,muzik,kimya,fizik,turkce;
        System.out.print("Merhaba Matematik notunuzu giriniz:");
        mat=scan.nextInt();

        System.out.print("Merhaba tarih notunuzu giriniz:");
        tarih=scan.nextInt();

        System.out.print("Merhaba muzik notunuzu giriniz:");
        muzik=scan.nextInt();

        System.out.print("Merhaba kimya notunuzu giriniz:");
        kimya=scan.nextInt();

        System.out.print("Merhaba fizik notunuzu giriniz:");
        fizik=scan.nextInt();

        System.out.print("Merhaba turkce notunuzu giriniz:");
        turkce=scan.nextInt();

        double ortalama=(mat+muzik+fizik+turkce+tarih+kimya)/6;
        String mesaj=(ortalama>60) ? "Sınıfı geçti":"Sınıfta kaldı";
        System.out.println(mesaj);







    }
}