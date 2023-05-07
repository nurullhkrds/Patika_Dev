import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi,total=0;
        System.out.print("Sayı giriniz: ");
        sayi=scan.nextInt();
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                total+=i;

            }
        }
        if (total==sayi){
            System.out.print(sayi+" Bir mükemmel sayidir.");
        }
        else
            System.out.print(sayi+" Bir mükemmel sayi değildir !.");

    }
}