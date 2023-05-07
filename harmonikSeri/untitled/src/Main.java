import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int girilenSayi;
        double toplam=0;
        double pay=1;

        System.out.print("Seri için Bir sayı Giriniz: ");
        girilenSayi=scan.nextInt();
        for (int i=1;i<=girilenSayi;i++){
            toplam=toplam+pay/i;
        }

        System.out.print("Harmonik Seri hesabınız: "+toplam);

    }
}