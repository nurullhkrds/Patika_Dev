import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int a;
        int total=0;
        System.out.println("Lütfen çift sayı giriniz : ");


        do{
            a=scan.nextInt();
            if (a%4==0){
                total+=a;
            }

        } while (a%2==0);
        System.out.println("Girilen sayıların toplamı :"+total);

    }
}