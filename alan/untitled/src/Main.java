import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int kenar1,kenar2,kenar3,cevre,u,alan;

        System.out.print("üçgenin Birinci Kenarını Giriniz:");
        kenar1=scan.nextInt();
        System.out.print("üçgenin İkinci Kenarını Giriniz:");
        kenar2=scan.nextInt();
        System.out.print("üçgenin Üçüncü Kenarını Giriniz:");
        kenar3=scan.nextInt();


        u=(kenar1+kenar2+kenar3)/2;
        alan=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        System.out.print("üçgenin alanı :"+alan);








    }
}