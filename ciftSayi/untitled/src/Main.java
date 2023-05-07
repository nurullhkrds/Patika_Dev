import java.awt.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a,total = 0,sayac = 0;
        double avarage;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        a=scan.nextInt();

        for(int i=0;i<=a;i++){
            if (i%3==0 && i%4==0){
                sayac=sayac+1;
                total+=i;
            }

        }
        avarage=total/sayac;
        System.out.println("Ortalama: "+ avarage);







    }


}