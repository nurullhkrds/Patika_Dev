import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double armutKg=2.14,elmaKg=3.67,domatesKg=1.11,muzKg=0.95,patlicanKg=5,total,armut,elma,domates,muz,patlican;

        Scanner scan=new Scanner(System.in);
        System.out.print("Armut kaç kilo ? :");
        armut= scan.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        elma= scan.nextDouble();
        System.out.print("domates kaç kilo ? :");
        domates= scan.nextDouble();
        System.out.print("muz kaç kilo ? :");
        muz= scan.nextDouble();
        System.out.print("patlıcan kaç kilo ? :");
        patlican= scan.nextDouble();

        total=armutKg*armut+elmaKg*elma+patlicanKg*patlican+muzKg*muz+domatesKg*domates;
        System.out.print("Toplam tutar: "+total);



    }
}