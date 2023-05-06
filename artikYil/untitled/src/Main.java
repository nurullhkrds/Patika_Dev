import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int yil;
        System.out.print("Yıl Giriniz: ");
        yil=scan.nextInt();

        if(yil%100==0){
            if (yil%400==0){
                System.out.println(yil+" Artık bir yıldır.");
            }
            else
                System.out.println(yil+" Artık bir yıl değildir !.");

        }
        else {
            if (yil%4==0){
                System.out.println(yil+" Artık bir yıldır.");

            }
            else
                System.out.println(yil+" Artık bir yıl değildir !.");

        }


    }
}