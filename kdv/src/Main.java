import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double kdv=0.18,kdvTutari,kdvliFiyat,tutar;

        System.out.print("Tutarı giriniz:");
        tutar=scan.nextDouble();
        if(tutar>0&&tutar<1000){
            kdvTutari=tutar*kdv;
            kdvliFiyat=tutar+kdvTutari;
        }
        else {
            kdv=0.08;
            kdvTutari=tutar*kdv;
            kdvliFiyat=tutar+kdvTutari;
        }
        System.out.println("KDV TUTARI"+kdvTutari+"KDVLİ FİYAT"+kdvliFiyat);



    }
}