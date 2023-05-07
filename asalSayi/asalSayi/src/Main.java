import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int sayac=0;
        int sayi=scan.nextInt();
        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println(sayi+" Bir asal Sayıdır.");
        }
        else
            System.out.println(sayi+ " asal sayı değildir.");

    }
}