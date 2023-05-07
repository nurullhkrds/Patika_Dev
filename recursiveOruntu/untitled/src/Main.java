import java.util.Scanner;

public class Main {

     static void recursive(int n) {
        if (n <= 0) { // base case
            System.out.println(n);
            return;
        }
        System.out.println(n); // print current value
        recursive(n-5); // recursive call with n-5
        System.out.println(n); // print current value again
        recursive(n+5); // recursive call with n+5
    }





    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        recursive(sayi);




        /*
        girilen sayı = 8
        8 3 -2 3 8

         */

    }
}