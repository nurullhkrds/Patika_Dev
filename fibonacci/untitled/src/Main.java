import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //a b c a b c
        //1 1 2 3 5 8 13 21......
        Scanner scan=new Scanner(System.in);
        int adim,a=1,b=1,c=0;
        System.out.print("Fibonacci serisinin adım sayısını giriniz: ");
        adim=scan.nextInt();
        System.out.print("1,1,");
        for (int i=1;i<=adim;i++){

           c=a+b;
           a=b;
           b=c;




            System.out.print(c+" ,");
        }


    }
}