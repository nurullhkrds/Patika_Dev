import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int girilenSayi,basamak,basamakSayi=0,total=0;

        Scanner scan=new Scanner(System.in);
        girilenSayi=scan.nextInt();

        while(girilenSayi!=0){
            basamak=girilenSayi%10;
            girilenSayi=girilenSayi/10;
            total=basamak+total;

        }
        System.out.println(total);

    }
}